// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g 2013-11-22 13:30:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "TITLE", "PAGE", "DATE", "ABOUT", "CONJ", "POINT", "WS", "VAR"
    };
    public static final int ABOUT=9;
    public static final int WS=12;
    public static final int PAGE=7;
    public static final int POINT=11;
    public static final int CONJ=10;
    public static final int VAR=13;
    public static final int COUNT=5;
    public static final int DATE=8;
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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:15:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
    public final String listerequetes() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:16:25: (r= requete POINT )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:17:3: r= requete POINT
            {
            pushFollow(FOLLOW_requete_in_listerequetes142);
            r=requete();

            state._fsp--;

            match(input,POINT,FOLLOW_POINT_in_listerequetes144); 

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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:24:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( TITLE | PAGE ) ( ABOUT | DATE ) ps= params ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Arbre ps = null;


        Arbre ps_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:25:26: ( SELECT ( TITLE | PAGE ) ( ABOUT | DATE ) ps= params )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:26:3: SELECT ( TITLE | PAGE ) ( ABOUT | DATE ) ps= params
            {
            match(input,SELECT,FOLLOW_SELECT_in_requete171); 
            req_arbre.ajouteFils(new Arbre("","select distinct"));
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:27:3: ( TITLE | PAGE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==TITLE) ) {
                alt1=1;
            }
            else if ( (LA1_0==PAGE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:27:4: TITLE
                    {
                    match(input,TITLE,FOLLOW_TITLE_in_requete178); 
                    req_arbre.ajouteFils(new Arbre("","mot"));

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:28:13: PAGE
                    {
                    match(input,PAGE,FOLLOW_PAGE_in_requete194); 
                    req_arbre.ajouteFils(new Arbre("","page"));

                    }
                    break;

            }

            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:30:3: ( ABOUT | DATE )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ABOUT) ) {
                alt2=1;
            }
            else if ( (LA2_0==DATE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:30:4: ABOUT
                    {
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete206); 

                    		req_arbre.ajouteFils(new Arbre("","from titreresume"));
                    		req_arbre.ajouteFils(new Arbre("","where"));
                    		

                    }
                    break;
                case 2 :
                    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:34:4: DATE
                    {
                    match(input,DATE,FOLLOW_DATE_in_requete213); 

                    		req_arbre.ajouteFils(new Arbre("","from datearticle"));
                    		req_arbre.ajouteFils(new Arbre("","where"));
                    		

                    }
                    break;

            }

            pushFollow(FOLLOW_params_in_requete224);
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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:44:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ )? par2= param )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:45:40: (par1= param ( ( CONJ )? par2= param )* )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:46:3: par1= param ( ( CONJ )? par2= param )*
            {
            pushFollow(FOLLOW_param_in_params252);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:50:3: ( ( CONJ )? par2= param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CONJ||LA4_0==VAR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:50:4: ( CONJ )? par2= param
            	    {
            	    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:50:4: ( CONJ )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==CONJ) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:50:4: CONJ
            	            {
            	            match(input,CONJ,FOLLOW_CONJ_in_params259); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_param_in_params266);
            	    par2=param();

            	    state._fsp--;


            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(new Arbre("", "OR"));
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:57:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:57:51: (a= VAR )
            // /Users/Romain/Dropbox/UTC/GI04/LO17/TP/TD4/tal_sql.g:58:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param288); 
             lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));

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


 

    public static final BitSet FOLLOW_requete_in_listerequetes142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_POINT_in_listerequetes144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete171 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_TITLE_in_requete178 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_PAGE_in_requete194 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_ABOUT_in_requete206 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DATE_in_requete213 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_params_in_requete224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params252 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_CONJ_in_params259 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_in_params266 = new BitSet(new long[]{0x0000000000002402L});
    public static final BitSet FOLLOW_VAR_in_param288 = new BitSet(new long[]{0x0000000000000002L});

}