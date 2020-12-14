package org.xtext.gameuno.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.gameuno.services.UnoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'le joueur'", "'joueurs'", "'le jeu'", "'dit interception et '", "'suivant'", "'pose'", "'pioche'", "'limite'", "'gagne'", "'tourne'", "'impose'", "'echange'", "'passe'", "'si meme couleur'", "'si meme numero'", "'sur la pile-talon'", "'de la pioche-pile'", "'le temps de la manche'", "'dans le sens inverse'", "'les mains'", "'si points accumules 500'", "'si carte pioch\\u00E9e +elevee'", "'ses cartes avec autre joueur'", "'son tour'", "'carte-passer-tour'", "'carte-plus-2'", "'carte-inversion'", "'carte-plus-4'", "'carte-joker'", "'carte-uno'", "'rouge'", "'jaune'", "'bleu'", "'vert'", "'regles:'", "'['", "']'", "','", "'{'", "'}'", "'nom_regle:'", "'description:'", "'exigences:'", "'carte-numero-'", "'-couleur-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUnoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnoDsl.g"; }


    	private UnoDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(UnoDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUnoDsl"
    // InternalUnoDsl.g:53:1: entryRuleUnoDsl : ruleUnoDsl EOF ;
    public final void entryRuleUnoDsl() throws RecognitionException {
        try {
            // InternalUnoDsl.g:54:1: ( ruleUnoDsl EOF )
            // InternalUnoDsl.g:55:1: ruleUnoDsl EOF
            {
             before(grammarAccess.getUnoDslRule()); 
            pushFollow(FOLLOW_1);
            ruleUnoDsl();

            state._fsp--;

             after(grammarAccess.getUnoDslRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnoDsl"


    // $ANTLR start "ruleUnoDsl"
    // InternalUnoDsl.g:62:1: ruleUnoDsl : ( ( rule__UnoDsl__Group__0 ) ) ;
    public final void ruleUnoDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:66:2: ( ( ( rule__UnoDsl__Group__0 ) ) )
            // InternalUnoDsl.g:67:2: ( ( rule__UnoDsl__Group__0 ) )
            {
            // InternalUnoDsl.g:67:2: ( ( rule__UnoDsl__Group__0 ) )
            // InternalUnoDsl.g:68:3: ( rule__UnoDsl__Group__0 )
            {
             before(grammarAccess.getUnoDslAccess().getGroup()); 
            // InternalUnoDsl.g:69:3: ( rule__UnoDsl__Group__0 )
            // InternalUnoDsl.g:69:4: rule__UnoDsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnoDslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnoDsl"


    // $ANTLR start "entryRuleRegleJeu"
    // InternalUnoDsl.g:78:1: entryRuleRegleJeu : ruleRegleJeu EOF ;
    public final void entryRuleRegleJeu() throws RecognitionException {
        try {
            // InternalUnoDsl.g:79:1: ( ruleRegleJeu EOF )
            // InternalUnoDsl.g:80:1: ruleRegleJeu EOF
            {
             before(grammarAccess.getRegleJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleRegleJeu();

            state._fsp--;

             after(grammarAccess.getRegleJeuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegleJeu"


    // $ANTLR start "ruleRegleJeu"
    // InternalUnoDsl.g:87:1: ruleRegleJeu : ( ( rule__RegleJeu__Group__0 ) ) ;
    public final void ruleRegleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:91:2: ( ( ( rule__RegleJeu__Group__0 ) ) )
            // InternalUnoDsl.g:92:2: ( ( rule__RegleJeu__Group__0 ) )
            {
            // InternalUnoDsl.g:92:2: ( ( rule__RegleJeu__Group__0 ) )
            // InternalUnoDsl.g:93:3: ( rule__RegleJeu__Group__0 )
            {
             before(grammarAccess.getRegleJeuAccess().getGroup()); 
            // InternalUnoDsl.g:94:3: ( rule__RegleJeu__Group__0 )
            // InternalUnoDsl.g:94:4: rule__RegleJeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegleJeu"


    // $ANTLR start "entryRuleExigence"
    // InternalUnoDsl.g:103:1: entryRuleExigence : ruleExigence EOF ;
    public final void entryRuleExigence() throws RecognitionException {
        try {
            // InternalUnoDsl.g:104:1: ( ruleExigence EOF )
            // InternalUnoDsl.g:105:1: ruleExigence EOF
            {
             before(grammarAccess.getExigenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExigence();

            state._fsp--;

             after(grammarAccess.getExigenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExigence"


    // $ANTLR start "ruleExigence"
    // InternalUnoDsl.g:112:1: ruleExigence : ( ( rule__Exigence__Group__0 ) ) ;
    public final void ruleExigence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:116:2: ( ( ( rule__Exigence__Group__0 ) ) )
            // InternalUnoDsl.g:117:2: ( ( rule__Exigence__Group__0 ) )
            {
            // InternalUnoDsl.g:117:2: ( ( rule__Exigence__Group__0 ) )
            // InternalUnoDsl.g:118:3: ( rule__Exigence__Group__0 )
            {
             before(grammarAccess.getExigenceAccess().getGroup()); 
            // InternalUnoDsl.g:119:3: ( rule__Exigence__Group__0 )
            // InternalUnoDsl.g:119:4: rule__Exigence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExigenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExigence"


    // $ANTLR start "entryRuleExpr1"
    // InternalUnoDsl.g:128:1: entryRuleExpr1 : ruleExpr1 EOF ;
    public final void entryRuleExpr1() throws RecognitionException {
        try {
            // InternalUnoDsl.g:129:1: ( ruleExpr1 EOF )
            // InternalUnoDsl.g:130:1: ruleExpr1 EOF
            {
             before(grammarAccess.getExpr1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpr1();

            state._fsp--;

             after(grammarAccess.getExpr1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr1"


    // $ANTLR start "ruleExpr1"
    // InternalUnoDsl.g:137:1: ruleExpr1 : ( ( rule__Expr1__Alternatives ) ) ;
    public final void ruleExpr1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:141:2: ( ( ( rule__Expr1__Alternatives ) ) )
            // InternalUnoDsl.g:142:2: ( ( rule__Expr1__Alternatives ) )
            {
            // InternalUnoDsl.g:142:2: ( ( rule__Expr1__Alternatives ) )
            // InternalUnoDsl.g:143:3: ( rule__Expr1__Alternatives )
            {
             before(grammarAccess.getExpr1Access().getAlternatives()); 
            // InternalUnoDsl.g:144:3: ( rule__Expr1__Alternatives )
            // InternalUnoDsl.g:144:4: rule__Expr1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expr1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpr1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr1"


    // $ANTLR start "entryRuleLinker1"
    // InternalUnoDsl.g:153:1: entryRuleLinker1 : ruleLinker1 EOF ;
    public final void entryRuleLinker1() throws RecognitionException {
        try {
            // InternalUnoDsl.g:154:1: ( ruleLinker1 EOF )
            // InternalUnoDsl.g:155:1: ruleLinker1 EOF
            {
             before(grammarAccess.getLinker1Rule()); 
            pushFollow(FOLLOW_1);
            ruleLinker1();

            state._fsp--;

             after(grammarAccess.getLinker1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinker1"


    // $ANTLR start "ruleLinker1"
    // InternalUnoDsl.g:162:1: ruleLinker1 : ( ( rule__Linker1__Alternatives ) ) ;
    public final void ruleLinker1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:166:2: ( ( ( rule__Linker1__Alternatives ) ) )
            // InternalUnoDsl.g:167:2: ( ( rule__Linker1__Alternatives ) )
            {
            // InternalUnoDsl.g:167:2: ( ( rule__Linker1__Alternatives ) )
            // InternalUnoDsl.g:168:3: ( rule__Linker1__Alternatives )
            {
             before(grammarAccess.getLinker1Access().getAlternatives()); 
            // InternalUnoDsl.g:169:3: ( rule__Linker1__Alternatives )
            // InternalUnoDsl.g:169:4: rule__Linker1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linker1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinker1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinker1"


    // $ANTLR start "entryRuleLinker2"
    // InternalUnoDsl.g:178:1: entryRuleLinker2 : ruleLinker2 EOF ;
    public final void entryRuleLinker2() throws RecognitionException {
        try {
            // InternalUnoDsl.g:179:1: ( ruleLinker2 EOF )
            // InternalUnoDsl.g:180:1: ruleLinker2 EOF
            {
             before(grammarAccess.getLinker2Rule()); 
            pushFollow(FOLLOW_1);
            ruleLinker2();

            state._fsp--;

             after(grammarAccess.getLinker2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinker2"


    // $ANTLR start "ruleLinker2"
    // InternalUnoDsl.g:187:1: ruleLinker2 : ( ( rule__Linker2__Alternatives ) ) ;
    public final void ruleLinker2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:191:2: ( ( ( rule__Linker2__Alternatives ) ) )
            // InternalUnoDsl.g:192:2: ( ( rule__Linker2__Alternatives ) )
            {
            // InternalUnoDsl.g:192:2: ( ( rule__Linker2__Alternatives ) )
            // InternalUnoDsl.g:193:3: ( rule__Linker2__Alternatives )
            {
             before(grammarAccess.getLinker2Access().getAlternatives()); 
            // InternalUnoDsl.g:194:3: ( rule__Linker2__Alternatives )
            // InternalUnoDsl.g:194:4: rule__Linker2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linker2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinker2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinker2"


    // $ANTLR start "entryRuleLinker3"
    // InternalUnoDsl.g:203:1: entryRuleLinker3 : ruleLinker3 EOF ;
    public final void entryRuleLinker3() throws RecognitionException {
        try {
            // InternalUnoDsl.g:204:1: ( ruleLinker3 EOF )
            // InternalUnoDsl.g:205:1: ruleLinker3 EOF
            {
             before(grammarAccess.getLinker3Rule()); 
            pushFollow(FOLLOW_1);
            ruleLinker3();

            state._fsp--;

             after(grammarAccess.getLinker3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinker3"


    // $ANTLR start "ruleLinker3"
    // InternalUnoDsl.g:212:1: ruleLinker3 : ( ( rule__Linker3__Alternatives ) ) ;
    public final void ruleLinker3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:216:2: ( ( ( rule__Linker3__Alternatives ) ) )
            // InternalUnoDsl.g:217:2: ( ( rule__Linker3__Alternatives ) )
            {
            // InternalUnoDsl.g:217:2: ( ( rule__Linker3__Alternatives ) )
            // InternalUnoDsl.g:218:3: ( rule__Linker3__Alternatives )
            {
             before(grammarAccess.getLinker3Access().getAlternatives()); 
            // InternalUnoDsl.g:219:3: ( rule__Linker3__Alternatives )
            // InternalUnoDsl.g:219:4: rule__Linker3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linker3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinker3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinker3"


    // $ANTLR start "entryRuleExpr2"
    // InternalUnoDsl.g:228:1: entryRuleExpr2 : ruleExpr2 EOF ;
    public final void entryRuleExpr2() throws RecognitionException {
        try {
            // InternalUnoDsl.g:229:1: ( ruleExpr2 EOF )
            // InternalUnoDsl.g:230:1: ruleExpr2 EOF
            {
             before(grammarAccess.getExpr2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpr2();

            state._fsp--;

             after(grammarAccess.getExpr2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr2"


    // $ANTLR start "ruleExpr2"
    // InternalUnoDsl.g:237:1: ruleExpr2 : ( ( rule__Expr2__Alternatives ) ) ;
    public final void ruleExpr2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:241:2: ( ( ( rule__Expr2__Alternatives ) ) )
            // InternalUnoDsl.g:242:2: ( ( rule__Expr2__Alternatives ) )
            {
            // InternalUnoDsl.g:242:2: ( ( rule__Expr2__Alternatives ) )
            // InternalUnoDsl.g:243:3: ( rule__Expr2__Alternatives )
            {
             before(grammarAccess.getExpr2Access().getAlternatives()); 
            // InternalUnoDsl.g:244:3: ( rule__Expr2__Alternatives )
            // InternalUnoDsl.g:244:4: rule__Expr2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expr2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpr2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr2"


    // $ANTLR start "entryRuleCarte"
    // InternalUnoDsl.g:253:1: entryRuleCarte : ruleCarte EOF ;
    public final void entryRuleCarte() throws RecognitionException {
        try {
            // InternalUnoDsl.g:254:1: ( ruleCarte EOF )
            // InternalUnoDsl.g:255:1: ruleCarte EOF
            {
             before(grammarAccess.getCarteRule()); 
            pushFollow(FOLLOW_1);
            ruleCarte();

            state._fsp--;

             after(grammarAccess.getCarteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarte"


    // $ANTLR start "ruleCarte"
    // InternalUnoDsl.g:262:1: ruleCarte : ( ( rule__Carte__Alternatives ) ) ;
    public final void ruleCarte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:266:2: ( ( ( rule__Carte__Alternatives ) ) )
            // InternalUnoDsl.g:267:2: ( ( rule__Carte__Alternatives ) )
            {
            // InternalUnoDsl.g:267:2: ( ( rule__Carte__Alternatives ) )
            // InternalUnoDsl.g:268:3: ( rule__Carte__Alternatives )
            {
             before(grammarAccess.getCarteAccess().getAlternatives()); 
            // InternalUnoDsl.g:269:3: ( rule__Carte__Alternatives )
            // InternalUnoDsl.g:269:4: rule__Carte__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Carte__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCarteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarte"


    // $ANTLR start "entryRuleCarteClassique"
    // InternalUnoDsl.g:278:1: entryRuleCarteClassique : ruleCarteClassique EOF ;
    public final void entryRuleCarteClassique() throws RecognitionException {
        try {
            // InternalUnoDsl.g:279:1: ( ruleCarteClassique EOF )
            // InternalUnoDsl.g:280:1: ruleCarteClassique EOF
            {
             before(grammarAccess.getCarteClassiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleCarteClassique();

            state._fsp--;

             after(grammarAccess.getCarteClassiqueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarteClassique"


    // $ANTLR start "ruleCarteClassique"
    // InternalUnoDsl.g:287:1: ruleCarteClassique : ( ( rule__CarteClassique__Group__0 ) ) ;
    public final void ruleCarteClassique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:291:2: ( ( ( rule__CarteClassique__Group__0 ) ) )
            // InternalUnoDsl.g:292:2: ( ( rule__CarteClassique__Group__0 ) )
            {
            // InternalUnoDsl.g:292:2: ( ( rule__CarteClassique__Group__0 ) )
            // InternalUnoDsl.g:293:3: ( rule__CarteClassique__Group__0 )
            {
             before(grammarAccess.getCarteClassiqueAccess().getGroup()); 
            // InternalUnoDsl.g:294:3: ( rule__CarteClassique__Group__0 )
            // InternalUnoDsl.g:294:4: rule__CarteClassique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarteClassiqueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarteClassique"


    // $ANTLR start "entryRuleCarteActive"
    // InternalUnoDsl.g:303:1: entryRuleCarteActive : ruleCarteActive EOF ;
    public final void entryRuleCarteActive() throws RecognitionException {
        try {
            // InternalUnoDsl.g:304:1: ( ruleCarteActive EOF )
            // InternalUnoDsl.g:305:1: ruleCarteActive EOF
            {
             before(grammarAccess.getCarteActiveRule()); 
            pushFollow(FOLLOW_1);
            ruleCarteActive();

            state._fsp--;

             after(grammarAccess.getCarteActiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarteActive"


    // $ANTLR start "ruleCarteActive"
    // InternalUnoDsl.g:312:1: ruleCarteActive : ( ( rule__CarteActive__Group__0 ) ) ;
    public final void ruleCarteActive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:316:2: ( ( ( rule__CarteActive__Group__0 ) ) )
            // InternalUnoDsl.g:317:2: ( ( rule__CarteActive__Group__0 ) )
            {
            // InternalUnoDsl.g:317:2: ( ( rule__CarteActive__Group__0 ) )
            // InternalUnoDsl.g:318:3: ( rule__CarteActive__Group__0 )
            {
             before(grammarAccess.getCarteActiveAccess().getGroup()); 
            // InternalUnoDsl.g:319:3: ( rule__CarteActive__Group__0 )
            // InternalUnoDsl.g:319:4: rule__CarteActive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CarteActive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarteActiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarteActive"


    // $ANTLR start "entryRuleCarteNoire"
    // InternalUnoDsl.g:328:1: entryRuleCarteNoire : ruleCarteNoire EOF ;
    public final void entryRuleCarteNoire() throws RecognitionException {
        try {
            // InternalUnoDsl.g:329:1: ( ruleCarteNoire EOF )
            // InternalUnoDsl.g:330:1: ruleCarteNoire EOF
            {
             before(grammarAccess.getCarteNoireRule()); 
            pushFollow(FOLLOW_1);
            ruleCarteNoire();

            state._fsp--;

             after(grammarAccess.getCarteNoireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCarteNoire"


    // $ANTLR start "ruleCarteNoire"
    // InternalUnoDsl.g:337:1: ruleCarteNoire : ( ( rule__CarteNoire__Alternatives ) ) ;
    public final void ruleCarteNoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:341:2: ( ( ( rule__CarteNoire__Alternatives ) ) )
            // InternalUnoDsl.g:342:2: ( ( rule__CarteNoire__Alternatives ) )
            {
            // InternalUnoDsl.g:342:2: ( ( rule__CarteNoire__Alternatives ) )
            // InternalUnoDsl.g:343:3: ( rule__CarteNoire__Alternatives )
            {
             before(grammarAccess.getCarteNoireAccess().getAlternatives()); 
            // InternalUnoDsl.g:344:3: ( rule__CarteNoire__Alternatives )
            // InternalUnoDsl.g:344:4: rule__CarteNoire__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CarteNoire__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCarteNoireAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCarteNoire"


    // $ANTLR start "entryRuleCouleurCarte"
    // InternalUnoDsl.g:353:1: entryRuleCouleurCarte : ruleCouleurCarte EOF ;
    public final void entryRuleCouleurCarte() throws RecognitionException {
        try {
            // InternalUnoDsl.g:354:1: ( ruleCouleurCarte EOF )
            // InternalUnoDsl.g:355:1: ruleCouleurCarte EOF
            {
             before(grammarAccess.getCouleurCarteRule()); 
            pushFollow(FOLLOW_1);
            ruleCouleurCarte();

            state._fsp--;

             after(grammarAccess.getCouleurCarteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCouleurCarte"


    // $ANTLR start "ruleCouleurCarte"
    // InternalUnoDsl.g:362:1: ruleCouleurCarte : ( ( rule__CouleurCarte__Alternatives ) ) ;
    public final void ruleCouleurCarte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:366:2: ( ( ( rule__CouleurCarte__Alternatives ) ) )
            // InternalUnoDsl.g:367:2: ( ( rule__CouleurCarte__Alternatives ) )
            {
            // InternalUnoDsl.g:367:2: ( ( rule__CouleurCarte__Alternatives ) )
            // InternalUnoDsl.g:368:3: ( rule__CouleurCarte__Alternatives )
            {
             before(grammarAccess.getCouleurCarteAccess().getAlternatives()); 
            // InternalUnoDsl.g:369:3: ( rule__CouleurCarte__Alternatives )
            // InternalUnoDsl.g:369:4: rule__CouleurCarte__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CouleurCarte__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCouleurCarteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCouleurCarte"


    // $ANTLR start "rule__Expr1__Alternatives"
    // InternalUnoDsl.g:377:1: rule__Expr1__Alternatives : ( ( 'le joueur' ) | ( 'joueurs' ) | ( 'le jeu' ) );
    public final void rule__Expr1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:381:1: ( ( 'le joueur' ) | ( 'joueurs' ) | ( 'le jeu' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUnoDsl.g:382:2: ( 'le joueur' )
                    {
                    // InternalUnoDsl.g:382:2: ( 'le joueur' )
                    // InternalUnoDsl.g:383:3: 'le joueur'
                    {
                     before(grammarAccess.getExpr1Access().getLeJoueurKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExpr1Access().getLeJoueurKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:388:2: ( 'joueurs' )
                    {
                    // InternalUnoDsl.g:388:2: ( 'joueurs' )
                    // InternalUnoDsl.g:389:3: 'joueurs'
                    {
                     before(grammarAccess.getExpr1Access().getJoueursKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpr1Access().getJoueursKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:394:2: ( 'le jeu' )
                    {
                    // InternalUnoDsl.g:394:2: ( 'le jeu' )
                    // InternalUnoDsl.g:395:3: 'le jeu'
                    {
                     before(grammarAccess.getExpr1Access().getLeJeuKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpr1Access().getLeJeuKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr1__Alternatives"


    // $ANTLR start "rule__Linker1__Alternatives"
    // InternalUnoDsl.g:404:1: rule__Linker1__Alternatives : ( ( 'dit interception et ' ) | ( 'suivant' ) );
    public final void rule__Linker1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:408:1: ( ( 'dit interception et ' ) | ( 'suivant' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUnoDsl.g:409:2: ( 'dit interception et ' )
                    {
                    // InternalUnoDsl.g:409:2: ( 'dit interception et ' )
                    // InternalUnoDsl.g:410:3: 'dit interception et '
                    {
                     before(grammarAccess.getLinker1Access().getDitInterceptionEtKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLinker1Access().getDitInterceptionEtKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:415:2: ( 'suivant' )
                    {
                    // InternalUnoDsl.g:415:2: ( 'suivant' )
                    // InternalUnoDsl.g:416:3: 'suivant'
                    {
                     before(grammarAccess.getLinker1Access().getSuivantKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLinker1Access().getSuivantKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linker1__Alternatives"


    // $ANTLR start "rule__Linker2__Alternatives"
    // InternalUnoDsl.g:425:1: rule__Linker2__Alternatives : ( ( 'pose' ) | ( 'pioche' ) | ( 'limite' ) | ( 'gagne' ) | ( 'tourne' ) | ( 'impose' ) | ( 'echange' ) | ( 'passe' ) );
    public final void rule__Linker2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:429:1: ( ( 'pose' ) | ( 'pioche' ) | ( 'limite' ) | ( 'gagne' ) | ( 'tourne' ) | ( 'impose' ) | ( 'echange' ) | ( 'passe' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnoDsl.g:430:2: ( 'pose' )
                    {
                    // InternalUnoDsl.g:430:2: ( 'pose' )
                    // InternalUnoDsl.g:431:3: 'pose'
                    {
                     before(grammarAccess.getLinker2Access().getPoseKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getPoseKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:436:2: ( 'pioche' )
                    {
                    // InternalUnoDsl.g:436:2: ( 'pioche' )
                    // InternalUnoDsl.g:437:3: 'pioche'
                    {
                     before(grammarAccess.getLinker2Access().getPiocheKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getPiocheKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:442:2: ( 'limite' )
                    {
                    // InternalUnoDsl.g:442:2: ( 'limite' )
                    // InternalUnoDsl.g:443:3: 'limite'
                    {
                     before(grammarAccess.getLinker2Access().getLimiteKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getLimiteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:448:2: ( 'gagne' )
                    {
                    // InternalUnoDsl.g:448:2: ( 'gagne' )
                    // InternalUnoDsl.g:449:3: 'gagne'
                    {
                     before(grammarAccess.getLinker2Access().getGagneKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getGagneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:454:2: ( 'tourne' )
                    {
                    // InternalUnoDsl.g:454:2: ( 'tourne' )
                    // InternalUnoDsl.g:455:3: 'tourne'
                    {
                     before(grammarAccess.getLinker2Access().getTourneKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getTourneKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:460:2: ( 'impose' )
                    {
                    // InternalUnoDsl.g:460:2: ( 'impose' )
                    // InternalUnoDsl.g:461:3: 'impose'
                    {
                     before(grammarAccess.getLinker2Access().getImposeKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getImposeKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUnoDsl.g:466:2: ( 'echange' )
                    {
                    // InternalUnoDsl.g:466:2: ( 'echange' )
                    // InternalUnoDsl.g:467:3: 'echange'
                    {
                     before(grammarAccess.getLinker2Access().getEchangeKeyword_6()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getEchangeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUnoDsl.g:472:2: ( 'passe' )
                    {
                    // InternalUnoDsl.g:472:2: ( 'passe' )
                    // InternalUnoDsl.g:473:3: 'passe'
                    {
                     before(grammarAccess.getLinker2Access().getPasseKeyword_7()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLinker2Access().getPasseKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linker2__Alternatives"


    // $ANTLR start "rule__Linker3__Alternatives"
    // InternalUnoDsl.g:482:1: rule__Linker3__Alternatives : ( ( 'si meme couleur' ) | ( 'si meme numero' ) );
    public final void rule__Linker3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:486:1: ( ( 'si meme couleur' ) | ( 'si meme numero' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUnoDsl.g:487:2: ( 'si meme couleur' )
                    {
                    // InternalUnoDsl.g:487:2: ( 'si meme couleur' )
                    // InternalUnoDsl.g:488:3: 'si meme couleur'
                    {
                     before(grammarAccess.getLinker3Access().getSiMemeCouleurKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLinker3Access().getSiMemeCouleurKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:493:2: ( 'si meme numero' )
                    {
                    // InternalUnoDsl.g:493:2: ( 'si meme numero' )
                    // InternalUnoDsl.g:494:3: 'si meme numero'
                    {
                     before(grammarAccess.getLinker3Access().getSiMemeNumeroKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLinker3Access().getSiMemeNumeroKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linker3__Alternatives"


    // $ANTLR start "rule__Expr2__Alternatives"
    // InternalUnoDsl.g:503:1: rule__Expr2__Alternatives : ( ( 'sur la pile-talon' ) | ( 'de la pioche-pile' ) | ( 'le temps de la manche' ) | ( 'dans le sens inverse' ) | ( 'les mains' ) | ( 'si points accumules 500' ) | ( 'si carte pioch\\u00E9e +elevee' ) | ( 'ses cartes avec autre joueur' ) | ( 'son tour' ) );
    public final void rule__Expr2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:507:1: ( ( 'sur la pile-talon' ) | ( 'de la pioche-pile' ) | ( 'le temps de la manche' ) | ( 'dans le sens inverse' ) | ( 'les mains' ) | ( 'si points accumules 500' ) | ( 'si carte pioch\\u00E9e +elevee' ) | ( 'ses cartes avec autre joueur' ) | ( 'son tour' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 31:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 33:
                {
                alt5=8;
                }
                break;
            case 34:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUnoDsl.g:508:2: ( 'sur la pile-talon' )
                    {
                    // InternalUnoDsl.g:508:2: ( 'sur la pile-talon' )
                    // InternalUnoDsl.g:509:3: 'sur la pile-talon'
                    {
                     before(grammarAccess.getExpr2Access().getSurLaPileTalonKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getSurLaPileTalonKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:514:2: ( 'de la pioche-pile' )
                    {
                    // InternalUnoDsl.g:514:2: ( 'de la pioche-pile' )
                    // InternalUnoDsl.g:515:3: 'de la pioche-pile'
                    {
                     before(grammarAccess.getExpr2Access().getDeLaPiochePileKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getDeLaPiochePileKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:520:2: ( 'le temps de la manche' )
                    {
                    // InternalUnoDsl.g:520:2: ( 'le temps de la manche' )
                    // InternalUnoDsl.g:521:3: 'le temps de la manche'
                    {
                     before(grammarAccess.getExpr2Access().getLeTempsDeLaMancheKeyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getLeTempsDeLaMancheKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:526:2: ( 'dans le sens inverse' )
                    {
                    // InternalUnoDsl.g:526:2: ( 'dans le sens inverse' )
                    // InternalUnoDsl.g:527:3: 'dans le sens inverse'
                    {
                     before(grammarAccess.getExpr2Access().getDansLeSensInverseKeyword_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getDansLeSensInverseKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:532:2: ( 'les mains' )
                    {
                    // InternalUnoDsl.g:532:2: ( 'les mains' )
                    // InternalUnoDsl.g:533:3: 'les mains'
                    {
                     before(grammarAccess.getExpr2Access().getLesMainsKeyword_4()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getLesMainsKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:538:2: ( 'si points accumules 500' )
                    {
                    // InternalUnoDsl.g:538:2: ( 'si points accumules 500' )
                    // InternalUnoDsl.g:539:3: 'si points accumules 500'
                    {
                     before(grammarAccess.getExpr2Access().getSiPointsAccumules500Keyword_5()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getSiPointsAccumules500Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUnoDsl.g:544:2: ( 'si carte pioch\\u00E9e +elevee' )
                    {
                    // InternalUnoDsl.g:544:2: ( 'si carte pioch\\u00E9e +elevee' )
                    // InternalUnoDsl.g:545:3: 'si carte pioch\\u00E9e +elevee'
                    {
                     before(grammarAccess.getExpr2Access().getSiCartePiochEEleveeKeyword_6()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getSiCartePiochEEleveeKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUnoDsl.g:550:2: ( 'ses cartes avec autre joueur' )
                    {
                    // InternalUnoDsl.g:550:2: ( 'ses cartes avec autre joueur' )
                    // InternalUnoDsl.g:551:3: 'ses cartes avec autre joueur'
                    {
                     before(grammarAccess.getExpr2Access().getSesCartesAvecAutreJoueurKeyword_7()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getSesCartesAvecAutreJoueurKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUnoDsl.g:556:2: ( 'son tour' )
                    {
                    // InternalUnoDsl.g:556:2: ( 'son tour' )
                    // InternalUnoDsl.g:557:3: 'son tour'
                    {
                     before(grammarAccess.getExpr2Access().getSonTourKeyword_8()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getExpr2Access().getSonTourKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr2__Alternatives"


    // $ANTLR start "rule__Carte__Alternatives"
    // InternalUnoDsl.g:566:1: rule__Carte__Alternatives : ( ( ruleCarteClassique ) | ( ruleCarteActive ) | ( ( rule__Carte__Group_2__0 ) ) );
    public final void rule__Carte__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:570:1: ( ( ruleCarteClassique ) | ( ruleCarteActive ) | ( ( rule__Carte__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt6=1;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt6=2;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUnoDsl.g:571:2: ( ruleCarteClassique )
                    {
                    // InternalUnoDsl.g:571:2: ( ruleCarteClassique )
                    // InternalUnoDsl.g:572:3: ruleCarteClassique
                    {
                     before(grammarAccess.getCarteAccess().getCarteClassiqueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCarteClassique();

                    state._fsp--;

                     after(grammarAccess.getCarteAccess().getCarteClassiqueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:577:2: ( ruleCarteActive )
                    {
                    // InternalUnoDsl.g:577:2: ( ruleCarteActive )
                    // InternalUnoDsl.g:578:3: ruleCarteActive
                    {
                     before(grammarAccess.getCarteAccess().getCarteActiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCarteActive();

                    state._fsp--;

                     after(grammarAccess.getCarteAccess().getCarteActiveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:583:2: ( ( rule__Carte__Group_2__0 ) )
                    {
                    // InternalUnoDsl.g:583:2: ( ( rule__Carte__Group_2__0 ) )
                    // InternalUnoDsl.g:584:3: ( rule__Carte__Group_2__0 )
                    {
                     before(grammarAccess.getCarteAccess().getGroup_2()); 
                    // InternalUnoDsl.g:585:3: ( rule__Carte__Group_2__0 )
                    // InternalUnoDsl.g:585:4: rule__Carte__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Carte__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCarteAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carte__Alternatives"


    // $ANTLR start "rule__CarteActive__Alternatives_0"
    // InternalUnoDsl.g:593:1: rule__CarteActive__Alternatives_0 : ( ( 'carte-passer-tour' ) | ( 'carte-plus-2' ) | ( 'carte-inversion' ) );
    public final void rule__CarteActive__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:597:1: ( ( 'carte-passer-tour' ) | ( 'carte-plus-2' ) | ( 'carte-inversion' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUnoDsl.g:598:2: ( 'carte-passer-tour' )
                    {
                    // InternalUnoDsl.g:598:2: ( 'carte-passer-tour' )
                    // InternalUnoDsl.g:599:3: 'carte-passer-tour'
                    {
                     before(grammarAccess.getCarteActiveAccess().getCartePasserTourKeyword_0_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getCarteActiveAccess().getCartePasserTourKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:604:2: ( 'carte-plus-2' )
                    {
                    // InternalUnoDsl.g:604:2: ( 'carte-plus-2' )
                    // InternalUnoDsl.g:605:3: 'carte-plus-2'
                    {
                     before(grammarAccess.getCarteActiveAccess().getCartePlus2Keyword_0_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getCarteActiveAccess().getCartePlus2Keyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:610:2: ( 'carte-inversion' )
                    {
                    // InternalUnoDsl.g:610:2: ( 'carte-inversion' )
                    // InternalUnoDsl.g:611:3: 'carte-inversion'
                    {
                     before(grammarAccess.getCarteActiveAccess().getCarteInversionKeyword_0_2()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getCarteActiveAccess().getCarteInversionKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Alternatives_0"


    // $ANTLR start "rule__CarteNoire__Alternatives"
    // InternalUnoDsl.g:620:1: rule__CarteNoire__Alternatives : ( ( 'carte-plus-4' ) | ( 'carte-joker' ) | ( 'carte-uno' ) );
    public final void rule__CarteNoire__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:624:1: ( ( 'carte-plus-4' ) | ( 'carte-joker' ) | ( 'carte-uno' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUnoDsl.g:625:2: ( 'carte-plus-4' )
                    {
                    // InternalUnoDsl.g:625:2: ( 'carte-plus-4' )
                    // InternalUnoDsl.g:626:3: 'carte-plus-4'
                    {
                     before(grammarAccess.getCarteNoireAccess().getCartePlus4Keyword_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getCarteNoireAccess().getCartePlus4Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:631:2: ( 'carte-joker' )
                    {
                    // InternalUnoDsl.g:631:2: ( 'carte-joker' )
                    // InternalUnoDsl.g:632:3: 'carte-joker'
                    {
                     before(grammarAccess.getCarteNoireAccess().getCarteJokerKeyword_1()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getCarteNoireAccess().getCarteJokerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:637:2: ( 'carte-uno' )
                    {
                    // InternalUnoDsl.g:637:2: ( 'carte-uno' )
                    // InternalUnoDsl.g:638:3: 'carte-uno'
                    {
                     before(grammarAccess.getCarteNoireAccess().getCarteUnoKeyword_2()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getCarteNoireAccess().getCarteUnoKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteNoire__Alternatives"


    // $ANTLR start "rule__CouleurCarte__Alternatives"
    // InternalUnoDsl.g:647:1: rule__CouleurCarte__Alternatives : ( ( 'rouge' ) | ( 'jaune' ) | ( 'bleu' ) | ( 'vert' ) );
    public final void rule__CouleurCarte__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:651:1: ( ( 'rouge' ) | ( 'jaune' ) | ( 'bleu' ) | ( 'vert' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 43:
                {
                alt9=3;
                }
                break;
            case 44:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUnoDsl.g:652:2: ( 'rouge' )
                    {
                    // InternalUnoDsl.g:652:2: ( 'rouge' )
                    // InternalUnoDsl.g:653:3: 'rouge'
                    {
                     before(grammarAccess.getCouleurCarteAccess().getRougeKeyword_0()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getCouleurCarteAccess().getRougeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:658:2: ( 'jaune' )
                    {
                    // InternalUnoDsl.g:658:2: ( 'jaune' )
                    // InternalUnoDsl.g:659:3: 'jaune'
                    {
                     before(grammarAccess.getCouleurCarteAccess().getJauneKeyword_1()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getCouleurCarteAccess().getJauneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:664:2: ( 'bleu' )
                    {
                    // InternalUnoDsl.g:664:2: ( 'bleu' )
                    // InternalUnoDsl.g:665:3: 'bleu'
                    {
                     before(grammarAccess.getCouleurCarteAccess().getBleuKeyword_2()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getCouleurCarteAccess().getBleuKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:670:2: ( 'vert' )
                    {
                    // InternalUnoDsl.g:670:2: ( 'vert' )
                    // InternalUnoDsl.g:671:3: 'vert'
                    {
                     before(grammarAccess.getCouleurCarteAccess().getVertKeyword_3()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getCouleurCarteAccess().getVertKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CouleurCarte__Alternatives"


    // $ANTLR start "rule__UnoDsl__Group__0"
    // InternalUnoDsl.g:680:1: rule__UnoDsl__Group__0 : rule__UnoDsl__Group__0__Impl rule__UnoDsl__Group__1 ;
    public final void rule__UnoDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:684:1: ( rule__UnoDsl__Group__0__Impl rule__UnoDsl__Group__1 )
            // InternalUnoDsl.g:685:2: rule__UnoDsl__Group__0__Impl rule__UnoDsl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UnoDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__0"


    // $ANTLR start "rule__UnoDsl__Group__0__Impl"
    // InternalUnoDsl.g:692:1: rule__UnoDsl__Group__0__Impl : ( 'regles:' ) ;
    public final void rule__UnoDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:696:1: ( ( 'regles:' ) )
            // InternalUnoDsl.g:697:1: ( 'regles:' )
            {
            // InternalUnoDsl.g:697:1: ( 'regles:' )
            // InternalUnoDsl.g:698:2: 'regles:'
            {
             before(grammarAccess.getUnoDslAccess().getReglesKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUnoDslAccess().getReglesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__0__Impl"


    // $ANTLR start "rule__UnoDsl__Group__1"
    // InternalUnoDsl.g:707:1: rule__UnoDsl__Group__1 : rule__UnoDsl__Group__1__Impl rule__UnoDsl__Group__2 ;
    public final void rule__UnoDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:711:1: ( rule__UnoDsl__Group__1__Impl rule__UnoDsl__Group__2 )
            // InternalUnoDsl.g:712:2: rule__UnoDsl__Group__1__Impl rule__UnoDsl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UnoDsl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__1"


    // $ANTLR start "rule__UnoDsl__Group__1__Impl"
    // InternalUnoDsl.g:719:1: rule__UnoDsl__Group__1__Impl : ( '[' ) ;
    public final void rule__UnoDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:723:1: ( ( '[' ) )
            // InternalUnoDsl.g:724:1: ( '[' )
            {
            // InternalUnoDsl.g:724:1: ( '[' )
            // InternalUnoDsl.g:725:2: '['
            {
             before(grammarAccess.getUnoDslAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUnoDslAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__1__Impl"


    // $ANTLR start "rule__UnoDsl__Group__2"
    // InternalUnoDsl.g:734:1: rule__UnoDsl__Group__2 : rule__UnoDsl__Group__2__Impl rule__UnoDsl__Group__3 ;
    public final void rule__UnoDsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:738:1: ( rule__UnoDsl__Group__2__Impl rule__UnoDsl__Group__3 )
            // InternalUnoDsl.g:739:2: rule__UnoDsl__Group__2__Impl rule__UnoDsl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UnoDsl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__2"


    // $ANTLR start "rule__UnoDsl__Group__2__Impl"
    // InternalUnoDsl.g:746:1: rule__UnoDsl__Group__2__Impl : ( ( rule__UnoDsl__ReglesAssignment_2 ) ) ;
    public final void rule__UnoDsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:750:1: ( ( ( rule__UnoDsl__ReglesAssignment_2 ) ) )
            // InternalUnoDsl.g:751:1: ( ( rule__UnoDsl__ReglesAssignment_2 ) )
            {
            // InternalUnoDsl.g:751:1: ( ( rule__UnoDsl__ReglesAssignment_2 ) )
            // InternalUnoDsl.g:752:2: ( rule__UnoDsl__ReglesAssignment_2 )
            {
             before(grammarAccess.getUnoDslAccess().getReglesAssignment_2()); 
            // InternalUnoDsl.g:753:2: ( rule__UnoDsl__ReglesAssignment_2 )
            // InternalUnoDsl.g:753:3: rule__UnoDsl__ReglesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnoDsl__ReglesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnoDslAccess().getReglesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__2__Impl"


    // $ANTLR start "rule__UnoDsl__Group__3"
    // InternalUnoDsl.g:761:1: rule__UnoDsl__Group__3 : rule__UnoDsl__Group__3__Impl rule__UnoDsl__Group__4 ;
    public final void rule__UnoDsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:765:1: ( rule__UnoDsl__Group__3__Impl rule__UnoDsl__Group__4 )
            // InternalUnoDsl.g:766:2: rule__UnoDsl__Group__3__Impl rule__UnoDsl__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__UnoDsl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__3"


    // $ANTLR start "rule__UnoDsl__Group__3__Impl"
    // InternalUnoDsl.g:773:1: rule__UnoDsl__Group__3__Impl : ( ( rule__UnoDsl__Group_3__0 )* ) ;
    public final void rule__UnoDsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:777:1: ( ( ( rule__UnoDsl__Group_3__0 )* ) )
            // InternalUnoDsl.g:778:1: ( ( rule__UnoDsl__Group_3__0 )* )
            {
            // InternalUnoDsl.g:778:1: ( ( rule__UnoDsl__Group_3__0 )* )
            // InternalUnoDsl.g:779:2: ( rule__UnoDsl__Group_3__0 )*
            {
             before(grammarAccess.getUnoDslAccess().getGroup_3()); 
            // InternalUnoDsl.g:780:2: ( rule__UnoDsl__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUnoDsl.g:780:3: rule__UnoDsl__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UnoDsl__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUnoDslAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__3__Impl"


    // $ANTLR start "rule__UnoDsl__Group__4"
    // InternalUnoDsl.g:788:1: rule__UnoDsl__Group__4 : rule__UnoDsl__Group__4__Impl ;
    public final void rule__UnoDsl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:792:1: ( rule__UnoDsl__Group__4__Impl )
            // InternalUnoDsl.g:793:2: rule__UnoDsl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__4"


    // $ANTLR start "rule__UnoDsl__Group__4__Impl"
    // InternalUnoDsl.g:799:1: rule__UnoDsl__Group__4__Impl : ( ']' ) ;
    public final void rule__UnoDsl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:803:1: ( ( ']' ) )
            // InternalUnoDsl.g:804:1: ( ']' )
            {
            // InternalUnoDsl.g:804:1: ( ']' )
            // InternalUnoDsl.g:805:2: ']'
            {
             before(grammarAccess.getUnoDslAccess().getRightSquareBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getUnoDslAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group__4__Impl"


    // $ANTLR start "rule__UnoDsl__Group_3__0"
    // InternalUnoDsl.g:815:1: rule__UnoDsl__Group_3__0 : rule__UnoDsl__Group_3__0__Impl rule__UnoDsl__Group_3__1 ;
    public final void rule__UnoDsl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:819:1: ( rule__UnoDsl__Group_3__0__Impl rule__UnoDsl__Group_3__1 )
            // InternalUnoDsl.g:820:2: rule__UnoDsl__Group_3__0__Impl rule__UnoDsl__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UnoDsl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group_3__0"


    // $ANTLR start "rule__UnoDsl__Group_3__0__Impl"
    // InternalUnoDsl.g:827:1: rule__UnoDsl__Group_3__0__Impl : ( ',' ) ;
    public final void rule__UnoDsl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:831:1: ( ( ',' ) )
            // InternalUnoDsl.g:832:1: ( ',' )
            {
            // InternalUnoDsl.g:832:1: ( ',' )
            // InternalUnoDsl.g:833:2: ','
            {
             before(grammarAccess.getUnoDslAccess().getCommaKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUnoDslAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group_3__0__Impl"


    // $ANTLR start "rule__UnoDsl__Group_3__1"
    // InternalUnoDsl.g:842:1: rule__UnoDsl__Group_3__1 : rule__UnoDsl__Group_3__1__Impl ;
    public final void rule__UnoDsl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:846:1: ( rule__UnoDsl__Group_3__1__Impl )
            // InternalUnoDsl.g:847:2: rule__UnoDsl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoDsl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group_3__1"


    // $ANTLR start "rule__UnoDsl__Group_3__1__Impl"
    // InternalUnoDsl.g:853:1: rule__UnoDsl__Group_3__1__Impl : ( ( rule__UnoDsl__ReglesAssignment_3_1 ) ) ;
    public final void rule__UnoDsl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:857:1: ( ( ( rule__UnoDsl__ReglesAssignment_3_1 ) ) )
            // InternalUnoDsl.g:858:1: ( ( rule__UnoDsl__ReglesAssignment_3_1 ) )
            {
            // InternalUnoDsl.g:858:1: ( ( rule__UnoDsl__ReglesAssignment_3_1 ) )
            // InternalUnoDsl.g:859:2: ( rule__UnoDsl__ReglesAssignment_3_1 )
            {
             before(grammarAccess.getUnoDslAccess().getReglesAssignment_3_1()); 
            // InternalUnoDsl.g:860:2: ( rule__UnoDsl__ReglesAssignment_3_1 )
            // InternalUnoDsl.g:860:3: rule__UnoDsl__ReglesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UnoDsl__ReglesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnoDslAccess().getReglesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__Group_3__1__Impl"


    // $ANTLR start "rule__RegleJeu__Group__0"
    // InternalUnoDsl.g:869:1: rule__RegleJeu__Group__0 : rule__RegleJeu__Group__0__Impl rule__RegleJeu__Group__1 ;
    public final void rule__RegleJeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:873:1: ( rule__RegleJeu__Group__0__Impl rule__RegleJeu__Group__1 )
            // InternalUnoDsl.g:874:2: rule__RegleJeu__Group__0__Impl rule__RegleJeu__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RegleJeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__0"


    // $ANTLR start "rule__RegleJeu__Group__0__Impl"
    // InternalUnoDsl.g:881:1: rule__RegleJeu__Group__0__Impl : ( '{' ) ;
    public final void rule__RegleJeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:885:1: ( ( '{' ) )
            // InternalUnoDsl.g:886:1: ( '{' )
            {
            // InternalUnoDsl.g:886:1: ( '{' )
            // InternalUnoDsl.g:887:2: '{'
            {
             before(grammarAccess.getRegleJeuAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__0__Impl"


    // $ANTLR start "rule__RegleJeu__Group__1"
    // InternalUnoDsl.g:896:1: rule__RegleJeu__Group__1 : rule__RegleJeu__Group__1__Impl rule__RegleJeu__Group__2 ;
    public final void rule__RegleJeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:900:1: ( rule__RegleJeu__Group__1__Impl rule__RegleJeu__Group__2 )
            // InternalUnoDsl.g:901:2: rule__RegleJeu__Group__1__Impl rule__RegleJeu__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RegleJeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__1"


    // $ANTLR start "rule__RegleJeu__Group__1__Impl"
    // InternalUnoDsl.g:908:1: rule__RegleJeu__Group__1__Impl : ( ( rule__RegleJeu__Group_1__0 ) ) ;
    public final void rule__RegleJeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:912:1: ( ( ( rule__RegleJeu__Group_1__0 ) ) )
            // InternalUnoDsl.g:913:1: ( ( rule__RegleJeu__Group_1__0 ) )
            {
            // InternalUnoDsl.g:913:1: ( ( rule__RegleJeu__Group_1__0 ) )
            // InternalUnoDsl.g:914:2: ( rule__RegleJeu__Group_1__0 )
            {
             before(grammarAccess.getRegleJeuAccess().getGroup_1()); 
            // InternalUnoDsl.g:915:2: ( rule__RegleJeu__Group_1__0 )
            // InternalUnoDsl.g:915:3: rule__RegleJeu__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__1__Impl"


    // $ANTLR start "rule__RegleJeu__Group__2"
    // InternalUnoDsl.g:923:1: rule__RegleJeu__Group__2 : rule__RegleJeu__Group__2__Impl rule__RegleJeu__Group__3 ;
    public final void rule__RegleJeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:927:1: ( rule__RegleJeu__Group__2__Impl rule__RegleJeu__Group__3 )
            // InternalUnoDsl.g:928:2: rule__RegleJeu__Group__2__Impl rule__RegleJeu__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__RegleJeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__2"


    // $ANTLR start "rule__RegleJeu__Group__2__Impl"
    // InternalUnoDsl.g:935:1: rule__RegleJeu__Group__2__Impl : ( ( rule__RegleJeu__Group_2__0 ) ) ;
    public final void rule__RegleJeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:939:1: ( ( ( rule__RegleJeu__Group_2__0 ) ) )
            // InternalUnoDsl.g:940:1: ( ( rule__RegleJeu__Group_2__0 ) )
            {
            // InternalUnoDsl.g:940:1: ( ( rule__RegleJeu__Group_2__0 ) )
            // InternalUnoDsl.g:941:2: ( rule__RegleJeu__Group_2__0 )
            {
             before(grammarAccess.getRegleJeuAccess().getGroup_2()); 
            // InternalUnoDsl.g:942:2: ( rule__RegleJeu__Group_2__0 )
            // InternalUnoDsl.g:942:3: rule__RegleJeu__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__2__Impl"


    // $ANTLR start "rule__RegleJeu__Group__3"
    // InternalUnoDsl.g:950:1: rule__RegleJeu__Group__3 : rule__RegleJeu__Group__3__Impl rule__RegleJeu__Group__4 ;
    public final void rule__RegleJeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:954:1: ( rule__RegleJeu__Group__3__Impl rule__RegleJeu__Group__4 )
            // InternalUnoDsl.g:955:2: rule__RegleJeu__Group__3__Impl rule__RegleJeu__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RegleJeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__3"


    // $ANTLR start "rule__RegleJeu__Group__3__Impl"
    // InternalUnoDsl.g:962:1: rule__RegleJeu__Group__3__Impl : ( ( rule__RegleJeu__Group_3__0 ) ) ;
    public final void rule__RegleJeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:966:1: ( ( ( rule__RegleJeu__Group_3__0 ) ) )
            // InternalUnoDsl.g:967:1: ( ( rule__RegleJeu__Group_3__0 ) )
            {
            // InternalUnoDsl.g:967:1: ( ( rule__RegleJeu__Group_3__0 ) )
            // InternalUnoDsl.g:968:2: ( rule__RegleJeu__Group_3__0 )
            {
             before(grammarAccess.getRegleJeuAccess().getGroup_3()); 
            // InternalUnoDsl.g:969:2: ( rule__RegleJeu__Group_3__0 )
            // InternalUnoDsl.g:969:3: rule__RegleJeu__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__3__Impl"


    // $ANTLR start "rule__RegleJeu__Group__4"
    // InternalUnoDsl.g:977:1: rule__RegleJeu__Group__4 : rule__RegleJeu__Group__4__Impl ;
    public final void rule__RegleJeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:981:1: ( rule__RegleJeu__Group__4__Impl )
            // InternalUnoDsl.g:982:2: rule__RegleJeu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__4"


    // $ANTLR start "rule__RegleJeu__Group__4__Impl"
    // InternalUnoDsl.g:988:1: rule__RegleJeu__Group__4__Impl : ( '}' ) ;
    public final void rule__RegleJeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:992:1: ( ( '}' ) )
            // InternalUnoDsl.g:993:1: ( '}' )
            {
            // InternalUnoDsl.g:993:1: ( '}' )
            // InternalUnoDsl.g:994:2: '}'
            {
             before(grammarAccess.getRegleJeuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group__4__Impl"


    // $ANTLR start "rule__RegleJeu__Group_1__0"
    // InternalUnoDsl.g:1004:1: rule__RegleJeu__Group_1__0 : rule__RegleJeu__Group_1__0__Impl rule__RegleJeu__Group_1__1 ;
    public final void rule__RegleJeu__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1008:1: ( rule__RegleJeu__Group_1__0__Impl rule__RegleJeu__Group_1__1 )
            // InternalUnoDsl.g:1009:2: rule__RegleJeu__Group_1__0__Impl rule__RegleJeu__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__RegleJeu__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__0"


    // $ANTLR start "rule__RegleJeu__Group_1__0__Impl"
    // InternalUnoDsl.g:1016:1: rule__RegleJeu__Group_1__0__Impl : ( 'nom_regle:' ) ;
    public final void rule__RegleJeu__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1020:1: ( ( 'nom_regle:' ) )
            // InternalUnoDsl.g:1021:1: ( 'nom_regle:' )
            {
            // InternalUnoDsl.g:1021:1: ( 'nom_regle:' )
            // InternalUnoDsl.g:1022:2: 'nom_regle:'
            {
             before(grammarAccess.getRegleJeuAccess().getNom_regleKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getNom_regleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__0__Impl"


    // $ANTLR start "rule__RegleJeu__Group_1__1"
    // InternalUnoDsl.g:1031:1: rule__RegleJeu__Group_1__1 : rule__RegleJeu__Group_1__1__Impl rule__RegleJeu__Group_1__2 ;
    public final void rule__RegleJeu__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1035:1: ( rule__RegleJeu__Group_1__1__Impl rule__RegleJeu__Group_1__2 )
            // InternalUnoDsl.g:1036:2: rule__RegleJeu__Group_1__1__Impl rule__RegleJeu__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__RegleJeu__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__1"


    // $ANTLR start "rule__RegleJeu__Group_1__1__Impl"
    // InternalUnoDsl.g:1043:1: rule__RegleJeu__Group_1__1__Impl : ( ( rule__RegleJeu__NameAssignment_1_1 ) ) ;
    public final void rule__RegleJeu__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1047:1: ( ( ( rule__RegleJeu__NameAssignment_1_1 ) ) )
            // InternalUnoDsl.g:1048:1: ( ( rule__RegleJeu__NameAssignment_1_1 ) )
            {
            // InternalUnoDsl.g:1048:1: ( ( rule__RegleJeu__NameAssignment_1_1 ) )
            // InternalUnoDsl.g:1049:2: ( rule__RegleJeu__NameAssignment_1_1 )
            {
             before(grammarAccess.getRegleJeuAccess().getNameAssignment_1_1()); 
            // InternalUnoDsl.g:1050:2: ( rule__RegleJeu__NameAssignment_1_1 )
            // InternalUnoDsl.g:1050:3: rule__RegleJeu__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__1__Impl"


    // $ANTLR start "rule__RegleJeu__Group_1__2"
    // InternalUnoDsl.g:1058:1: rule__RegleJeu__Group_1__2 : rule__RegleJeu__Group_1__2__Impl ;
    public final void rule__RegleJeu__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1062:1: ( rule__RegleJeu__Group_1__2__Impl )
            // InternalUnoDsl.g:1063:2: rule__RegleJeu__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__2"


    // $ANTLR start "rule__RegleJeu__Group_1__2__Impl"
    // InternalUnoDsl.g:1069:1: rule__RegleJeu__Group_1__2__Impl : ( ',' ) ;
    public final void rule__RegleJeu__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1073:1: ( ( ',' ) )
            // InternalUnoDsl.g:1074:1: ( ',' )
            {
            // InternalUnoDsl.g:1074:1: ( ',' )
            // InternalUnoDsl.g:1075:2: ','
            {
             before(grammarAccess.getRegleJeuAccess().getCommaKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getCommaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_1__2__Impl"


    // $ANTLR start "rule__RegleJeu__Group_2__0"
    // InternalUnoDsl.g:1085:1: rule__RegleJeu__Group_2__0 : rule__RegleJeu__Group_2__0__Impl rule__RegleJeu__Group_2__1 ;
    public final void rule__RegleJeu__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1089:1: ( rule__RegleJeu__Group_2__0__Impl rule__RegleJeu__Group_2__1 )
            // InternalUnoDsl.g:1090:2: rule__RegleJeu__Group_2__0__Impl rule__RegleJeu__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RegleJeu__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__0"


    // $ANTLR start "rule__RegleJeu__Group_2__0__Impl"
    // InternalUnoDsl.g:1097:1: rule__RegleJeu__Group_2__0__Impl : ( 'description:' ) ;
    public final void rule__RegleJeu__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1101:1: ( ( 'description:' ) )
            // InternalUnoDsl.g:1102:1: ( 'description:' )
            {
            // InternalUnoDsl.g:1102:1: ( 'description:' )
            // InternalUnoDsl.g:1103:2: 'description:'
            {
             before(grammarAccess.getRegleJeuAccess().getDescriptionKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__0__Impl"


    // $ANTLR start "rule__RegleJeu__Group_2__1"
    // InternalUnoDsl.g:1112:1: rule__RegleJeu__Group_2__1 : rule__RegleJeu__Group_2__1__Impl rule__RegleJeu__Group_2__2 ;
    public final void rule__RegleJeu__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1116:1: ( rule__RegleJeu__Group_2__1__Impl rule__RegleJeu__Group_2__2 )
            // InternalUnoDsl.g:1117:2: rule__RegleJeu__Group_2__1__Impl rule__RegleJeu__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__RegleJeu__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__1"


    // $ANTLR start "rule__RegleJeu__Group_2__1__Impl"
    // InternalUnoDsl.g:1124:1: rule__RegleJeu__Group_2__1__Impl : ( ( rule__RegleJeu__DescriptionAssignment_2_1 ) ) ;
    public final void rule__RegleJeu__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1128:1: ( ( ( rule__RegleJeu__DescriptionAssignment_2_1 ) ) )
            // InternalUnoDsl.g:1129:1: ( ( rule__RegleJeu__DescriptionAssignment_2_1 ) )
            {
            // InternalUnoDsl.g:1129:1: ( ( rule__RegleJeu__DescriptionAssignment_2_1 ) )
            // InternalUnoDsl.g:1130:2: ( rule__RegleJeu__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getRegleJeuAccess().getDescriptionAssignment_2_1()); 
            // InternalUnoDsl.g:1131:2: ( rule__RegleJeu__DescriptionAssignment_2_1 )
            // InternalUnoDsl.g:1131:3: rule__RegleJeu__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__1__Impl"


    // $ANTLR start "rule__RegleJeu__Group_2__2"
    // InternalUnoDsl.g:1139:1: rule__RegleJeu__Group_2__2 : rule__RegleJeu__Group_2__2__Impl ;
    public final void rule__RegleJeu__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1143:1: ( rule__RegleJeu__Group_2__2__Impl )
            // InternalUnoDsl.g:1144:2: rule__RegleJeu__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__2"


    // $ANTLR start "rule__RegleJeu__Group_2__2__Impl"
    // InternalUnoDsl.g:1150:1: rule__RegleJeu__Group_2__2__Impl : ( ',' ) ;
    public final void rule__RegleJeu__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1154:1: ( ( ',' ) )
            // InternalUnoDsl.g:1155:1: ( ',' )
            {
            // InternalUnoDsl.g:1155:1: ( ',' )
            // InternalUnoDsl.g:1156:2: ','
            {
             before(grammarAccess.getRegleJeuAccess().getCommaKeyword_2_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_2__2__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3__0"
    // InternalUnoDsl.g:1166:1: rule__RegleJeu__Group_3__0 : rule__RegleJeu__Group_3__0__Impl rule__RegleJeu__Group_3__1 ;
    public final void rule__RegleJeu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1170:1: ( rule__RegleJeu__Group_3__0__Impl rule__RegleJeu__Group_3__1 )
            // InternalUnoDsl.g:1171:2: rule__RegleJeu__Group_3__0__Impl rule__RegleJeu__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__RegleJeu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__0"


    // $ANTLR start "rule__RegleJeu__Group_3__0__Impl"
    // InternalUnoDsl.g:1178:1: rule__RegleJeu__Group_3__0__Impl : ( 'exigences:' ) ;
    public final void rule__RegleJeu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1182:1: ( ( 'exigences:' ) )
            // InternalUnoDsl.g:1183:1: ( 'exigences:' )
            {
            // InternalUnoDsl.g:1183:1: ( 'exigences:' )
            // InternalUnoDsl.g:1184:2: 'exigences:'
            {
             before(grammarAccess.getRegleJeuAccess().getExigencesKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getExigencesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__0__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3__1"
    // InternalUnoDsl.g:1193:1: rule__RegleJeu__Group_3__1 : rule__RegleJeu__Group_3__1__Impl rule__RegleJeu__Group_3__2 ;
    public final void rule__RegleJeu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1197:1: ( rule__RegleJeu__Group_3__1__Impl rule__RegleJeu__Group_3__2 )
            // InternalUnoDsl.g:1198:2: rule__RegleJeu__Group_3__1__Impl rule__RegleJeu__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__RegleJeu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__1"


    // $ANTLR start "rule__RegleJeu__Group_3__1__Impl"
    // InternalUnoDsl.g:1205:1: rule__RegleJeu__Group_3__1__Impl : ( '[' ) ;
    public final void rule__RegleJeu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1209:1: ( ( '[' ) )
            // InternalUnoDsl.g:1210:1: ( '[' )
            {
            // InternalUnoDsl.g:1210:1: ( '[' )
            // InternalUnoDsl.g:1211:2: '['
            {
             before(grammarAccess.getRegleJeuAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__1__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3__2"
    // InternalUnoDsl.g:1220:1: rule__RegleJeu__Group_3__2 : rule__RegleJeu__Group_3__2__Impl rule__RegleJeu__Group_3__3 ;
    public final void rule__RegleJeu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1224:1: ( rule__RegleJeu__Group_3__2__Impl rule__RegleJeu__Group_3__3 )
            // InternalUnoDsl.g:1225:2: rule__RegleJeu__Group_3__2__Impl rule__RegleJeu__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__RegleJeu__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__2"


    // $ANTLR start "rule__RegleJeu__Group_3__2__Impl"
    // InternalUnoDsl.g:1232:1: rule__RegleJeu__Group_3__2__Impl : ( ( rule__RegleJeu__Group_3_2__0 )* ) ;
    public final void rule__RegleJeu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1236:1: ( ( ( rule__RegleJeu__Group_3_2__0 )* ) )
            // InternalUnoDsl.g:1237:1: ( ( rule__RegleJeu__Group_3_2__0 )* )
            {
            // InternalUnoDsl.g:1237:1: ( ( rule__RegleJeu__Group_3_2__0 )* )
            // InternalUnoDsl.g:1238:2: ( rule__RegleJeu__Group_3_2__0 )*
            {
             before(grammarAccess.getRegleJeuAccess().getGroup_3_2()); 
            // InternalUnoDsl.g:1239:2: ( rule__RegleJeu__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalUnoDsl.g:1239:3: rule__RegleJeu__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RegleJeu__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRegleJeuAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__2__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3__3"
    // InternalUnoDsl.g:1247:1: rule__RegleJeu__Group_3__3 : rule__RegleJeu__Group_3__3__Impl rule__RegleJeu__Group_3__4 ;
    public final void rule__RegleJeu__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1251:1: ( rule__RegleJeu__Group_3__3__Impl rule__RegleJeu__Group_3__4 )
            // InternalUnoDsl.g:1252:2: rule__RegleJeu__Group_3__3__Impl rule__RegleJeu__Group_3__4
            {
            pushFollow(FOLLOW_15);
            rule__RegleJeu__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__3"


    // $ANTLR start "rule__RegleJeu__Group_3__3__Impl"
    // InternalUnoDsl.g:1259:1: rule__RegleJeu__Group_3__3__Impl : ( ( rule__RegleJeu__ExigenceAssignment_3_3 ) ) ;
    public final void rule__RegleJeu__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1263:1: ( ( ( rule__RegleJeu__ExigenceAssignment_3_3 ) ) )
            // InternalUnoDsl.g:1264:1: ( ( rule__RegleJeu__ExigenceAssignment_3_3 ) )
            {
            // InternalUnoDsl.g:1264:1: ( ( rule__RegleJeu__ExigenceAssignment_3_3 ) )
            // InternalUnoDsl.g:1265:2: ( rule__RegleJeu__ExigenceAssignment_3_3 )
            {
             before(grammarAccess.getRegleJeuAccess().getExigenceAssignment_3_3()); 
            // InternalUnoDsl.g:1266:2: ( rule__RegleJeu__ExigenceAssignment_3_3 )
            // InternalUnoDsl.g:1266:3: rule__RegleJeu__ExigenceAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__ExigenceAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getExigenceAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__3__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3__4"
    // InternalUnoDsl.g:1274:1: rule__RegleJeu__Group_3__4 : rule__RegleJeu__Group_3__4__Impl ;
    public final void rule__RegleJeu__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1278:1: ( rule__RegleJeu__Group_3__4__Impl )
            // InternalUnoDsl.g:1279:2: rule__RegleJeu__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__4"


    // $ANTLR start "rule__RegleJeu__Group_3__4__Impl"
    // InternalUnoDsl.g:1285:1: rule__RegleJeu__Group_3__4__Impl : ( ']' ) ;
    public final void rule__RegleJeu__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1289:1: ( ( ']' ) )
            // InternalUnoDsl.g:1290:1: ( ']' )
            {
            // InternalUnoDsl.g:1290:1: ( ']' )
            // InternalUnoDsl.g:1291:2: ']'
            {
             before(grammarAccess.getRegleJeuAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3__4__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3_2__0"
    // InternalUnoDsl.g:1301:1: rule__RegleJeu__Group_3_2__0 : rule__RegleJeu__Group_3_2__0__Impl rule__RegleJeu__Group_3_2__1 ;
    public final void rule__RegleJeu__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1305:1: ( rule__RegleJeu__Group_3_2__0__Impl rule__RegleJeu__Group_3_2__1 )
            // InternalUnoDsl.g:1306:2: rule__RegleJeu__Group_3_2__0__Impl rule__RegleJeu__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__RegleJeu__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3_2__0"


    // $ANTLR start "rule__RegleJeu__Group_3_2__0__Impl"
    // InternalUnoDsl.g:1313:1: rule__RegleJeu__Group_3_2__0__Impl : ( ( rule__RegleJeu__ExigenceAssignment_3_2_0 ) ) ;
    public final void rule__RegleJeu__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1317:1: ( ( ( rule__RegleJeu__ExigenceAssignment_3_2_0 ) ) )
            // InternalUnoDsl.g:1318:1: ( ( rule__RegleJeu__ExigenceAssignment_3_2_0 ) )
            {
            // InternalUnoDsl.g:1318:1: ( ( rule__RegleJeu__ExigenceAssignment_3_2_0 ) )
            // InternalUnoDsl.g:1319:2: ( rule__RegleJeu__ExigenceAssignment_3_2_0 )
            {
             before(grammarAccess.getRegleJeuAccess().getExigenceAssignment_3_2_0()); 
            // InternalUnoDsl.g:1320:2: ( rule__RegleJeu__ExigenceAssignment_3_2_0 )
            // InternalUnoDsl.g:1320:3: rule__RegleJeu__ExigenceAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__ExigenceAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRegleJeuAccess().getExigenceAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3_2__0__Impl"


    // $ANTLR start "rule__RegleJeu__Group_3_2__1"
    // InternalUnoDsl.g:1328:1: rule__RegleJeu__Group_3_2__1 : rule__RegleJeu__Group_3_2__1__Impl ;
    public final void rule__RegleJeu__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1332:1: ( rule__RegleJeu__Group_3_2__1__Impl )
            // InternalUnoDsl.g:1333:2: rule__RegleJeu__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegleJeu__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3_2__1"


    // $ANTLR start "rule__RegleJeu__Group_3_2__1__Impl"
    // InternalUnoDsl.g:1339:1: rule__RegleJeu__Group_3_2__1__Impl : ( ',' ) ;
    public final void rule__RegleJeu__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1343:1: ( ( ',' ) )
            // InternalUnoDsl.g:1344:1: ( ',' )
            {
            // InternalUnoDsl.g:1344:1: ( ',' )
            // InternalUnoDsl.g:1345:2: ','
            {
             before(grammarAccess.getRegleJeuAccess().getCommaKeyword_3_2_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getCommaKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__Group_3_2__1__Impl"


    // $ANTLR start "rule__Exigence__Group__0"
    // InternalUnoDsl.g:1355:1: rule__Exigence__Group__0 : rule__Exigence__Group__0__Impl rule__Exigence__Group__1 ;
    public final void rule__Exigence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1359:1: ( rule__Exigence__Group__0__Impl rule__Exigence__Group__1 )
            // InternalUnoDsl.g:1360:2: rule__Exigence__Group__0__Impl rule__Exigence__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Exigence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__0"


    // $ANTLR start "rule__Exigence__Group__0__Impl"
    // InternalUnoDsl.g:1367:1: rule__Exigence__Group__0__Impl : ( ( rule__Exigence__Expr1Assignment_0 ) ) ;
    public final void rule__Exigence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1371:1: ( ( ( rule__Exigence__Expr1Assignment_0 ) ) )
            // InternalUnoDsl.g:1372:1: ( ( rule__Exigence__Expr1Assignment_0 ) )
            {
            // InternalUnoDsl.g:1372:1: ( ( rule__Exigence__Expr1Assignment_0 ) )
            // InternalUnoDsl.g:1373:2: ( rule__Exigence__Expr1Assignment_0 )
            {
             before(grammarAccess.getExigenceAccess().getExpr1Assignment_0()); 
            // InternalUnoDsl.g:1374:2: ( rule__Exigence__Expr1Assignment_0 )
            // InternalUnoDsl.g:1374:3: rule__Exigence__Expr1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Expr1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExigenceAccess().getExpr1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__0__Impl"


    // $ANTLR start "rule__Exigence__Group__1"
    // InternalUnoDsl.g:1382:1: rule__Exigence__Group__1 : rule__Exigence__Group__1__Impl rule__Exigence__Group__2 ;
    public final void rule__Exigence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1386:1: ( rule__Exigence__Group__1__Impl rule__Exigence__Group__2 )
            // InternalUnoDsl.g:1387:2: rule__Exigence__Group__1__Impl rule__Exigence__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Exigence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__1"


    // $ANTLR start "rule__Exigence__Group__1__Impl"
    // InternalUnoDsl.g:1394:1: rule__Exigence__Group__1__Impl : ( ( rule__Exigence__Linker1Assignment_1 )? ) ;
    public final void rule__Exigence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1398:1: ( ( ( rule__Exigence__Linker1Assignment_1 )? ) )
            // InternalUnoDsl.g:1399:1: ( ( rule__Exigence__Linker1Assignment_1 )? )
            {
            // InternalUnoDsl.g:1399:1: ( ( rule__Exigence__Linker1Assignment_1 )? )
            // InternalUnoDsl.g:1400:2: ( rule__Exigence__Linker1Assignment_1 )?
            {
             before(grammarAccess.getExigenceAccess().getLinker1Assignment_1()); 
            // InternalUnoDsl.g:1401:2: ( rule__Exigence__Linker1Assignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=15)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUnoDsl.g:1401:3: rule__Exigence__Linker1Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exigence__Linker1Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExigenceAccess().getLinker1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__1__Impl"


    // $ANTLR start "rule__Exigence__Group__2"
    // InternalUnoDsl.g:1409:1: rule__Exigence__Group__2 : rule__Exigence__Group__2__Impl rule__Exigence__Group__3 ;
    public final void rule__Exigence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1413:1: ( rule__Exigence__Group__2__Impl rule__Exigence__Group__3 )
            // InternalUnoDsl.g:1414:2: rule__Exigence__Group__2__Impl rule__Exigence__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Exigence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__2"


    // $ANTLR start "rule__Exigence__Group__2__Impl"
    // InternalUnoDsl.g:1421:1: rule__Exigence__Group__2__Impl : ( ( rule__Exigence__Linker2Assignment_2 ) ) ;
    public final void rule__Exigence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1425:1: ( ( ( rule__Exigence__Linker2Assignment_2 ) ) )
            // InternalUnoDsl.g:1426:1: ( ( rule__Exigence__Linker2Assignment_2 ) )
            {
            // InternalUnoDsl.g:1426:1: ( ( rule__Exigence__Linker2Assignment_2 ) )
            // InternalUnoDsl.g:1427:2: ( rule__Exigence__Linker2Assignment_2 )
            {
             before(grammarAccess.getExigenceAccess().getLinker2Assignment_2()); 
            // InternalUnoDsl.g:1428:2: ( rule__Exigence__Linker2Assignment_2 )
            // InternalUnoDsl.g:1428:3: rule__Exigence__Linker2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Linker2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExigenceAccess().getLinker2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__2__Impl"


    // $ANTLR start "rule__Exigence__Group__3"
    // InternalUnoDsl.g:1436:1: rule__Exigence__Group__3 : rule__Exigence__Group__3__Impl rule__Exigence__Group__4 ;
    public final void rule__Exigence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1440:1: ( rule__Exigence__Group__3__Impl rule__Exigence__Group__4 )
            // InternalUnoDsl.g:1441:2: rule__Exigence__Group__3__Impl rule__Exigence__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Exigence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__3"


    // $ANTLR start "rule__Exigence__Group__3__Impl"
    // InternalUnoDsl.g:1448:1: rule__Exigence__Group__3__Impl : ( ( rule__Exigence__Group_3__0 )? ) ;
    public final void rule__Exigence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1452:1: ( ( ( rule__Exigence__Group_3__0 )? ) )
            // InternalUnoDsl.g:1453:1: ( ( rule__Exigence__Group_3__0 )? )
            {
            // InternalUnoDsl.g:1453:1: ( ( rule__Exigence__Group_3__0 )? )
            // InternalUnoDsl.g:1454:2: ( rule__Exigence__Group_3__0 )?
            {
             before(grammarAccess.getExigenceAccess().getGroup_3()); 
            // InternalUnoDsl.g:1455:2: ( rule__Exigence__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=35 && LA13_0<=40)||LA13_0==54) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUnoDsl.g:1455:3: rule__Exigence__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exigence__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExigenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__3__Impl"


    // $ANTLR start "rule__Exigence__Group__4"
    // InternalUnoDsl.g:1463:1: rule__Exigence__Group__4 : rule__Exigence__Group__4__Impl rule__Exigence__Group__5 ;
    public final void rule__Exigence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1467:1: ( rule__Exigence__Group__4__Impl rule__Exigence__Group__5 )
            // InternalUnoDsl.g:1468:2: rule__Exigence__Group__4__Impl rule__Exigence__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Exigence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__4"


    // $ANTLR start "rule__Exigence__Group__4__Impl"
    // InternalUnoDsl.g:1475:1: rule__Exigence__Group__4__Impl : ( ( rule__Exigence__Linker3Assignment_4 )? ) ;
    public final void rule__Exigence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1479:1: ( ( ( rule__Exigence__Linker3Assignment_4 )? ) )
            // InternalUnoDsl.g:1480:1: ( ( rule__Exigence__Linker3Assignment_4 )? )
            {
            // InternalUnoDsl.g:1480:1: ( ( rule__Exigence__Linker3Assignment_4 )? )
            // InternalUnoDsl.g:1481:2: ( rule__Exigence__Linker3Assignment_4 )?
            {
             before(grammarAccess.getExigenceAccess().getLinker3Assignment_4()); 
            // InternalUnoDsl.g:1482:2: ( rule__Exigence__Linker3Assignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=25)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUnoDsl.g:1482:3: rule__Exigence__Linker3Assignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exigence__Linker3Assignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExigenceAccess().getLinker3Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__4__Impl"


    // $ANTLR start "rule__Exigence__Group__5"
    // InternalUnoDsl.g:1490:1: rule__Exigence__Group__5 : rule__Exigence__Group__5__Impl ;
    public final void rule__Exigence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1494:1: ( rule__Exigence__Group__5__Impl )
            // InternalUnoDsl.g:1495:2: rule__Exigence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__5"


    // $ANTLR start "rule__Exigence__Group__5__Impl"
    // InternalUnoDsl.g:1501:1: rule__Exigence__Group__5__Impl : ( ( rule__Exigence__Expr2Assignment_5 )? ) ;
    public final void rule__Exigence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1505:1: ( ( ( rule__Exigence__Expr2Assignment_5 )? ) )
            // InternalUnoDsl.g:1506:1: ( ( rule__Exigence__Expr2Assignment_5 )? )
            {
            // InternalUnoDsl.g:1506:1: ( ( rule__Exigence__Expr2Assignment_5 )? )
            // InternalUnoDsl.g:1507:2: ( rule__Exigence__Expr2Assignment_5 )?
            {
             before(grammarAccess.getExigenceAccess().getExpr2Assignment_5()); 
            // InternalUnoDsl.g:1508:2: ( rule__Exigence__Expr2Assignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=26 && LA15_0<=34)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUnoDsl.g:1508:3: rule__Exigence__Expr2Assignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exigence__Expr2Assignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExigenceAccess().getExpr2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group__5__Impl"


    // $ANTLR start "rule__Exigence__Group_3__0"
    // InternalUnoDsl.g:1517:1: rule__Exigence__Group_3__0 : rule__Exigence__Group_3__0__Impl rule__Exigence__Group_3__1 ;
    public final void rule__Exigence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1521:1: ( rule__Exigence__Group_3__0__Impl rule__Exigence__Group_3__1 )
            // InternalUnoDsl.g:1522:2: rule__Exigence__Group_3__0__Impl rule__Exigence__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Exigence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3__0"


    // $ANTLR start "rule__Exigence__Group_3__0__Impl"
    // InternalUnoDsl.g:1529:1: rule__Exigence__Group_3__0__Impl : ( ( rule__Exigence__CarteAssignment_3_0 ) ) ;
    public final void rule__Exigence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1533:1: ( ( ( rule__Exigence__CarteAssignment_3_0 ) ) )
            // InternalUnoDsl.g:1534:1: ( ( rule__Exigence__CarteAssignment_3_0 ) )
            {
            // InternalUnoDsl.g:1534:1: ( ( rule__Exigence__CarteAssignment_3_0 ) )
            // InternalUnoDsl.g:1535:2: ( rule__Exigence__CarteAssignment_3_0 )
            {
             before(grammarAccess.getExigenceAccess().getCarteAssignment_3_0()); 
            // InternalUnoDsl.g:1536:2: ( rule__Exigence__CarteAssignment_3_0 )
            // InternalUnoDsl.g:1536:3: rule__Exigence__CarteAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__CarteAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getExigenceAccess().getCarteAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3__0__Impl"


    // $ANTLR start "rule__Exigence__Group_3__1"
    // InternalUnoDsl.g:1544:1: rule__Exigence__Group_3__1 : rule__Exigence__Group_3__1__Impl ;
    public final void rule__Exigence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1548:1: ( rule__Exigence__Group_3__1__Impl )
            // InternalUnoDsl.g:1549:2: rule__Exigence__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3__1"


    // $ANTLR start "rule__Exigence__Group_3__1__Impl"
    // InternalUnoDsl.g:1555:1: rule__Exigence__Group_3__1__Impl : ( ( rule__Exigence__Group_3_1__0 )* ) ;
    public final void rule__Exigence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1559:1: ( ( ( rule__Exigence__Group_3_1__0 )* ) )
            // InternalUnoDsl.g:1560:1: ( ( rule__Exigence__Group_3_1__0 )* )
            {
            // InternalUnoDsl.g:1560:1: ( ( rule__Exigence__Group_3_1__0 )* )
            // InternalUnoDsl.g:1561:2: ( rule__Exigence__Group_3_1__0 )*
            {
             before(grammarAccess.getExigenceAccess().getGroup_3_1()); 
            // InternalUnoDsl.g:1562:2: ( rule__Exigence__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=35 && LA16_2<=40)||LA16_2==54) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalUnoDsl.g:1562:3: rule__Exigence__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Exigence__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExigenceAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3__1__Impl"


    // $ANTLR start "rule__Exigence__Group_3_1__0"
    // InternalUnoDsl.g:1571:1: rule__Exigence__Group_3_1__0 : rule__Exigence__Group_3_1__0__Impl rule__Exigence__Group_3_1__1 ;
    public final void rule__Exigence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1575:1: ( rule__Exigence__Group_3_1__0__Impl rule__Exigence__Group_3_1__1 )
            // InternalUnoDsl.g:1576:2: rule__Exigence__Group_3_1__0__Impl rule__Exigence__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Exigence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exigence__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3_1__0"


    // $ANTLR start "rule__Exigence__Group_3_1__0__Impl"
    // InternalUnoDsl.g:1583:1: rule__Exigence__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Exigence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1587:1: ( ( ',' ) )
            // InternalUnoDsl.g:1588:1: ( ',' )
            {
            // InternalUnoDsl.g:1588:1: ( ',' )
            // InternalUnoDsl.g:1589:2: ','
            {
             before(grammarAccess.getExigenceAccess().getCommaKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getExigenceAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3_1__0__Impl"


    // $ANTLR start "rule__Exigence__Group_3_1__1"
    // InternalUnoDsl.g:1598:1: rule__Exigence__Group_3_1__1 : rule__Exigence__Group_3_1__1__Impl ;
    public final void rule__Exigence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1602:1: ( rule__Exigence__Group_3_1__1__Impl )
            // InternalUnoDsl.g:1603:2: rule__Exigence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3_1__1"


    // $ANTLR start "rule__Exigence__Group_3_1__1__Impl"
    // InternalUnoDsl.g:1609:1: rule__Exigence__Group_3_1__1__Impl : ( ( rule__Exigence__CarteAssignment_3_1_1 ) ) ;
    public final void rule__Exigence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1613:1: ( ( ( rule__Exigence__CarteAssignment_3_1_1 ) ) )
            // InternalUnoDsl.g:1614:1: ( ( rule__Exigence__CarteAssignment_3_1_1 ) )
            {
            // InternalUnoDsl.g:1614:1: ( ( rule__Exigence__CarteAssignment_3_1_1 ) )
            // InternalUnoDsl.g:1615:2: ( rule__Exigence__CarteAssignment_3_1_1 )
            {
             before(grammarAccess.getExigenceAccess().getCarteAssignment_3_1_1()); 
            // InternalUnoDsl.g:1616:2: ( rule__Exigence__CarteAssignment_3_1_1 )
            // InternalUnoDsl.g:1616:3: rule__Exigence__CarteAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exigence__CarteAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExigenceAccess().getCarteAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Group_3_1__1__Impl"


    // $ANTLR start "rule__Carte__Group_2__0"
    // InternalUnoDsl.g:1625:1: rule__Carte__Group_2__0 : rule__Carte__Group_2__0__Impl rule__Carte__Group_2__1 ;
    public final void rule__Carte__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1629:1: ( rule__Carte__Group_2__0__Impl rule__Carte__Group_2__1 )
            // InternalUnoDsl.g:1630:2: rule__Carte__Group_2__0__Impl rule__Carte__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Carte__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Carte__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carte__Group_2__0"


    // $ANTLR start "rule__Carte__Group_2__0__Impl"
    // InternalUnoDsl.g:1637:1: rule__Carte__Group_2__0__Impl : ( () ) ;
    public final void rule__Carte__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1641:1: ( ( () ) )
            // InternalUnoDsl.g:1642:1: ( () )
            {
            // InternalUnoDsl.g:1642:1: ( () )
            // InternalUnoDsl.g:1643:2: ()
            {
             before(grammarAccess.getCarteAccess().getCarteAction_2_0()); 
            // InternalUnoDsl.g:1644:2: ()
            // InternalUnoDsl.g:1644:3: 
            {
            }

             after(grammarAccess.getCarteAccess().getCarteAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carte__Group_2__0__Impl"


    // $ANTLR start "rule__Carte__Group_2__1"
    // InternalUnoDsl.g:1652:1: rule__Carte__Group_2__1 : rule__Carte__Group_2__1__Impl ;
    public final void rule__Carte__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1656:1: ( rule__Carte__Group_2__1__Impl )
            // InternalUnoDsl.g:1657:2: rule__Carte__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Carte__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carte__Group_2__1"


    // $ANTLR start "rule__Carte__Group_2__1__Impl"
    // InternalUnoDsl.g:1663:1: rule__Carte__Group_2__1__Impl : ( ruleCarteNoire ) ;
    public final void rule__Carte__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1667:1: ( ( ruleCarteNoire ) )
            // InternalUnoDsl.g:1668:1: ( ruleCarteNoire )
            {
            // InternalUnoDsl.g:1668:1: ( ruleCarteNoire )
            // InternalUnoDsl.g:1669:2: ruleCarteNoire
            {
             before(grammarAccess.getCarteAccess().getCarteNoireParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleCarteNoire();

            state._fsp--;

             after(grammarAccess.getCarteAccess().getCarteNoireParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Carte__Group_2__1__Impl"


    // $ANTLR start "rule__CarteClassique__Group__0"
    // InternalUnoDsl.g:1679:1: rule__CarteClassique__Group__0 : rule__CarteClassique__Group__0__Impl rule__CarteClassique__Group__1 ;
    public final void rule__CarteClassique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1683:1: ( rule__CarteClassique__Group__0__Impl rule__CarteClassique__Group__1 )
            // InternalUnoDsl.g:1684:2: rule__CarteClassique__Group__0__Impl rule__CarteClassique__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__CarteClassique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__0"


    // $ANTLR start "rule__CarteClassique__Group__0__Impl"
    // InternalUnoDsl.g:1691:1: rule__CarteClassique__Group__0__Impl : ( 'carte-numero-' ) ;
    public final void rule__CarteClassique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1695:1: ( ( 'carte-numero-' ) )
            // InternalUnoDsl.g:1696:1: ( 'carte-numero-' )
            {
            // InternalUnoDsl.g:1696:1: ( 'carte-numero-' )
            // InternalUnoDsl.g:1697:2: 'carte-numero-'
            {
             before(grammarAccess.getCarteClassiqueAccess().getCarteNumeroKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCarteClassiqueAccess().getCarteNumeroKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__0__Impl"


    // $ANTLR start "rule__CarteClassique__Group__1"
    // InternalUnoDsl.g:1706:1: rule__CarteClassique__Group__1 : rule__CarteClassique__Group__1__Impl rule__CarteClassique__Group__2 ;
    public final void rule__CarteClassique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1710:1: ( rule__CarteClassique__Group__1__Impl rule__CarteClassique__Group__2 )
            // InternalUnoDsl.g:1711:2: rule__CarteClassique__Group__1__Impl rule__CarteClassique__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CarteClassique__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__1"


    // $ANTLR start "rule__CarteClassique__Group__1__Impl"
    // InternalUnoDsl.g:1718:1: rule__CarteClassique__Group__1__Impl : ( ( rule__CarteClassique__NumeroCarteAssignment_1 ) ) ;
    public final void rule__CarteClassique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1722:1: ( ( ( rule__CarteClassique__NumeroCarteAssignment_1 ) ) )
            // InternalUnoDsl.g:1723:1: ( ( rule__CarteClassique__NumeroCarteAssignment_1 ) )
            {
            // InternalUnoDsl.g:1723:1: ( ( rule__CarteClassique__NumeroCarteAssignment_1 ) )
            // InternalUnoDsl.g:1724:2: ( rule__CarteClassique__NumeroCarteAssignment_1 )
            {
             before(grammarAccess.getCarteClassiqueAccess().getNumeroCarteAssignment_1()); 
            // InternalUnoDsl.g:1725:2: ( rule__CarteClassique__NumeroCarteAssignment_1 )
            // InternalUnoDsl.g:1725:3: rule__CarteClassique__NumeroCarteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__NumeroCarteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCarteClassiqueAccess().getNumeroCarteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__1__Impl"


    // $ANTLR start "rule__CarteClassique__Group__2"
    // InternalUnoDsl.g:1733:1: rule__CarteClassique__Group__2 : rule__CarteClassique__Group__2__Impl ;
    public final void rule__CarteClassique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1737:1: ( rule__CarteClassique__Group__2__Impl )
            // InternalUnoDsl.g:1738:2: rule__CarteClassique__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__2"


    // $ANTLR start "rule__CarteClassique__Group__2__Impl"
    // InternalUnoDsl.g:1744:1: rule__CarteClassique__Group__2__Impl : ( ( rule__CarteClassique__Group_2__0 ) ) ;
    public final void rule__CarteClassique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1748:1: ( ( ( rule__CarteClassique__Group_2__0 ) ) )
            // InternalUnoDsl.g:1749:1: ( ( rule__CarteClassique__Group_2__0 ) )
            {
            // InternalUnoDsl.g:1749:1: ( ( rule__CarteClassique__Group_2__0 ) )
            // InternalUnoDsl.g:1750:2: ( rule__CarteClassique__Group_2__0 )
            {
             before(grammarAccess.getCarteClassiqueAccess().getGroup_2()); 
            // InternalUnoDsl.g:1751:2: ( rule__CarteClassique__Group_2__0 )
            // InternalUnoDsl.g:1751:3: rule__CarteClassique__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCarteClassiqueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group__2__Impl"


    // $ANTLR start "rule__CarteClassique__Group_2__0"
    // InternalUnoDsl.g:1760:1: rule__CarteClassique__Group_2__0 : rule__CarteClassique__Group_2__0__Impl rule__CarteClassique__Group_2__1 ;
    public final void rule__CarteClassique__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1764:1: ( rule__CarteClassique__Group_2__0__Impl rule__CarteClassique__Group_2__1 )
            // InternalUnoDsl.g:1765:2: rule__CarteClassique__Group_2__0__Impl rule__CarteClassique__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__CarteClassique__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group_2__0"


    // $ANTLR start "rule__CarteClassique__Group_2__0__Impl"
    // InternalUnoDsl.g:1772:1: rule__CarteClassique__Group_2__0__Impl : ( '-couleur-' ) ;
    public final void rule__CarteClassique__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1776:1: ( ( '-couleur-' ) )
            // InternalUnoDsl.g:1777:1: ( '-couleur-' )
            {
            // InternalUnoDsl.g:1777:1: ( '-couleur-' )
            // InternalUnoDsl.g:1778:2: '-couleur-'
            {
             before(grammarAccess.getCarteClassiqueAccess().getCouleurKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCarteClassiqueAccess().getCouleurKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group_2__0__Impl"


    // $ANTLR start "rule__CarteClassique__Group_2__1"
    // InternalUnoDsl.g:1787:1: rule__CarteClassique__Group_2__1 : rule__CarteClassique__Group_2__1__Impl ;
    public final void rule__CarteClassique__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1791:1: ( rule__CarteClassique__Group_2__1__Impl )
            // InternalUnoDsl.g:1792:2: rule__CarteClassique__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group_2__1"


    // $ANTLR start "rule__CarteClassique__Group_2__1__Impl"
    // InternalUnoDsl.g:1798:1: rule__CarteClassique__Group_2__1__Impl : ( ( rule__CarteClassique__CouleurAssignment_2_1 ) ) ;
    public final void rule__CarteClassique__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1802:1: ( ( ( rule__CarteClassique__CouleurAssignment_2_1 ) ) )
            // InternalUnoDsl.g:1803:1: ( ( rule__CarteClassique__CouleurAssignment_2_1 ) )
            {
            // InternalUnoDsl.g:1803:1: ( ( rule__CarteClassique__CouleurAssignment_2_1 ) )
            // InternalUnoDsl.g:1804:2: ( rule__CarteClassique__CouleurAssignment_2_1 )
            {
             before(grammarAccess.getCarteClassiqueAccess().getCouleurAssignment_2_1()); 
            // InternalUnoDsl.g:1805:2: ( rule__CarteClassique__CouleurAssignment_2_1 )
            // InternalUnoDsl.g:1805:3: rule__CarteClassique__CouleurAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CarteClassique__CouleurAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCarteClassiqueAccess().getCouleurAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__Group_2__1__Impl"


    // $ANTLR start "rule__CarteActive__Group__0"
    // InternalUnoDsl.g:1814:1: rule__CarteActive__Group__0 : rule__CarteActive__Group__0__Impl rule__CarteActive__Group__1 ;
    public final void rule__CarteActive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1818:1: ( rule__CarteActive__Group__0__Impl rule__CarteActive__Group__1 )
            // InternalUnoDsl.g:1819:2: rule__CarteActive__Group__0__Impl rule__CarteActive__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CarteActive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteActive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__0"


    // $ANTLR start "rule__CarteActive__Group__0__Impl"
    // InternalUnoDsl.g:1826:1: rule__CarteActive__Group__0__Impl : ( ( rule__CarteActive__Alternatives_0 ) ) ;
    public final void rule__CarteActive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1830:1: ( ( ( rule__CarteActive__Alternatives_0 ) ) )
            // InternalUnoDsl.g:1831:1: ( ( rule__CarteActive__Alternatives_0 ) )
            {
            // InternalUnoDsl.g:1831:1: ( ( rule__CarteActive__Alternatives_0 ) )
            // InternalUnoDsl.g:1832:2: ( rule__CarteActive__Alternatives_0 )
            {
             before(grammarAccess.getCarteActiveAccess().getAlternatives_0()); 
            // InternalUnoDsl.g:1833:2: ( rule__CarteActive__Alternatives_0 )
            // InternalUnoDsl.g:1833:3: rule__CarteActive__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CarteActive__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCarteActiveAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__0__Impl"


    // $ANTLR start "rule__CarteActive__Group__1"
    // InternalUnoDsl.g:1841:1: rule__CarteActive__Group__1 : rule__CarteActive__Group__1__Impl rule__CarteActive__Group__2 ;
    public final void rule__CarteActive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1845:1: ( rule__CarteActive__Group__1__Impl rule__CarteActive__Group__2 )
            // InternalUnoDsl.g:1846:2: rule__CarteActive__Group__1__Impl rule__CarteActive__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CarteActive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CarteActive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__1"


    // $ANTLR start "rule__CarteActive__Group__1__Impl"
    // InternalUnoDsl.g:1853:1: rule__CarteActive__Group__1__Impl : ( '-couleur-' ) ;
    public final void rule__CarteActive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1857:1: ( ( '-couleur-' ) )
            // InternalUnoDsl.g:1858:1: ( '-couleur-' )
            {
            // InternalUnoDsl.g:1858:1: ( '-couleur-' )
            // InternalUnoDsl.g:1859:2: '-couleur-'
            {
             before(grammarAccess.getCarteActiveAccess().getCouleurKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCarteActiveAccess().getCouleurKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__1__Impl"


    // $ANTLR start "rule__CarteActive__Group__2"
    // InternalUnoDsl.g:1868:1: rule__CarteActive__Group__2 : rule__CarteActive__Group__2__Impl ;
    public final void rule__CarteActive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1872:1: ( rule__CarteActive__Group__2__Impl )
            // InternalUnoDsl.g:1873:2: rule__CarteActive__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CarteActive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__2"


    // $ANTLR start "rule__CarteActive__Group__2__Impl"
    // InternalUnoDsl.g:1879:1: rule__CarteActive__Group__2__Impl : ( ( rule__CarteActive__CouleurAssignment_2 ) ) ;
    public final void rule__CarteActive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1883:1: ( ( ( rule__CarteActive__CouleurAssignment_2 ) ) )
            // InternalUnoDsl.g:1884:1: ( ( rule__CarteActive__CouleurAssignment_2 ) )
            {
            // InternalUnoDsl.g:1884:1: ( ( rule__CarteActive__CouleurAssignment_2 ) )
            // InternalUnoDsl.g:1885:2: ( rule__CarteActive__CouleurAssignment_2 )
            {
             before(grammarAccess.getCarteActiveAccess().getCouleurAssignment_2()); 
            // InternalUnoDsl.g:1886:2: ( rule__CarteActive__CouleurAssignment_2 )
            // InternalUnoDsl.g:1886:3: rule__CarteActive__CouleurAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CarteActive__CouleurAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCarteActiveAccess().getCouleurAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__Group__2__Impl"


    // $ANTLR start "rule__UnoDsl__ReglesAssignment_2"
    // InternalUnoDsl.g:1895:1: rule__UnoDsl__ReglesAssignment_2 : ( ruleRegleJeu ) ;
    public final void rule__UnoDsl__ReglesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1899:1: ( ( ruleRegleJeu ) )
            // InternalUnoDsl.g:1900:2: ( ruleRegleJeu )
            {
            // InternalUnoDsl.g:1900:2: ( ruleRegleJeu )
            // InternalUnoDsl.g:1901:3: ruleRegleJeu
            {
             before(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRegleJeu();

            state._fsp--;

             after(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__ReglesAssignment_2"


    // $ANTLR start "rule__UnoDsl__ReglesAssignment_3_1"
    // InternalUnoDsl.g:1910:1: rule__UnoDsl__ReglesAssignment_3_1 : ( ruleRegleJeu ) ;
    public final void rule__UnoDsl__ReglesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1914:1: ( ( ruleRegleJeu ) )
            // InternalUnoDsl.g:1915:2: ( ruleRegleJeu )
            {
            // InternalUnoDsl.g:1915:2: ( ruleRegleJeu )
            // InternalUnoDsl.g:1916:3: ruleRegleJeu
            {
             before(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRegleJeu();

            state._fsp--;

             after(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoDsl__ReglesAssignment_3_1"


    // $ANTLR start "rule__RegleJeu__NameAssignment_1_1"
    // InternalUnoDsl.g:1925:1: rule__RegleJeu__NameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__RegleJeu__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1929:1: ( ( RULE_STRING ) )
            // InternalUnoDsl.g:1930:2: ( RULE_STRING )
            {
            // InternalUnoDsl.g:1930:2: ( RULE_STRING )
            // InternalUnoDsl.g:1931:3: RULE_STRING
            {
             before(grammarAccess.getRegleJeuAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__NameAssignment_1_1"


    // $ANTLR start "rule__RegleJeu__DescriptionAssignment_2_1"
    // InternalUnoDsl.g:1940:1: rule__RegleJeu__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RegleJeu__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1944:1: ( ( RULE_STRING ) )
            // InternalUnoDsl.g:1945:2: ( RULE_STRING )
            {
            // InternalUnoDsl.g:1945:2: ( RULE_STRING )
            // InternalUnoDsl.g:1946:3: RULE_STRING
            {
             before(grammarAccess.getRegleJeuAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegleJeuAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__DescriptionAssignment_2_1"


    // $ANTLR start "rule__RegleJeu__ExigenceAssignment_3_2_0"
    // InternalUnoDsl.g:1955:1: rule__RegleJeu__ExigenceAssignment_3_2_0 : ( ruleExigence ) ;
    public final void rule__RegleJeu__ExigenceAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1959:1: ( ( ruleExigence ) )
            // InternalUnoDsl.g:1960:2: ( ruleExigence )
            {
            // InternalUnoDsl.g:1960:2: ( ruleExigence )
            // InternalUnoDsl.g:1961:3: ruleExigence
            {
             before(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExigence();

            state._fsp--;

             after(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__ExigenceAssignment_3_2_0"


    // $ANTLR start "rule__RegleJeu__ExigenceAssignment_3_3"
    // InternalUnoDsl.g:1970:1: rule__RegleJeu__ExigenceAssignment_3_3 : ( ruleExigence ) ;
    public final void rule__RegleJeu__ExigenceAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1974:1: ( ( ruleExigence ) )
            // InternalUnoDsl.g:1975:2: ( ruleExigence )
            {
            // InternalUnoDsl.g:1975:2: ( ruleExigence )
            // InternalUnoDsl.g:1976:3: ruleExigence
            {
             before(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExigence();

            state._fsp--;

             after(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegleJeu__ExigenceAssignment_3_3"


    // $ANTLR start "rule__Exigence__Expr1Assignment_0"
    // InternalUnoDsl.g:1985:1: rule__Exigence__Expr1Assignment_0 : ( ruleExpr1 ) ;
    public final void rule__Exigence__Expr1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1989:1: ( ( ruleExpr1 ) )
            // InternalUnoDsl.g:1990:2: ( ruleExpr1 )
            {
            // InternalUnoDsl.g:1990:2: ( ruleExpr1 )
            // InternalUnoDsl.g:1991:3: ruleExpr1
            {
             before(grammarAccess.getExigenceAccess().getExpr1Expr1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr1();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getExpr1Expr1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Expr1Assignment_0"


    // $ANTLR start "rule__Exigence__Linker1Assignment_1"
    // InternalUnoDsl.g:2000:1: rule__Exigence__Linker1Assignment_1 : ( ruleLinker1 ) ;
    public final void rule__Exigence__Linker1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2004:1: ( ( ruleLinker1 ) )
            // InternalUnoDsl.g:2005:2: ( ruleLinker1 )
            {
            // InternalUnoDsl.g:2005:2: ( ruleLinker1 )
            // InternalUnoDsl.g:2006:3: ruleLinker1
            {
             before(grammarAccess.getExigenceAccess().getLinker1Linker1ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLinker1();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getLinker1Linker1ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Linker1Assignment_1"


    // $ANTLR start "rule__Exigence__Linker2Assignment_2"
    // InternalUnoDsl.g:2015:1: rule__Exigence__Linker2Assignment_2 : ( ruleLinker2 ) ;
    public final void rule__Exigence__Linker2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2019:1: ( ( ruleLinker2 ) )
            // InternalUnoDsl.g:2020:2: ( ruleLinker2 )
            {
            // InternalUnoDsl.g:2020:2: ( ruleLinker2 )
            // InternalUnoDsl.g:2021:3: ruleLinker2
            {
             before(grammarAccess.getExigenceAccess().getLinker2Linker2ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinker2();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getLinker2Linker2ParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Linker2Assignment_2"


    // $ANTLR start "rule__Exigence__CarteAssignment_3_0"
    // InternalUnoDsl.g:2030:1: rule__Exigence__CarteAssignment_3_0 : ( ruleCarte ) ;
    public final void rule__Exigence__CarteAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2034:1: ( ( ruleCarte ) )
            // InternalUnoDsl.g:2035:2: ( ruleCarte )
            {
            // InternalUnoDsl.g:2035:2: ( ruleCarte )
            // InternalUnoDsl.g:2036:3: ruleCarte
            {
             before(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCarte();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__CarteAssignment_3_0"


    // $ANTLR start "rule__Exigence__CarteAssignment_3_1_1"
    // InternalUnoDsl.g:2045:1: rule__Exigence__CarteAssignment_3_1_1 : ( ruleCarte ) ;
    public final void rule__Exigence__CarteAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2049:1: ( ( ruleCarte ) )
            // InternalUnoDsl.g:2050:2: ( ruleCarte )
            {
            // InternalUnoDsl.g:2050:2: ( ruleCarte )
            // InternalUnoDsl.g:2051:3: ruleCarte
            {
             before(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCarte();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__CarteAssignment_3_1_1"


    // $ANTLR start "rule__Exigence__Linker3Assignment_4"
    // InternalUnoDsl.g:2060:1: rule__Exigence__Linker3Assignment_4 : ( ruleLinker3 ) ;
    public final void rule__Exigence__Linker3Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2064:1: ( ( ruleLinker3 ) )
            // InternalUnoDsl.g:2065:2: ( ruleLinker3 )
            {
            // InternalUnoDsl.g:2065:2: ( ruleLinker3 )
            // InternalUnoDsl.g:2066:3: ruleLinker3
            {
             before(grammarAccess.getExigenceAccess().getLinker3Linker3ParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLinker3();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getLinker3Linker3ParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Linker3Assignment_4"


    // $ANTLR start "rule__Exigence__Expr2Assignment_5"
    // InternalUnoDsl.g:2075:1: rule__Exigence__Expr2Assignment_5 : ( ruleExpr2 ) ;
    public final void rule__Exigence__Expr2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2079:1: ( ( ruleExpr2 ) )
            // InternalUnoDsl.g:2080:2: ( ruleExpr2 )
            {
            // InternalUnoDsl.g:2080:2: ( ruleExpr2 )
            // InternalUnoDsl.g:2081:3: ruleExpr2
            {
             before(grammarAccess.getExigenceAccess().getExpr2Expr2ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr2();

            state._fsp--;

             after(grammarAccess.getExigenceAccess().getExpr2Expr2ParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exigence__Expr2Assignment_5"


    // $ANTLR start "rule__CarteClassique__NumeroCarteAssignment_1"
    // InternalUnoDsl.g:2090:1: rule__CarteClassique__NumeroCarteAssignment_1 : ( RULE_INT ) ;
    public final void rule__CarteClassique__NumeroCarteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2094:1: ( ( RULE_INT ) )
            // InternalUnoDsl.g:2095:2: ( RULE_INT )
            {
            // InternalUnoDsl.g:2095:2: ( RULE_INT )
            // InternalUnoDsl.g:2096:3: RULE_INT
            {
             before(grammarAccess.getCarteClassiqueAccess().getNumeroCarteINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCarteClassiqueAccess().getNumeroCarteINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__NumeroCarteAssignment_1"


    // $ANTLR start "rule__CarteClassique__CouleurAssignment_2_1"
    // InternalUnoDsl.g:2105:1: rule__CarteClassique__CouleurAssignment_2_1 : ( ruleCouleurCarte ) ;
    public final void rule__CarteClassique__CouleurAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2109:1: ( ( ruleCouleurCarte ) )
            // InternalUnoDsl.g:2110:2: ( ruleCouleurCarte )
            {
            // InternalUnoDsl.g:2110:2: ( ruleCouleurCarte )
            // InternalUnoDsl.g:2111:3: ruleCouleurCarte
            {
             before(grammarAccess.getCarteClassiqueAccess().getCouleurCouleurCarteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCouleurCarte();

            state._fsp--;

             after(grammarAccess.getCarteClassiqueAccess().getCouleurCouleurCarteParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteClassique__CouleurAssignment_2_1"


    // $ANTLR start "rule__CarteActive__CouleurAssignment_2"
    // InternalUnoDsl.g:2120:1: rule__CarteActive__CouleurAssignment_2 : ( ruleCouleurCarte ) ;
    public final void rule__CarteActive__CouleurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2124:1: ( ( ruleCouleurCarte ) )
            // InternalUnoDsl.g:2125:2: ( ruleCouleurCarte )
            {
            // InternalUnoDsl.g:2125:2: ( ruleCouleurCarte )
            // InternalUnoDsl.g:2126:3: ruleCouleurCarte
            {
             before(grammarAccess.getCarteActiveAccess().getCouleurCouleurCarteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCouleurCarte();

            state._fsp--;

             after(grammarAccess.getCarteActiveAccess().getCouleurCouleurCarteParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CarteActive__CouleurAssignment_2"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\13\3\16\2\20\10\30\1\5\3\67\3\30\2\32\11\57\2\uffff\1\67\1\51\1\13\1\51\4\30\1\5\3\67\7\30\1\67\2\51\10\30";
    static final String dfa_3s = "\1\15\5\27\10\66\1\5\3\67\16\60\2\uffff\1\67\1\54\1\66\1\54\4\60\1\5\3\67\7\60\1\67\2\54\10\60";
    static final String dfa_4s = "\40\uffff\1\2\1\1\36\uffff";
    static final String dfa_5s = "\100\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\17\1\20\1\21\1\22\1\23\1\24\6\uffff\1\40\1\41\5\uffff\1\16",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\41",
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "",
            "",
            "\1\45",
            "\1\46\1\47\1\50\1\51",
            "\3\41\25\uffff\1\53\1\54\1\55\1\56\1\57\1\60\15\uffff\1\52",
            "\1\61\1\62\1\63\1\64",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\67",
            "\1\70\1\71\1\72\1\73",
            "\1\74\1\75\1\76\1\77",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\14\uffff\1\40\1\44"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1239:2: ( rule__RegleJeu__Group_3_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000FFC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x004001FFFF000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x004001F800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E0000000000L});

}