// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g 2014-06-14 21:32:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class tal_sqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "COUNT", "UNE", "FOCUS", "GROSTITRE", "BREVE", "VOIRAUSSI", "PAGE", "ABOUT", "AUTHOR", "NUMBER", "MOIS", "CONJ_AND", "CONJ_OR", "WS", "VAR"
    };
    public static final int AUTHOR=13;
    public static final int ABOUT=12;
    public static final int FOCUS=7;
    public static final int UNE=6;
    public static final int VOIRAUSSI=10;
    public static final int NUMBER=14;
    public static final int COUNT=5;
    public static final int EOF=-1;
    public static final int BREVE=9;
    public static final int PAGE=11;
    public static final int WS=18;
    public static final int MOIS=15;
    public static final int CONJ_OR=17;
    public static final int VAR=19;
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
    public String getGrammarFileName() { return "/Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g"; }



    // $ANTLR start "requetesql"
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:22:1: requetesql returns [String sql = \"\"] : r= requete ;
    public final String requetesql() throws RecognitionException {
        String sql =  "";

        Arbre r = null;


        Arbre lr_arbre;
        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:23:25: (r= requete )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:24:3: r= requete
            {
            pushFollow(FOLLOW_requete_in_requetesql231);
            r=requete();

            state._fsp--;


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
    // $ANTLR end "requetesql"


    // $ANTLR start "requete"
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:31:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR AUTHOR PAGE ABOUT ps= params | SELECT PAGE AUTHOR auth= auteur | SELECT AUTHOR ABOUT ps= params | SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params | SELECT PAGE ps1= params ABOUT ABOUT ps2= params ) ;
    public final Arbre requete() throws RecognitionException {
        Arbre req_arbre =  new Arbre("");

        Token m=null;
        Arbre art = null;

        Arbre ps = null;

        Arbre auth = null;

        Arbre a = null;

        Arbre j = null;

        Arbre ps1 = null;

        Arbre ps2 = null;


        Arbre ps_arbre;
        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:32:26: ( ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR AUTHOR PAGE ABOUT ps= params | SELECT PAGE AUTHOR auth= auteur | SELECT AUTHOR ABOUT ps= params | SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params | SELECT PAGE ps1= params ABOUT ABOUT ps2= params ) )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR AUTHOR PAGE ABOUT ps= params | SELECT PAGE AUTHOR auth= auteur | SELECT AUTHOR ABOUT ps= params | SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params | SELECT PAGE ps1= params ABOUT ABOUT ps2= params )
            {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR AUTHOR PAGE ABOUT ps= params | SELECT PAGE AUTHOR auth= auteur | SELECT AUTHOR ABOUT ps= params | SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params | SELECT PAGE ps1= params ABOUT ABOUT ps2= params )
            int alt1=31;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:35:3: COUNT art= typearticle ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete262); 
                    pushFollow(FOLLOW_typearticle_in_requete266);
                    art=typearticle();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete268); 
                    pushFollow(FOLLOW_params_in_requete272);
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:45:3: COUNT PAGE ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete281); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete283); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete285); 
                    pushFollow(FOLLOW_params_in_requete289);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 3 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:52:3: COUNT ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete298); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete300); 
                    pushFollow(FOLLOW_params_in_requete304);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT count(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 4 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:60:3: SELECT art= typearticle ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete315); 
                    pushFollow(FOLLOW_typearticle_in_requete319);
                    art=typearticle();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete321); 
                    pushFollow(FOLLOW_params_in_requete325);
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:70:3: SELECT PAGE ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete336); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete338); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete340); 
                    pushFollow(FOLLOW_params_in_requete344);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 6 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:77:3: SELECT ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete353); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete355); 
                    pushFollow(FOLLOW_params_in_requete359);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 7 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:85:3: SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete369); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete371); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete375);
                    art=typearticle_titreresume();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete377); 
                    pushFollow(FOLLOW_params_in_requete381);
                    ps=params();

                    state._fsp--;


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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:96:3: SELECT AUTHOR PAGE ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete390); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete392); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete394); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete396); 
                    pushFollow(FOLLOW_params_in_requete400);
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:104:3: SELECT AUTHOR AUTHOR PAGE ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete409); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete411); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete413); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete415); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete417); 
                    pushFollow(FOLLOW_params_in_requete421);
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:112:3: SELECT PAGE AUTHOR auth= auteur
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete430); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete432); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete434); 
                    pushFollow(FOLLOW_auteur_in_requete438);
                    auth=auteur();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 11 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:119:3: SELECT AUTHOR ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete447); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete449); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete451); 
                    pushFollow(FOLLOW_params_in_requete455);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct email"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume, email WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 12 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:127:3: SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete464); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete468);
                    art=typearticle_titreresume();

                    state._fsp--;

                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete470); 
                    pushFollow(FOLLOW_auteur_in_requete474);
                    auth=auteur();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete478); 
                    pushFollow(FOLLOW_annee_in_requete482);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete484); 
                    pushFollow(FOLLOW_params_in_requete488);
                    ps=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct datearticle.page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle, titreresume, email WHERE"));
                    		  	req_arbre.ajouteFils(new Arbre("","datearticle.article = titreresume.article"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    		  	ps_arbre = art;
                    		  	req_arbre.ajouteFils(ps_arbre);
                    		  	req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = a;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("","titreresume.article = email.article AND "));
                    			ps_arbre = ps;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 13 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:150:3: COUNT art= typearticle AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete500); 
                    pushFollow(FOLLOW_typearticle_in_requete504);
                    art=typearticle();

                    state._fsp--;

                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete506); 
                    pushFollow(FOLLOW_auteur_in_requete510);
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
                case 14 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:160:3: COUNT PAGE AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete519); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete521); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete523); 
                    pushFollow(FOLLOW_auteur_in_requete527);
                    auth=auteur();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 15 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:167:3: COUNT AUTHOR auth= auteur
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete536); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete538); 
                    pushFollow(FOLLOW_auteur_in_requete542);
                    auth=auteur();

                    state._fsp--;


                    			req_arbre.ajouteFils(new Arbre("","SELECT COUNT(*)"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM email WHERE"));
                    			ps_arbre = auth;
                    			req_arbre.ajouteFils(ps_arbre);
                    		

                    }
                    break;
                case 16 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:176:3: COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete555); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete559);
                    art=typearticle_titreresume();

                    state._fsp--;

                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete561); 
                    pushFollow(FOLLOW_auteur_in_requete565);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete567); 
                    pushFollow(FOLLOW_params_in_requete571);
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
                case 17 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:190:3: COUNT PAGE AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete580); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete582); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete584); 
                    pushFollow(FOLLOW_auteur_in_requete588);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete590); 
                    pushFollow(FOLLOW_params_in_requete594);
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
                case 18 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:202:3: COUNT AUTHOR auth= auteur ABOUT ps= params
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_requete603); 
                    match(input,AUTHOR,FOLLOW_AUTHOR_in_requete605); 
                    pushFollow(FOLLOW_auteur_in_requete609);
                    auth=auteur();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete611); 
                    pushFollow(FOLLOW_params_in_requete615);
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
                case 19 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:214:3: SELECT PAGE j= jour m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete625); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete627); 
                    pushFollow(FOLLOW_jour_in_requete631);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete635); 
                    pushFollow(FOLLOW_annee_in_requete639);
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
                case 20 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:226:3: SELECT PAGE j= jour m= MOIS
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete648); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete650); 
                    pushFollow(FOLLOW_jour_in_requete654);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete658); 

                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM datearticle WHERE"));
                    			ps_arbre = j;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			req_arbre.ajouteFils(new Arbre("mois = ", "'"+m.getText()+"'"));
                    		

                    }
                    break;
                case 21 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:235:3: SELECT PAGE m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete669); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete671); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete675); 
                    pushFollow(FOLLOW_annee_in_requete679);
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
                case 22 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:244:3: SELECT art= typearticle j= jour m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete689); 
                    pushFollow(FOLLOW_typearticle_in_requete693);
                    art=typearticle();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete697);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete701); 
                    pushFollow(FOLLOW_annee_in_requete705);
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
                case 23 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:259:3: SELECT art= typearticle j= jour m= MOIS
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete714); 
                    pushFollow(FOLLOW_typearticle_in_requete718);
                    art=typearticle();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete722);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete726); 

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
                case 24 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:271:3: SELECT art= typearticle m= MOIS a= annee
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete737); 
                    pushFollow(FOLLOW_typearticle_in_requete741);
                    art=typearticle();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete745); 
                    pushFollow(FOLLOW_annee_in_requete749);
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
                case 25 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:284:3: SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete762); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete766);
                    art=typearticle_titreresume();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete770);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete774); 
                    pushFollow(FOLLOW_annee_in_requete778);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete780); 
                    pushFollow(FOLLOW_params_in_requete784);
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
                case 26 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:304:3: SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete793); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete797);
                    art=typearticle_titreresume();

                    state._fsp--;

                    pushFollow(FOLLOW_jour_in_requete801);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete805); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete807); 
                    pushFollow(FOLLOW_params_in_requete811);
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
                case 27 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:321:3: SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete823); 
                    pushFollow(FOLLOW_typearticle_titreresume_in_requete827);
                    art=typearticle_titreresume();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete831); 
                    pushFollow(FOLLOW_annee_in_requete835);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete837); 
                    pushFollow(FOLLOW_params_in_requete841);
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
                case 28 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:338:3: SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete852); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete854); 
                    pushFollow(FOLLOW_jour_in_requete858);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete862); 
                    pushFollow(FOLLOW_annee_in_requete866);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete868); 
                    pushFollow(FOLLOW_params_in_requete872);
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
                case 29 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:355:3: SELECT PAGE j= jour m= MOIS ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete881); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete883); 
                    pushFollow(FOLLOW_jour_in_requete887);
                    j=jour();

                    state._fsp--;

                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete891); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete893); 
                    pushFollow(FOLLOW_params_in_requete897);
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
                case 30 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:369:3: SELECT PAGE m= MOIS a= annee ABOUT ps= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete909); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete911); 
                    m=(Token)match(input,MOIS,FOLLOW_MOIS_in_requete915); 
                    pushFollow(FOLLOW_annee_in_requete919);
                    a=annee();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete921); 
                    pushFollow(FOLLOW_params_in_requete925);
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
                case 31 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:383:3: SELECT PAGE ps1= params ABOUT ABOUT ps2= params
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_requete937); 
                    match(input,PAGE,FOLLOW_PAGE_in_requete939); 
                    pushFollow(FOLLOW_params_in_requete943);
                    ps1=params();

                    state._fsp--;

                    match(input,ABOUT,FOLLOW_ABOUT_in_requete945); 
                    match(input,ABOUT,FOLLOW_ABOUT_in_requete947); 
                    pushFollow(FOLLOW_params_in_requete951);
                    ps2=params();

                    state._fsp--;


                    		  	req_arbre.ajouteFils(new Arbre("","SELECT distinct page"));
                    		  	req_arbre.ajouteFils(new Arbre("","FROM titreresume WHERE"));
                    			ps_arbre = ps1;
                    			req_arbre.ajouteFils(ps_arbre);
                    			req_arbre.ajouteFils(new Arbre("","AND"));
                    			ps_arbre = ps2;
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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:396:1: jour returns [Arbre abr = new Arbre(\"\")] : a= NUMBER ;
    public final Arbre jour() throws RecognitionException {
        Arbre abr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:396:42: (a= NUMBER )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:397:2: a= NUMBER
            {
            a=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_jour978); 
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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:401:1: annee returns [Arbre abr = new Arbre(\"\")] : a= NUMBER ;
    public final Arbre annee() throws RecognitionException {
        Arbre abr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:401:43: (a= NUMBER )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:402:2: a= NUMBER
            {
            a=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_annee999); 
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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:406:1: auteur returns [Arbre auteurabr = new Arbre(\"\")] : a= VAR ;
    public final Arbre auteur() throws RecognitionException {
        Arbre auteurabr =  new Arbre("");

        Token a=null;

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:406:50: (a= VAR )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:407:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_auteur1020); 
             auteurabr.ajouteFils(new Arbre("email = ", "'"+a.getText()+"'"));

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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:411:1: typearticle returns [Arbre abr = new Arbre(\"\")] : ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI );
    public final Arbre typearticle() throws RecognitionException {
        Arbre abr =  new Arbre("");

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:411:49: ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI )
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:412:2: UNE
                    {
                    match(input,UNE,FOLLOW_UNE_in_typearticle1037); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'une'"));
                    	

                    }
                    break;
                case 2 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:416:2: FOCUS
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_typearticle1045); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'focus'"));
                    	

                    }
                    break;
                case 3 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:420:2: GROSTITRE
                    {
                    match(input,GROSTITRE,FOLLOW_GROSTITRE_in_typearticle1053); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'grostitre'"));
                    	

                    }
                    break;
                case 4 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:424:2: BREVE
                    {
                    match(input,BREVE,FOLLOW_BREVE_in_typearticle1061); 

                    		abr.ajouteFils(new Arbre("","rubrique = 'breve'"));
                    	

                    }
                    break;
                case 5 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:428:2: VOIRAUSSI
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_typearticle1069); 

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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:433:1: typearticle_titreresume returns [Arbre abr = new Arbre(\"\")] : ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI );
    public final Arbre typearticle_titreresume() throws RecognitionException {
        Arbre abr =  new Arbre("");

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:433:61: ( UNE | FOCUS | GROSTITRE | BREVE | VOIRAUSSI )
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
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:434:2: UNE
                    {
                    match(input,UNE,FOLLOW_UNE_in_typearticle_titreresume1085); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'une'"));
                    	

                    }
                    break;
                case 2 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:438:2: FOCUS
                    {
                    match(input,FOCUS,FOLLOW_FOCUS_in_typearticle_titreresume1093); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'focus'"));
                    	

                    }
                    break;
                case 3 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:442:2: GROSTITRE
                    {
                    match(input,GROSTITRE,FOLLOW_GROSTITRE_in_typearticle_titreresume1101); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'grostitre'"));
                    	

                    }
                    break;
                case 4 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:446:2: BREVE
                    {
                    match(input,BREVE,FOLLOW_BREVE_in_typearticle_titreresume1109); 

                    		abr.ajouteFils(new Arbre("","titreresume.rubrique = 'breve'"));
                    	

                    }
                    break;
                case 5 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:450:2: VOIRAUSSI
                    {
                    match(input,VOIRAUSSI,FOLLOW_VOIRAUSSI_in_typearticle_titreresume1117); 

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


    // $ANTLR start "conj"
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:455:1: conj returns [Arbre conj_arbre] : ( CONJ_AND | CONJ_OR );
    public final Arbre conj() throws RecognitionException {
        Arbre conj_arbre = null;

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:455:33: ( CONJ_AND | CONJ_OR )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CONJ_AND) ) {
                alt4=1;
            }
            else if ( (LA4_0==CONJ_OR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:456:3: CONJ_AND
                    {
                    match(input,CONJ_AND,FOLLOW_CONJ_AND_in_conj1134); 

                    			conj_arbre = new Arbre("", "AND");
                    		

                    }
                    break;
                case 2 :
                    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:460:3: CONJ_OR
                    {
                    match(input,CONJ_OR,FOLLOW_CONJ_OR_in_conj1144); 

                    			conj_arbre = new Arbre("", "OR");
                    		

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
        return conj_arbre;
    }
    // $ANTLR end "conj"


    // $ANTLR start "param_extract"
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:465:1: param_extract returns [Arbre param_extract_arbre = new Arbre(\"\")] : par1= param (par2= param )* ;
    public final Arbre param_extract() throws RecognitionException {
        Arbre param_extract_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre;
        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:466:40: (par1= param (par2= param )* )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:467:3: par1= param (par2= param )*
            {
            pushFollow(FOLLOW_param_in_param_extract1171);
            par1=param();

            state._fsp--;


            			par1_arbre = par1;
            			param_extract_arbre.ajouteFils(par1_arbre);
            		
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:471:3: (par2= param )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==VAR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:471:4: par2= param
            	    {
            	    pushFollow(FOLLOW_param_in_param_extract1182);
            	    par2=param();

            	    state._fsp--;


            	    			par2_arbre = par2;
            	    			param_extract_arbre.ajouteFils(new Arbre("", "AND"));
            	    			param_extract_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop5;
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
        return param_extract_arbre;
    }
    // $ANTLR end "param_extract"


    // $ANTLR start "params"
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:478:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param_extract (c= conj par2= param_extract )* ;
    public final Arbre params() throws RecognitionException {
        Arbre les_pars_arbre =  new Arbre("");

        Arbre par1 = null;

        Arbre c = null;

        Arbre par2 = null;


        Arbre par1_arbre, par2_arbre, conj_arbre;
        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:479:52: (par1= param_extract (c= conj par2= param_extract )* )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:480:3: par1= param_extract (c= conj par2= param_extract )*
            {
            pushFollow(FOLLOW_param_extract_in_params1212);
            par1=param_extract();

            state._fsp--;


            			par1_arbre = par1;
            			les_pars_arbre.ajouteFils(par1_arbre);
            		
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:484:3: (c= conj par2= param_extract )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=CONJ_AND && LA6_0<=CONJ_OR)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:484:4: c= conj par2= param_extract
            	    {
            	    pushFollow(FOLLOW_conj_in_params1223);
            	    c=conj();

            	    state._fsp--;

            	    pushFollow(FOLLOW_param_extract_in_params1229);
            	    par2=param_extract();

            	    state._fsp--;


            	    			conj_arbre = c;
            	    			par2_arbre = par2;
            	    			les_pars_arbre.ajouteFils(conj_arbre);
            	    			les_pars_arbre.ajouteFils(par2_arbre);
            	    		

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:492:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
    public final Arbre param() throws RecognitionException {
        Arbre lepar_arbre =  new Arbre("");

        Token a=null;

        try {
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:492:51: (a= VAR )
            // /Users/Othmane/Documents/Cours/LO17/TD/tal_sql.g:493:2: a= VAR
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_param1251); 
             lepar_arbre.ajouteFils(new Arbre("titreresume.article IN(SELECT article FROM titreresume WHERE mot = ", "'"+a.getText()+"')"));

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
        "\77\uffff";
    static final String DFA1_eofS =
        "\25\uffff\1\46\17\uffff\1\56\2\uffff\1\60\1\61\1\64\1\67\1\72\10"+
        "\uffff\1\73\3\uffff\1\75\5\uffff";
    static final String DFA1_minS =
        "\1\4\2\6\1\14\1\uffff\1\23\6\14\1\uffff\1\6\5\14\1\uffff\1\23\1"+
        "\14\1\23\3\uffff\1\16\1\17\5\uffff\1\16\1\17\2\uffff\1\14\2\uffff"+
        "\5\14\10\uffff\1\14\3\uffff\1\14\5\uffff";
    static final String DFA1_maxS =
        "\1\5\3\15\1\uffff\1\23\5\15\1\23\1\uffff\1\15\5\17\1\uffff\1\23"+
        "\1\14\1\23\3\uffff\1\16\1\17\5\uffff\1\16\1\17\2\uffff\1\14\2\uffff"+
        "\2\14\1\16\1\14\1\16\10\uffff\1\14\3\uffff\1\14\5\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\3\7\uffff\1\6\6\uffff\1\2\3\uffff\1\1\1\5\1\12\2\uffff"+
        "\1\37\1\10\1\11\1\13\1\7\2\uffff\1\14\1\4\1\uffff\1\17\1\22\5\uffff"+
        "\1\21\1\16\1\20\1\15\1\25\1\36\1\35\1\24\1\uffff\1\33\1\30\1\32"+
        "\1\uffff\1\27\1\23\1\34\1\26\1\31";
    static final String DFA1_specialS =
        "\77\uffff}>";
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
            "\1\30\1\31\1\33\1\32\3\uffff\1\34",
            "",
            "\5\40\1\35\1\37\1\36",
            "\1\44\1\43\1\42\1\41",
            "\1\44\1\43\1\42\1\41",
            "\1\44\1\43\1\42\1\41",
            "\1\44\1\43\1\42\1\41",
            "\1\44\1\43\1\42\1\41",
            "",
            "\1\45",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "",
            "",
            "\1\57",
            "\1\62",
            "\1\63\1\uffff\1\65",
            "\1\66",
            "\1\70\1\uffff\1\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "\1\76",
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
            return "33:2: ( COUNT art= typearticle ABOUT ps= params | COUNT PAGE ABOUT ps= params | COUNT ABOUT ps= params | SELECT art= typearticle ABOUT ps= params | SELECT PAGE ABOUT ps= params | SELECT ABOUT ps= params | SELECT AUTHOR art= typearticle_titreresume ABOUT ps= params | SELECT AUTHOR PAGE ABOUT ps= params | SELECT AUTHOR AUTHOR PAGE ABOUT ps= params | SELECT PAGE AUTHOR auth= auteur | SELECT AUTHOR ABOUT ps= params | SELECT art= typearticle_titreresume AUTHOR auth= auteur m= MOIS a= annee ABOUT ps= params | COUNT art= typearticle AUTHOR auth= auteur | COUNT PAGE AUTHOR auth= auteur | COUNT AUTHOR auth= auteur | COUNT art= typearticle_titreresume AUTHOR auth= auteur ABOUT ps= params | COUNT PAGE AUTHOR auth= auteur ABOUT ps= params | COUNT AUTHOR auth= auteur ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee | SELECT PAGE j= jour m= MOIS | SELECT PAGE m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS a= annee | SELECT art= typearticle j= jour m= MOIS | SELECT art= typearticle m= MOIS a= annee | SELECT art= typearticle_titreresume j= jour m= MOIS a= annee ABOUT ps= params | SELECT art= typearticle_titreresume j= jour m= MOIS ABOUT ps= params | SELECT art= typearticle_titreresume m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS a= annee ABOUT ps= params | SELECT PAGE j= jour m= MOIS ABOUT ps= params | SELECT PAGE m= MOIS a= annee ABOUT ps= params | SELECT PAGE ps1= params ABOUT ABOUT ps2= params )";
        }
    }
 

    public static final BitSet FOLLOW_requete_in_requetesql231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete262 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete281 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete283 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete315 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete336 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete338 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete353 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete355 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete369 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete371 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete375 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete390 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete392 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete396 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete409 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete411 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete413 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete417 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete434 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete447 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete451 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete464 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete474 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete482 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete500 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete506 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete523 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete536 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete538 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete555 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete559 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete561 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete567 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete580 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete582 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete584 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete590 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_requete603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AUTHOR_in_requete605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_auteur_in_requete609 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete625 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete627 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete631 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete635 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete648 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete650 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete669 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete671 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete675 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete689 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete697 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete701 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete714 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete722 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete737 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_in_requete741 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete745 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete762 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete766 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete770 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete774 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete778 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete793 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete797 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete823 = new BitSet(new long[]{0x00000000000007C0L});
    public static final BitSet FOLLOW_typearticle_titreresume_in_requete827 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete831 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete835 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete852 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete854 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete858 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete862 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete866 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete868 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete881 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete883 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_jour_in_requete887 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete891 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete893 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete909 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete911 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MOIS_in_requete915 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_annee_in_requete919 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete921 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_requete937 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAGE_in_requete939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete943 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete945 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ABOUT_in_requete947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_params_in_requete951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jour978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_annee999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_auteur1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNE_in_typearticle1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOCUS_in_typearticle1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROSTITRE_in_typearticle1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREVE_in_typearticle1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_typearticle1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNE_in_typearticle_titreresume1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOCUS_in_typearticle_titreresume1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROSTITRE_in_typearticle_titreresume1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREVE_in_typearticle_titreresume1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOIRAUSSI_in_typearticle_titreresume1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONJ_AND_in_conj1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONJ_OR_in_conj1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_param_extract1171 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_param_in_param_extract1182 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_param_extract_in_params1212 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_conj_in_params1223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_param_extract_in_params1229 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_VAR_in_param1251 = new BitSet(new long[]{0x0000000000000002L});

}