grammar tal_sql;

SELECT : '$SELECT';
COUNT :	'$COUNT';
UNE : '$UNE';
FOCUS 	: '$FOCUS';
GROSTITRE : '$GROSTITRE';
BREVE	: '$BREVE';
VOIRAUSSI : '$VOIRAUSSI';
PAGE : '$PAGE';
ABOUT : '$ABOUT';
AUTHOR 	: '$AUTHOR';
NUMBER : ('0'..'9')+;
MOIS : 'janvier' | 'f思rier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'ao柎' | 'sept' | 'octobre' | 'novembre' | 'd残embre';
CONJ_AND : 'et';
CONJ_OR : 'ou';
POINT : '.';

WS  : (' ' |'\t' | '\r' | '$TRASH') {skip();} | '\n' ;
VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z') +;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
	(
////////////////////////////////////////
		COUNT art=typearticle ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		COUNT PAGE ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		COUNT ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|	
////////////////////////////////////////
		SELECT art=typearticle ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|		
		SELECT PAGE ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
////////////////////////////////////////
		SELECT AUTHOR art=typearticle_titreresume ABOUT ps=params {
		  	//Requete NL:	  Je veux les auteurs des articles parlant du pape
			//Normalisation:  $TRASH $SELECT $TRASH $AUTHOR $TRASH $PAGE $ABOUT $TRASH pape
		  	//select distinct email from titreresume,email where mot = 'pape' and titreresume.article = email.article
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT AUTHOR PAGE ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT AUTHOR ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
////////////////////////////////////////
		//Requete NL:	 Combien articles a 残rit dstraus@tf1.fr
		//Normalisation: $COUNT $PAGE $TRASH $AUTHOR dstraus@tf1.fr
		COUNT art=typearticle AUTHOR auth=auteur {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		COUNT PAGE AUTHOR auth=auteur {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		COUNT AUTHOR auth=auteur {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
////////////////////////////////////////
		//Requete NL:	 Combien articles a 残rit dstraus@tf1.fr parlant du pape
		//Normalisation: $COUNT $PAGE $TRASH $AUTHOR dstraus@tf1.fr $ABOUT $TRASH pape
		COUNT art=typearticle_titreresume AUTHOR auth=auteur ABOUT ps=params {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		COUNT PAGE AUTHOR auth=auteur ABOUT ps=params {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);

		}
	|
		COUNT AUTHOR auth=auteur ABOUT ps=params {
			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
			ps_arbre = $auth.auteurabr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
////////////////////////////////////////
		//Requete NL:	 Donne moi les articles du 9 decembre 2005
		//Normalisation: $COUNT $PAGE $TRASH $AUTHOR dstraus@tf1.fr $ABOUT $TRASH pape
		SELECT PAGE j=jour m=MOIS a=annee {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT PAGE j=jour m=MOIS {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
		}
	|		
		SELECT PAGE m=MOIS a=annee {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
		}
	| ////////////
		SELECT art=typearticle j=jour m=MOIS a=annee {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT art=typearticle j=jour m=MOIS {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
		}
	|		
		SELECT art=typearticle m=MOIS a=annee {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
		}
		
	| //////////// PARLANT DU PAPE
		SELECT art=typearticle_titreresume j=jour m=MOIS a=annee ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
			req_arbre.ajouteFils(new Arbre("","AND"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT art=typearticle_titreresume j=jour m=MOIS ABOUT ps=params  {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
		  	req_arbre.ajouteFils(new Arbre("","AND"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|		
		SELECT art=typearticle_titreresume m=MOIS a=annee ABOUT ps=params  {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
		  	req_arbre.ajouteFils(new Arbre("","AND"));
		  	ps_arbre = $art.abr;
		  	req_arbre.ajouteFils(ps_arbre);
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	| //////////// PAGE PARLANT DU PAPE
		SELECT PAGE j=jour m=MOIS a=annee ABOUT ps=params {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
		  	req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|
		SELECT PAGE j=jour m=MOIS ABOUT ps=params  {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
			req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $j.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	|		
		SELECT PAGE m=MOIS a=annee ABOUT ps=params  {
		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
			req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $a.abr;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("","AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	)
;

jour returns [Arbre abr = new Arbre("")] :
	a = NUMBER
	{ abr.ajouteFils(new Arbre("jj = ", "'"+a.getText()+"'"));}
;

annee returns [Arbre abr = new Arbre("")] :
	a = NUMBER
	{ abr.ajouteFils(new Arbre("annee = ", "'"+a.getText()+"'"));}
;

auteur returns [Arbre auteurabr = new Arbre("")] :
	a = VAR
	{ auteurabr.ajouteFils(new Arbre("email LIKE ", "'%"+a.getText()+"%'"));}
;

typearticle returns [Arbre abr = new Arbre("")] :
	UNE {
		abr.ajouteFils(new Arbre("","rubrique = 'une'"));
	}
	|
	FOCUS {
		abr.ajouteFils(new Arbre("","rubrique = 'focus'"));
	}
	|
	GROSTITRE {
		abr.ajouteFils(new Arbre("","rubrique = 'grostitre'"));
	}
	|
	BREVE {
		abr.ajouteFils(new Arbre("","rubrique = 'breve'"));
	}
	|
	VOIRAUSSI {
		abr.ajouteFils(new Arbre("","rubrique = 'voiraussi'"));
	}
;

typearticle_titreresume returns [Arbre abr = new Arbre("")] :
	UNE {
		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'une'"));
	}
	|
	FOCUS {
		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'focus'"));
	}
	|
	GROSTITRE {
		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'grostitre'"));
	}
	|
	BREVE {
		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'breve'"));
	}
	|
	VOIRAUSSI {
		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'voiraussi'"));
	}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param {
			par1_arbre = $par1.lepar_arbre;
			les_pars_arbre.ajouteFils(par1_arbre);
		}
		(CONJ_AND? par2 = param {
			par2_arbre = $par2.lepar_arbre;
			les_pars_arbre.ajouteFils(new Arbre("", "AND"));
			les_pars_arbre.ajouteFils(par2_arbre);
		})*
		(CONJ_OR? par2 = param {
			par2_arbre = $par2.lepar_arbre;
			les_pars_arbre.ajouteFils(new Arbre("", "OR"));
			les_pars_arbre.ajouteFils(par2_arbre);
		})*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
	//{ lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'%"+a.getText()+"%'"));}
	{ lepar_arbre.ajouteFils(new Arbre("titreresume.article IN(SELECT article FROM titreresume WHERE mot LIKE", "'%"+a.getText()+"%')"));}
;