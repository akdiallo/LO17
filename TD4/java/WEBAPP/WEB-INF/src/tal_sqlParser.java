// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g 2014-01-04 20:06:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "UNE", "FOCUS", "GROSTITRE", "BREVE", "VOIRAUSSI", "PAGE", "ABOUT", "AUTHOR", "NUMBER", "MOIS", "CONJ_AND", "CONJ_OR", "POINT", "WS", "VAR"
    };
    public static final int AUTHOR=13;
    public static final int ABOUT=12;
    public static final int FOCUS=7;
    public static final int UNE=6;
    public static final int VOIRAUSSI=10;
    public static final int POINT=18;
    public static final int NUMBER=14;
    public static final int COUNT=5;
    public static final int EOF=-1;
    public static final int BREVE=9;
    public static final int PAGE=11;
    public static final int WS=19;
    public static final int MOIS=15;
    public static final int CONJ_OR=17;
    public static final int VAR=20;
    public static final int CONJ_AND=16;
    public static final int SELECT=4;
    public static final int GROSTITRE=8;

    // delegates
    // delegators


        public tal_sqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g"; }



    // $ANTLR start "listerequetes"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:22:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:23:25: (r= requete POINT )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:24:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes238);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes240); 

            				lr_arbre = r;
            				sql = lr_arbre.sortArbre();
            			

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return sql;
    }
    // $ANTLR end "listerequetes"


    // $ANTLR start "requete"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:31:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params ) ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token m=null;
        Token SELECT1=null;
        Token AUTHOR2=null;
        Token PAGE3=null;
        Token ABOUT4=null;
        Arbre art = null;

        Arbre ps = null;

        Arbre auth = null;

        Arbre j = null;

        Arbre a = null;


        Arbre ps_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:32:26: ( ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params ) )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params )
            {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params )
            int alt1=27;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:35:3: COUNT art= typearticle ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete271); 
                    pushFollow(FOLLOW_typearticle_in_requete275);
                    art=typearticle();

                    state._fsp--;

                    ABOUT4=(Token)match(input,ABOUT,FOLLOW_ABOUT_in_requete277); 
                    pushFollow(FOLLOW_params_in_requete281);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:45:3: COUNT PAGE ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete290); 
                    PAGE3=(Token)match(input,PAGE,FOLLOW_PAGE_in_requete292); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete294); 
                    pushFollow(FOLLOW_params_in_requete298);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 3 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:52:3: COUNT ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete307); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete309); 
                    pushFollow(FOLLOW_params_in_requete313);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 4 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:60:3: SELECT art= typearticle ABOUT ps= params
                    {
                    SELECT1=(Token)match(input,SELECT,FOLLOW_SELECT_in_requete324); 
                    pushFollow(FOLLOW_typearticle_in_requete328);
                    art=typearticle();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete330); 
                    pushFollow(FOLLOW_params_in_requete334);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 5 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:70:3: SELECT PAGE ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete345); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete347); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete349); 
                    pushFollow(FOLLOW_params_in_requete353);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 6 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:77:3: SELECT ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete362); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete364); 
                    pushFollow(FOLLOW_params_in_requete368);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 7 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:85:3: SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete378); 
                    AUTHOR2=(Token)match(input,AUTHOR,FOLLOW_AUTHOR_in_requete380); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete384);
                    art=typearticle_titreresume();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete386); 
                    pushFollow(FOLLOW_params_in_requete390);
                    ps=params();

                    state._fsp--;


                    		  	//Requete NL:	  Je veux les auteurs des articles parlant du pape
                    			//Normalisation:  $TRASH SELECT1 $TRASH AUTHOR2 $TRASH PAGE3 ABOUT4 $TRASH pape
                    		  	//select distinct email from titreresume,email where mot = 'pape' and titreresume.article = email.article
                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 8 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:99:3: SELECT AUTHOR PAGE ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete399); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete401); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete403); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete405); 
                    pushFollow(FOLLOW_params_in_requete409);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 9 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:107:3: SELECT AUTHOR ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete418); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete420); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete422); 
                    pushFollow(FOLLOW_params_in_requete426);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 10 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:118:3: COUNT art= typearticle AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete442); 
                    pushFollow(FOLLOW_typearticle_in_requete446);
                    art=typearticle();

                    state._fsp--;

                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete448); 
                    pushFollow(FOLLOW_auteur_in_requete452);
                    auth=auteur();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 11 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:128:3: COUNT PAGE AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete461); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete463); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete465); 
                    pushFollow(FOLLOW_auteur_in_requete469);
                    auth=auteur();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 12 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:135:3: COUNT AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete478); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete480); 
                    pushFollow(FOLLOW_auteur_in_requete484);
                    auth=auteur();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 13 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:145:3: COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete500); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete504);
                    art=typearticle_titreresume();

                    state._fsp--;

                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete506); 
                    pushFollow(FOLLOW_auteur_in_requete510);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete512); 
                    pushFollow(FOLLOW_params_in_requete516);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 14 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:159:3: COUNT PAGE AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete525); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete527); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete529); 
                    pushFollow(FOLLOW_auteur_in_requete533);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete535); 
                    pushFollow(FOLLOW_params_in_requete539);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);

                    		

                    }
                    break;
                case 15 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:171:3: COUNT AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete548); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete550); 
                    pushFollow(FOLLOW_auteur_in_requete554);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete556); 
                    pushFollow(FOLLOW_params_in_requete560);
                    ps=params();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email, titreresume WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 16 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:185:3: SELECT PAGE j= jour m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete576); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete578); 
                    pushFollow(FOLLOW_jour_in_requete582);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete586); 
                    pushFollow(FOLLOW_annee_in_requete590);
                    a=annee();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 17 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:197:3: SELECT PAGE j= jour m= MOIS
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete599); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete601); 
                    pushFollow(FOLLOW_jour_in_requete605);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete609); 

                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    		

                    }
                    break;
                case 18 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:206:3: SELECT PAGE m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete620); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete622); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete626); 
                    pushFollow(FOLLOW_annee_in_requete630);
                    a=annee();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 19 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:215:3: SELECT art= typearticle j= jour m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete640); 
                    pushFollow(FOLLOW_typearticle_in_requete644);
                    art=typearticle();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete648);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete652); 
                    pushFollow(FOLLOW_annee_in_requete656);
                    a=annee();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 20 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:230:3: SELECT art= typearticle j= jour m= MOIS
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete665); 
                    pushFollow(FOLLOW_typearticle_in_requete669);
                    art=typearticle();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete673);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete677); 

                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    		

                    }
                    break;
                case 21 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:242:3: SELECT art= typearticle m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete688); 
                    pushFollow(FOLLOW_typearticle_in_requete692);
                    art=typearticle();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete696); 
                    pushFollow(FOLLOW_annee_in_requete700);
                    a=annee();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 22 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:255:3: SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete713); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete717);
                    art=typearticle_titreresume();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete721);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete725); 
                    pushFollow(FOLLOW_annee_in_requete729);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete731); 
                    pushFollow(FOLLOW_params_in_requete735);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 23 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:275:3: SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete744); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete748);
                    art=typearticle_titreresume();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete752);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete756); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete758); 
                    pushFollow(FOLLOW_params_in_requete762);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 24 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:292:3: SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete774); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete778);
                    art=typearticle_titreresume();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete782); 
                    pushFollow(FOLLOW_annee_in_requete786);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete788); 
                    pushFollow(FOLLOW_params_in_requete792);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 25 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:309:3: SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete803); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete805); 
                    pushFollow(FOLLOW_jour_in_requete809);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete813); 
                    pushFollow(FOLLOW_annee_in_requete817);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete819); 
                    pushFollow(FOLLOW_params_in_requete823);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 26 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:326:3: SELECT PAGE j= jour m= MOIS ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete832); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete834); 
                    pushFollow(FOLLOW_jour_in_requete838);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete842); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete844); 
                    pushFollow(FOLLOW_params_in_requete848);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    			req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 27 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:340:3: SELECT PAGE m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete860); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete862); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete866); 
                    pushFollow(FOLLOW_annee_in_requete870);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete872); 
                    pushFollow(FOLLOW_params_in_requete876);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume WHERE"));
                    			req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return req_arbre;
    }
    // $ANTLR end "requete"


    // $ANTLR start "jour"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:356:1: jour returns [Arbre abr = new Arbre(\"\")] : a= NUMBER ;
    public final Arbre jour() throws RecognitionException {
        Arbre abr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:356:42: (a= NUMBER )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:357:2: a= NUMBER
            {
            a=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_jour900); 
             abr.ajouteFils(new Arbre("jj = ", "'"+a.getText()+"'"));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return abr;
    }
    // $ANTLR end "jour"


    // $ANTLR start "annee"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:361:1: annee returns [Arbre abr = new Arbre(\"\")] : a= NUMBER ;
    public final Arbre annee() throws RecognitionException {
        Arbre abr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:361:43: (a= NUMBER )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:362:2: a= NUMBER
            {
            a=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_annee921); 
             abr.ajouteFils(new Arbre("annee = ", "'"+a.getText()+"'"));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return abr;
    }
    // $ANTLR end "annee"


    // $ANTLR start "auteur"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:366:1: auteur returns [Arbre auteurabr = new Arbre(\"\")] : a= VAR ;
    public final Arbre auteur() throws RecognitionException {
        Arbre auteurabr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:366:50: (a= VAR )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:367:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_auteur942); 
             auteurabr.ajouteFils(new Arbre("email LIKE ", "'%"+a.getText()+"%'"));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return auteurabr;
    }
    // $ANTLR end "auteur"


    // $ANTLR start "typearticle"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:371:1: typearticle returns [Arbre abr = new Arbre(\"\")] : ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI );
    public final Arbre typearticle() throws RecognitionException {
        Arbre abr =  new Arbre("");

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:371:49: ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI )
            int alt2=5;
            switch ( input.LA(1) ) {
            case UNE:
                {
                alt2=1;
                }
                break;
            case FOCUS:
                {
                alt2=2;
                }
                break;
            case GROSTITRE:
                {
                alt2=3;
                }
                break;
            case BREVE:
                {
                alt2=4;
                }
                break;
            case VOIRAUSSI:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:372:2: UNE
                    {
                    match(input,UNE,FOLLOW_UNE_in_typearticle959); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'une'"));
                    	

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:376:2: FOCUS
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_typearticle967); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'focus'"));
                    	

                    }
                    break;
                case 3 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:380:2: GROSTITRE
                    {
                    match(input,GROSTITRE,FOLLOW_GROSTITRE_in_typearticle975); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'grostitre'"));
                    	

                    }
                    break;
                case 4 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:384:2: BREVE
                    {
                    match(input,BREVE,FOLLOW_BREVE_in_typearticle983); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'breve'"));
                    	

                    }
                    break;
                case 5 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:388:2: VOIRAUSSI
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_typearticle991); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'voiraussi'"));
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return abr;
    }
    // $ANTLR end "typearticle"


    // $ANTLR start "typearticle_titreresume"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:393:1: typearticle_titreresume returns [Arbre abr = new Arbre(\"\")] : ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI );
    public final Arbre typearticle_titreresume() throws RecognitionException {
        Arbre abr =  new Arbre("");

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:393:61: ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI )
            int alt3=5;
            switch ( input.LA(1) ) {
            case UNE:
                {
                alt3=1;
                }
                break;
            case FOCUS:
                {
                alt3=2;
                }
                break;
            case GROSTITRE:
                {
                alt3=3;
                }
                break;
            case BREVE:
                {
                alt3=4;
                }
                break;
            case VOIRAUSSI:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:394:2: UNE
                    {
                    match(input,UNE,FOLLOW_UNE_in_typearticle_titreresume1007); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'une'"));
                    	

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:398:2: FOCUS
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_typearticle_titreresume1015); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'focus'"));
                    	

                    }
                    break;
                case 3 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:402:2: GROSTITRE
                    {
                    match(input,GROSTITRE,FOLLOW_GROSTITRE_in_typearticle_titreresume1023); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'grostitre'"));
                    	

                    }
                    break;
                case 4 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:406:2: BREVE
                    {
                    match(input,BREVE,FOLLOW_BREVE_in_typearticle_titreresume1031); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'breve'"));
                    	

                    }
                    break;
                case 5 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:410:2: VOIRAUSSI
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_typearticle_titreresume1039); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'voiraussi'"));
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return abr;
    }
    // $ANTLR end "typearticle_titreresume"


    // $ANTLR start "params"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:415:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:416:40: (par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )* )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:417:3: par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )*
            {
            pushFollow(FOLLOW_param_in_params1067);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:421:3: ( ( CONJ_AND )? par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CONJ_AND||LA5_0==VAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:421:4: ( CONJ_AND )? par2= param
            	    {
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:421:4: ( CONJ_AND )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==CONJ_AND) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:421:4: CONJ_AND
            	            {
            	            match(input,CONJ_AND,FOLLOW_CONJ_AND_in_params1074); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_param_in_params1081);
            	    par2=param();

            	    state._fsp--;


            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(new Arbre("", "AND"));
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:426:3: ( ( CONJ_OR )? par2= param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONJ_OR||LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:426:4: ( CONJ_OR )? par2= param
            	    {
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:426:4: ( CONJ_OR )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==CONJ_OR) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:426:4: CONJ_OR
            	            {
            	            match(input,CONJ_OR,FOLLOW_CONJ_OR_in_params1090); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_param_in_params1097);
            	    par2=param();

            	    state._fsp--;


            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(new Arbre("", "OR"));
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return les_pars_arbre;
    }
    // $ANTLR end "params"


    // $ANTLR start "param"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:433:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:433:51: (a= VAR )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:434:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param1119); 
             lepar_arbre.ajouteFils(new Arbre("titreresume.article IN(SELECT article FROM titreresume WHERE mot LIKE", "'%"+a.getText()+"%')"));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lepar_arbre;
    }
    // $ANTLR end "param"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\73\uffff";
    static final String DFA1_eofS =
        "\73\uffff";
    static final String DFA1_minS =
        "\1\4\2\6\1\14\1\uffff\1\24\6\14\1\uffff\1\6\5\14\1\uffff\1\24\1"+
        "\14\1\24\2\uffff\1\16\1\17\3\uffff\1\16\1\17\1\uffff\1\14\2\uffff"+
        "\5\14\10\uffff\1\14\3\uffff\1\14\5\uffff";
    static final String DFA1_maxS =
        "\1\5\3\15\1\uffff\1\24\5\15\1\17\1\uffff\1\14\5\17\1\uffff\1\24"+
        "\1\22\1\24\2\uffff\1\16\1\17\3\uffff\1\16\1\17\1\uffff\1\22\2\uffff"+
        "\5\22\10\uffff\1\22\3\uffff\1\22\5\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\3\7\uffff\1\6\6\uffff\1\2\3\uffff\1\1\1\5\2\uffff\1\10"+
        "\1\11\1\7\2\uffff\1\4\1\uffff\1\17\1\14\5\uffff\1\16\1\13\1\15\1"+
        "\12\1\22\1\33\1\32\1\21\1\uffff\1\25\1\30\1\27\1\uffff\1\24\1\20"+
        "\1\31\1\23\1\26";
    static final String DFA1_specialS =
        "\73\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\1",
            "\1\6\1\7\1\10\1\11\1\12\1\3\1\4\1\5",
            "\1\16\1\17\1\20\1\21\1\22\1\13\1\14\1\15",
            "\1\23\1\24",
            "",
            "\1\25",
            "\1\27\1\26",
            "\1\27\1\26",
            "\1\27\1\26",
            "\1\27\1\26",
            "\1\27\1\26",
            "\1\30\1\uffff\1\32\1\31",
            "",
            "\5\35\1\33\1\34",
            "\1\40\1\uffff\1\37\1\36",
            "\1\40\1\uffff\1\37\1\36",
            "\1\40\1\uffff\1\37\1\36",
            "\1\40\1\uffff\1\37\1\36",
            "\1\40\1\uffff\1\37\1\36",
            "",
            "\1\41",
            "\1\42\5\uffff\1\43",
            "\1\44",
            "",
            "",
            "\1\45",
            "\1\46",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "\1\51\5\uffff\1\52",
            "",
            "",
            "\1\53\5\uffff\1\54",
            "\1\56\5\uffff\1\55",
            "\1\57\1\uffff\1\61\3\uffff\1\60",
            "\1\63\5\uffff\1\62",
            "\1\64\1\uffff\1\65\3\uffff\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\5\uffff\1\67",
            "",
            "",
            "",
            "\1\72\5\uffff\1\71",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params )";
        }
    }
 

    public static final BitSet FOLLOW_requete_in_listerequetes238 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete271 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete277 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete290 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete292 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete307 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete309 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete324 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete328 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete330 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete345 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete349 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete362 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete364 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete380 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete399 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete401 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete405 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete418 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete420 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete422 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete442 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete446 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete448 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete461 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete463 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete480 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete500 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete506 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete510 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete525 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete529 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete533 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_auteur_in_requete554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete556 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete576 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete582 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete599 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete622 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete626 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete640 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete644 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete648 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete665 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete673 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete688 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete713 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete717 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete725 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete729 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete731 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete744 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete748 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete752 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete756 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete758 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete774 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete778 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete788 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete803 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete805 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete813 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete817 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete819 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete832 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete834 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete838 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete842 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete860 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete862 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete866 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete870 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete872 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_requete876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jour900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_annee921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_auteur942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNE_in_typearticle959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOCUS_in_typearticle967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROSTITRE_in_typearticle975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREVE_in_typearticle983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_typearticle991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNE_in_typearticle_titreresume1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOCUS_in_typearticle_titreresume1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROSTITRE_in_typearticle_titreresume1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREVE_in_typearticle_titreresume1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_typearticle_titreresume1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1067 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_CONJ_AND_in_params1074 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_param_in_params1081 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_CONJ_OR_in_params1090 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_param_in_params1097 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_VAR_in_param1119 = new BitSet(new long[]{0x0000000000000002L});

}