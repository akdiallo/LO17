// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g 2013-11-29 14:43:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "TITLE", "PAGE", "UNE", "DATE", "ABOUT", "CONJ_AND", "CONJ_OR", "POINT", "WS", "VAR"
    };
    public static final int ABOUT=10;
    public static final int WS=14;
    public static final int UNE=8;
    public static final int PAGE=7;
    public static final int POINT=13;
    public static final int CONJ_OR=12;
    public static final int VAR=15;
    public static final int CONJ_AND=11;
    public static final int COUNT=5;
    public static final int DATE=9;
    public static final int EOF=-1;
    public static final int SELECT=4;
    public static final int TITLE=6;

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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:17:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:18:25: (r= requete POINT )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:19:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes152);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes154); 

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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:26:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT | COUNT ) ( PAGE | UNE ) ( | ABOUT ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;


        Arbre ps_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:27:26: ( ( SELECT | COUNT ) ( PAGE | UNE ) ( | ABOUT ) ps= params )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:28:3: ( SELECT | COUNT ) ( PAGE | UNE ) ( | ABOUT ) ps= params
            {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:28:3: ( SELECT | COUNT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SELECT) ) {
                alt1=1;
            }
            else if ( (LA1_0==COUNT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:29:5: SELECT
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete187); 
                    req_arbre.ajouteFils(new Arbre("","select distinct article"));

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:30:5: COUNT
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete195); 
                    req_arbre.ajouteFils(new Arbre("","select count(*)"));

                    }
                    break;

            }

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:34:3: ( PAGE | UNE )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PAGE) ) {
                alt2=1;
            }
            else if ( (LA2_0==UNE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:35:5: PAGE
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_requete215); 
                    req_arbre.ajouteFils(new Arbre("","from titreresume"));

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:36:5: UNE
                    {
                    match(input,UNE,FOLLOW_UNE_in_requete223); 

                    			req_arbre.ajouteFils(new Arbre("","from titreresume"));
                    			req_arbre.ajouteFils(new Arbre("","where rubrique = 'une'"));

                    }
                    break;

            }

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:41:3: ( | ABOUT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            else if ( (LA3_0==ABOUT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:42:5: 
                    {
                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:42:7: ABOUT
                    {
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete244); 

                    		    req_arbre.ajouteFils(new Arbre("","where"));
                    		  

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete263);
            ps=params();

            state._fsp--;


            			ps_arbre = ps;
            			req_arbre.ajouteFils(ps_arbre);
            		

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


    // $ANTLR start "params"
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:55:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:56:40: (par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )* )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:57:3: par1= param ( ( CONJ_AND )? par2= param )* ( ( CONJ_OR )? par2= param )*
            {
            pushFollow(FOLLOW_param_in_params291);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:61:3: ( ( CONJ_AND )? par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CONJ_AND||LA5_0==VAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:61:4: ( CONJ_AND )? par2= param
            	    {
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:61:4: ( CONJ_AND )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==CONJ_AND) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:61:4: CONJ_AND
            	            {
            	            match(input,CONJ_AND,FOLLOW_CONJ_AND_in_params298); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_param_in_params305);
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

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:66:3: ( ( CONJ_OR )? par2= param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONJ_OR||LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:66:4: ( CONJ_OR )? par2= param
            	    {
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:66:4: ( CONJ_OR )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==CONJ_OR) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:66:4: CONJ_OR
            	            {
            	            match(input,CONJ_OR,FOLLOW_CONJ_OR_in_params314); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_param_in_params321);
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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:73:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:73:51: (a= VAR )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:74:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param343); 
             lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'%"+a.getText()+"%'"));

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


 

    public static final BitSet FOLLOW_requete_in_listerequetes152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_POINT_in_listerequetes154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete187 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_COUNT_in_requete195 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_PAGE_in_requete215 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_UNE_in_requete223 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_ABOUT_in_requete244 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_params_in_requete263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params291 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_CONJ_AND_in_params298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_param_in_params305 = new BitSet(new long[]{0x0000000000009802L});
    public static final BitSet FOLLOW_CONJ_OR_in_params314 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_param_in_params321 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_VAR_in_param343 = new BitSet(new long[]{0x0000000000000002L});

}