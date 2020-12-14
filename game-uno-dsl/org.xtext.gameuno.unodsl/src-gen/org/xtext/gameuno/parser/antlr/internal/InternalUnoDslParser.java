package org.xtext.gameuno.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.gameuno.services.UnoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'regles:'", "'['", "','", "']'", "'{'", "'nom_regle:'", "'description:'", "'exigences:'", "'}'", "'le joueur'", "'joueurs'", "'le jeu'", "'dit interception et '", "'suivant'", "'pose'", "'pioche'", "'limite'", "'gagne'", "'tourne'", "'impose'", "'echange'", "'passe'", "'si meme couleur'", "'si meme numero'", "'sur la pile-talon'", "'de la pioche-pile'", "'le temps de la manche'", "'dans le sens inverse'", "'les mains'", "'si points accumules 500'", "'si carte pioch\\u00E9e +elevee'", "'ses cartes avec autre joueur'", "'son tour'", "'carte-numero-'", "'-couleur-'", "'carte-passer-tour'", "'carte-plus-2'", "'carte-inversion'", "'carte-plus-4'", "'carte-joker'", "'carte-uno'", "'rouge'", "'jaune'", "'bleu'", "'vert'"
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

        public InternalUnoDslParser(TokenStream input, UnoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UnoDsl";
       	}

       	@Override
       	protected UnoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUnoDsl"
    // InternalUnoDsl.g:64:1: entryRuleUnoDsl returns [EObject current=null] : iv_ruleUnoDsl= ruleUnoDsl EOF ;
    public final EObject entryRuleUnoDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnoDsl = null;


        try {
            // InternalUnoDsl.g:64:47: (iv_ruleUnoDsl= ruleUnoDsl EOF )
            // InternalUnoDsl.g:65:2: iv_ruleUnoDsl= ruleUnoDsl EOF
            {
             newCompositeNode(grammarAccess.getUnoDslRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnoDsl=ruleUnoDsl();

            state._fsp--;

             current =iv_ruleUnoDsl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnoDsl"


    // $ANTLR start "ruleUnoDsl"
    // InternalUnoDsl.g:71:1: ruleUnoDsl returns [EObject current=null] : (otherlv_0= 'regles:' otherlv_1= '[' ( (lv_regles_2_0= ruleRegleJeu ) ) (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleUnoDsl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_regles_2_0 = null;

        EObject lv_regles_4_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:77:2: ( (otherlv_0= 'regles:' otherlv_1= '[' ( (lv_regles_2_0= ruleRegleJeu ) ) (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )* otherlv_5= ']' ) )
            // InternalUnoDsl.g:78:2: (otherlv_0= 'regles:' otherlv_1= '[' ( (lv_regles_2_0= ruleRegleJeu ) ) (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )* otherlv_5= ']' )
            {
            // InternalUnoDsl.g:78:2: (otherlv_0= 'regles:' otherlv_1= '[' ( (lv_regles_2_0= ruleRegleJeu ) ) (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )* otherlv_5= ']' )
            // InternalUnoDsl.g:79:3: otherlv_0= 'regles:' otherlv_1= '[' ( (lv_regles_2_0= ruleRegleJeu ) ) (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnoDslAccess().getReglesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnoDslAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalUnoDsl.g:87:3: ( (lv_regles_2_0= ruleRegleJeu ) )
            // InternalUnoDsl.g:88:4: (lv_regles_2_0= ruleRegleJeu )
            {
            // InternalUnoDsl.g:88:4: (lv_regles_2_0= ruleRegleJeu )
            // InternalUnoDsl.g:89:5: lv_regles_2_0= ruleRegleJeu
            {

            					newCompositeNode(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_regles_2_0=ruleRegleJeu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoDslRule());
            					}
            					add(
            						current,
            						"regles",
            						lv_regles_2_0,
            						"org.xtext.gameuno.UnoDsl.RegleJeu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUnoDsl.g:106:3: (otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUnoDsl.g:107:4: otherlv_3= ',' ( (lv_regles_4_0= ruleRegleJeu ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnoDslAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalUnoDsl.g:111:4: ( (lv_regles_4_0= ruleRegleJeu ) )
            	    // InternalUnoDsl.g:112:5: (lv_regles_4_0= ruleRegleJeu )
            	    {
            	    // InternalUnoDsl.g:112:5: (lv_regles_4_0= ruleRegleJeu )
            	    // InternalUnoDsl.g:113:6: lv_regles_4_0= ruleRegleJeu
            	    {

            	    						newCompositeNode(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_regles_4_0=ruleRegleJeu();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnoDslRule());
            	    						}
            	    						add(
            	    							current,
            	    							"regles",
            	    							lv_regles_4_0,
            	    							"org.xtext.gameuno.UnoDsl.RegleJeu");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnoDslAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnoDsl"


    // $ANTLR start "entryRuleRegleJeu"
    // InternalUnoDsl.g:139:1: entryRuleRegleJeu returns [EObject current=null] : iv_ruleRegleJeu= ruleRegleJeu EOF ;
    public final EObject entryRuleRegleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegleJeu = null;


        try {
            // InternalUnoDsl.g:139:49: (iv_ruleRegleJeu= ruleRegleJeu EOF )
            // InternalUnoDsl.g:140:2: iv_ruleRegleJeu= ruleRegleJeu EOF
            {
             newCompositeNode(grammarAccess.getRegleJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegleJeu=ruleRegleJeu();

            state._fsp--;

             current =iv_ruleRegleJeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegleJeu"


    // $ANTLR start "ruleRegleJeu"
    // InternalUnoDsl.g:146:1: ruleRegleJeu returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' ) otherlv_13= '}' ) ;
    public final EObject ruleRegleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_exigence_9_0 = null;

        EObject lv_exigence_11_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:152:2: ( (otherlv_0= '{' (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' ) otherlv_13= '}' ) )
            // InternalUnoDsl.g:153:2: (otherlv_0= '{' (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' ) otherlv_13= '}' )
            {
            // InternalUnoDsl.g:153:2: (otherlv_0= '{' (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' ) otherlv_13= '}' )
            // InternalUnoDsl.g:154:3: otherlv_0= '{' (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' ) (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRegleJeuAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalUnoDsl.g:158:3: (otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' )
            // InternalUnoDsl.g:159:4: otherlv_1= 'nom_regle:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ','
            {
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            				newLeafNode(otherlv_1, grammarAccess.getRegleJeuAccess().getNom_regleKeyword_1_0());
            			
            // InternalUnoDsl.g:163:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUnoDsl.g:164:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalUnoDsl.g:164:5: (lv_name_2_0= RULE_STRING )
            // InternalUnoDsl.g:165:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            						newLeafNode(lv_name_2_0, grammarAccess.getRegleJeuAccess().getNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRegleJeuRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            				newLeafNode(otherlv_3, grammarAccess.getRegleJeuAccess().getCommaKeyword_1_2());
            			

            }

            // InternalUnoDsl.g:186:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ',' )
            // InternalUnoDsl.g:187:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ','
            {
            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            				newLeafNode(otherlv_4, grammarAccess.getRegleJeuAccess().getDescriptionKeyword_2_0());
            			
            // InternalUnoDsl.g:191:4: ( (lv_description_5_0= RULE_STRING ) )
            // InternalUnoDsl.g:192:5: (lv_description_5_0= RULE_STRING )
            {
            // InternalUnoDsl.g:192:5: (lv_description_5_0= RULE_STRING )
            // InternalUnoDsl.g:193:6: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            						newLeafNode(lv_description_5_0, grammarAccess.getRegleJeuAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRegleJeuRule());
            						}
            						setWithLastConsumed(
            							current,
            							"description",
            							lv_description_5_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            				newLeafNode(otherlv_6, grammarAccess.getRegleJeuAccess().getCommaKeyword_2_2());
            			

            }

            // InternalUnoDsl.g:214:3: (otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']' )
            // InternalUnoDsl.g:215:4: otherlv_7= 'exigences:' otherlv_8= '[' ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )* ( (lv_exigence_11_0= ruleExigence ) ) otherlv_12= ']'
            {
            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_7, grammarAccess.getRegleJeuAccess().getExigencesKeyword_3_0());
            			
            otherlv_8=(Token)match(input,12,FOLLOW_11); 

            				newLeafNode(otherlv_8, grammarAccess.getRegleJeuAccess().getLeftSquareBracketKeyword_3_1());
            			
            // InternalUnoDsl.g:223:4: ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalUnoDsl.g:224:5: ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ','
            	    {
            	    // InternalUnoDsl.g:224:5: ( (lv_exigence_9_0= ruleExigence ) )
            	    // InternalUnoDsl.g:225:6: (lv_exigence_9_0= ruleExigence )
            	    {
            	    // InternalUnoDsl.g:225:6: (lv_exigence_9_0= ruleExigence )
            	    // InternalUnoDsl.g:226:7: lv_exigence_9_0= ruleExigence
            	    {

            	    							newCompositeNode(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_2_0_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_exigence_9_0=ruleExigence();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRegleJeuRule());
            	    							}
            	    							add(
            	    								current,
            	    								"exigence",
            	    								lv_exigence_9_0,
            	    								"org.xtext.gameuno.UnoDsl.Exigence");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FOLLOW_11); 

            	    					newLeafNode(otherlv_10, grammarAccess.getRegleJeuAccess().getCommaKeyword_3_2_1());
            	    				

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUnoDsl.g:248:4: ( (lv_exigence_11_0= ruleExigence ) )
            // InternalUnoDsl.g:249:5: (lv_exigence_11_0= ruleExigence )
            {
            // InternalUnoDsl.g:249:5: (lv_exigence_11_0= ruleExigence )
            // InternalUnoDsl.g:250:6: lv_exigence_11_0= ruleExigence
            {

            						newCompositeNode(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_3_0());
            					
            pushFollow(FOLLOW_12);
            lv_exigence_11_0=ruleExigence();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRegleJeuRule());
            						}
            						add(
            							current,
            							"exigence",
            							lv_exigence_11_0,
            							"org.xtext.gameuno.UnoDsl.Exigence");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_13); 

            				newLeafNode(otherlv_12, grammarAccess.getRegleJeuAccess().getRightSquareBracketKeyword_3_4());
            			

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRegleJeuAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegleJeu"


    // $ANTLR start "entryRuleExigence"
    // InternalUnoDsl.g:280:1: entryRuleExigence returns [EObject current=null] : iv_ruleExigence= ruleExigence EOF ;
    public final EObject entryRuleExigence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExigence = null;


        try {
            // InternalUnoDsl.g:280:49: (iv_ruleExigence= ruleExigence EOF )
            // InternalUnoDsl.g:281:2: iv_ruleExigence= ruleExigence EOF
            {
             newCompositeNode(grammarAccess.getExigenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExigence=ruleExigence();

            state._fsp--;

             current =iv_ruleExigence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExigence"


    // $ANTLR start "ruleExigence"
    // InternalUnoDsl.g:287:1: ruleExigence returns [EObject current=null] : ( ( (lv_expr1_0_0= ruleExpr1 ) ) ( (lv_linker1_1_0= ruleLinker1 ) )? ( (lv_linker2_2_0= ruleLinker2 ) ) ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )? ( (lv_linker3_6_0= ruleLinker3 ) )? ( (lv_expr2_7_0= ruleExpr2 ) )? ) ;
    public final EObject ruleExigence() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expr1_0_0 = null;

        AntlrDatatypeRuleToken lv_linker1_1_0 = null;

        AntlrDatatypeRuleToken lv_linker2_2_0 = null;

        EObject lv_carte_3_0 = null;

        EObject lv_carte_5_0 = null;

        AntlrDatatypeRuleToken lv_linker3_6_0 = null;

        AntlrDatatypeRuleToken lv_expr2_7_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:293:2: ( ( ( (lv_expr1_0_0= ruleExpr1 ) ) ( (lv_linker1_1_0= ruleLinker1 ) )? ( (lv_linker2_2_0= ruleLinker2 ) ) ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )? ( (lv_linker3_6_0= ruleLinker3 ) )? ( (lv_expr2_7_0= ruleExpr2 ) )? ) )
            // InternalUnoDsl.g:294:2: ( ( (lv_expr1_0_0= ruleExpr1 ) ) ( (lv_linker1_1_0= ruleLinker1 ) )? ( (lv_linker2_2_0= ruleLinker2 ) ) ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )? ( (lv_linker3_6_0= ruleLinker3 ) )? ( (lv_expr2_7_0= ruleExpr2 ) )? )
            {
            // InternalUnoDsl.g:294:2: ( ( (lv_expr1_0_0= ruleExpr1 ) ) ( (lv_linker1_1_0= ruleLinker1 ) )? ( (lv_linker2_2_0= ruleLinker2 ) ) ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )? ( (lv_linker3_6_0= ruleLinker3 ) )? ( (lv_expr2_7_0= ruleExpr2 ) )? )
            // InternalUnoDsl.g:295:3: ( (lv_expr1_0_0= ruleExpr1 ) ) ( (lv_linker1_1_0= ruleLinker1 ) )? ( (lv_linker2_2_0= ruleLinker2 ) ) ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )? ( (lv_linker3_6_0= ruleLinker3 ) )? ( (lv_expr2_7_0= ruleExpr2 ) )?
            {
            // InternalUnoDsl.g:295:3: ( (lv_expr1_0_0= ruleExpr1 ) )
            // InternalUnoDsl.g:296:4: (lv_expr1_0_0= ruleExpr1 )
            {
            // InternalUnoDsl.g:296:4: (lv_expr1_0_0= ruleExpr1 )
            // InternalUnoDsl.g:297:5: lv_expr1_0_0= ruleExpr1
            {

            					newCompositeNode(grammarAccess.getExigenceAccess().getExpr1Expr1ParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr1_0_0=ruleExpr1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExigenceRule());
            					}
            					set(
            						current,
            						"expr1",
            						lv_expr1_0_0,
            						"org.xtext.gameuno.UnoDsl.Expr1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUnoDsl.g:314:3: ( (lv_linker1_1_0= ruleLinker1 ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=23 && LA3_0<=24)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUnoDsl.g:315:4: (lv_linker1_1_0= ruleLinker1 )
                    {
                    // InternalUnoDsl.g:315:4: (lv_linker1_1_0= ruleLinker1 )
                    // InternalUnoDsl.g:316:5: lv_linker1_1_0= ruleLinker1
                    {

                    					newCompositeNode(grammarAccess.getExigenceAccess().getLinker1Linker1ParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_linker1_1_0=ruleLinker1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExigenceRule());
                    					}
                    					set(
                    						current,
                    						"linker1",
                    						lv_linker1_1_0,
                    						"org.xtext.gameuno.UnoDsl.Linker1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUnoDsl.g:333:3: ( (lv_linker2_2_0= ruleLinker2 ) )
            // InternalUnoDsl.g:334:4: (lv_linker2_2_0= ruleLinker2 )
            {
            // InternalUnoDsl.g:334:4: (lv_linker2_2_0= ruleLinker2 )
            // InternalUnoDsl.g:335:5: lv_linker2_2_0= ruleLinker2
            {

            					newCompositeNode(grammarAccess.getExigenceAccess().getLinker2Linker2ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_linker2_2_0=ruleLinker2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExigenceRule());
            					}
            					set(
            						current,
            						"linker2",
            						lv_linker2_2_0,
            						"org.xtext.gameuno.UnoDsl.Linker2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUnoDsl.g:352:3: ( ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44||(LA5_0>=46 && LA5_0<=51)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnoDsl.g:353:4: ( (lv_carte_3_0= ruleCarte ) ) (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )*
                    {
                    // InternalUnoDsl.g:353:4: ( (lv_carte_3_0= ruleCarte ) )
                    // InternalUnoDsl.g:354:5: (lv_carte_3_0= ruleCarte )
                    {
                    // InternalUnoDsl.g:354:5: (lv_carte_3_0= ruleCarte )
                    // InternalUnoDsl.g:355:6: lv_carte_3_0= ruleCarte
                    {

                    						newCompositeNode(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_carte_3_0=ruleCarte();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExigenceRule());
                    						}
                    						add(
                    							current,
                    							"carte",
                    							lv_carte_3_0,
                    							"org.xtext.gameuno.UnoDsl.Carte");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUnoDsl.g:372:4: (otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==44||(LA4_2>=46 && LA4_2<=51)) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUnoDsl.g:373:5: otherlv_4= ',' ( (lv_carte_5_0= ruleCarte ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExigenceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUnoDsl.g:377:5: ( (lv_carte_5_0= ruleCarte ) )
                    	    // InternalUnoDsl.g:378:6: (lv_carte_5_0= ruleCarte )
                    	    {
                    	    // InternalUnoDsl.g:378:6: (lv_carte_5_0= ruleCarte )
                    	    // InternalUnoDsl.g:379:7: lv_carte_5_0= ruleCarte
                    	    {

                    	    							newCompositeNode(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_carte_5_0=ruleCarte();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExigenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"carte",
                    	    								lv_carte_5_0,
                    	    								"org.xtext.gameuno.UnoDsl.Carte");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUnoDsl.g:398:3: ( (lv_linker3_6_0= ruleLinker3 ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=33 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnoDsl.g:399:4: (lv_linker3_6_0= ruleLinker3 )
                    {
                    // InternalUnoDsl.g:399:4: (lv_linker3_6_0= ruleLinker3 )
                    // InternalUnoDsl.g:400:5: lv_linker3_6_0= ruleLinker3
                    {

                    					newCompositeNode(grammarAccess.getExigenceAccess().getLinker3Linker3ParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_linker3_6_0=ruleLinker3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExigenceRule());
                    					}
                    					set(
                    						current,
                    						"linker3",
                    						lv_linker3_6_0,
                    						"org.xtext.gameuno.UnoDsl.Linker3");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUnoDsl.g:417:3: ( (lv_expr2_7_0= ruleExpr2 ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=35 && LA7_0<=43)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUnoDsl.g:418:4: (lv_expr2_7_0= ruleExpr2 )
                    {
                    // InternalUnoDsl.g:418:4: (lv_expr2_7_0= ruleExpr2 )
                    // InternalUnoDsl.g:419:5: lv_expr2_7_0= ruleExpr2
                    {

                    					newCompositeNode(grammarAccess.getExigenceAccess().getExpr2Expr2ParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expr2_7_0=ruleExpr2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExigenceRule());
                    					}
                    					set(
                    						current,
                    						"expr2",
                    						lv_expr2_7_0,
                    						"org.xtext.gameuno.UnoDsl.Expr2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExigence"


    // $ANTLR start "entryRuleExpr1"
    // InternalUnoDsl.g:440:1: entryRuleExpr1 returns [String current=null] : iv_ruleExpr1= ruleExpr1 EOF ;
    public final String entryRuleExpr1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr1 = null;


        try {
            // InternalUnoDsl.g:440:45: (iv_ruleExpr1= ruleExpr1 EOF )
            // InternalUnoDsl.g:441:2: iv_ruleExpr1= ruleExpr1 EOF
            {
             newCompositeNode(grammarAccess.getExpr1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr1=ruleExpr1();

            state._fsp--;

             current =iv_ruleExpr1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr1"


    // $ANTLR start "ruleExpr1"
    // InternalUnoDsl.g:447:1: ruleExpr1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'le joueur' | kw= 'joueurs' | kw= 'le jeu' ) ;
    public final AntlrDatatypeRuleToken ruleExpr1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:453:2: ( (kw= 'le joueur' | kw= 'joueurs' | kw= 'le jeu' ) )
            // InternalUnoDsl.g:454:2: (kw= 'le joueur' | kw= 'joueurs' | kw= 'le jeu' )
            {
            // InternalUnoDsl.g:454:2: (kw= 'le joueur' | kw= 'joueurs' | kw= 'le jeu' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
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
                    // InternalUnoDsl.g:455:3: kw= 'le joueur'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr1Access().getLeJoueurKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:461:3: kw= 'joueurs'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr1Access().getJoueursKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:467:3: kw= 'le jeu'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr1Access().getLeJeuKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr1"


    // $ANTLR start "entryRuleLinker1"
    // InternalUnoDsl.g:476:1: entryRuleLinker1 returns [String current=null] : iv_ruleLinker1= ruleLinker1 EOF ;
    public final String entryRuleLinker1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinker1 = null;


        try {
            // InternalUnoDsl.g:476:47: (iv_ruleLinker1= ruleLinker1 EOF )
            // InternalUnoDsl.g:477:2: iv_ruleLinker1= ruleLinker1 EOF
            {
             newCompositeNode(grammarAccess.getLinker1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinker1=ruleLinker1();

            state._fsp--;

             current =iv_ruleLinker1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinker1"


    // $ANTLR start "ruleLinker1"
    // InternalUnoDsl.g:483:1: ruleLinker1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'dit interception et ' | kw= 'suivant' ) ;
    public final AntlrDatatypeRuleToken ruleLinker1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:489:2: ( (kw= 'dit interception et ' | kw= 'suivant' ) )
            // InternalUnoDsl.g:490:2: (kw= 'dit interception et ' | kw= 'suivant' )
            {
            // InternalUnoDsl.g:490:2: (kw= 'dit interception et ' | kw= 'suivant' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUnoDsl.g:491:3: kw= 'dit interception et '
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker1Access().getDitInterceptionEtKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:497:3: kw= 'suivant'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker1Access().getSuivantKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinker1"


    // $ANTLR start "entryRuleLinker2"
    // InternalUnoDsl.g:506:1: entryRuleLinker2 returns [String current=null] : iv_ruleLinker2= ruleLinker2 EOF ;
    public final String entryRuleLinker2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinker2 = null;


        try {
            // InternalUnoDsl.g:506:47: (iv_ruleLinker2= ruleLinker2 EOF )
            // InternalUnoDsl.g:507:2: iv_ruleLinker2= ruleLinker2 EOF
            {
             newCompositeNode(grammarAccess.getLinker2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinker2=ruleLinker2();

            state._fsp--;

             current =iv_ruleLinker2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinker2"


    // $ANTLR start "ruleLinker2"
    // InternalUnoDsl.g:513:1: ruleLinker2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'pose' | kw= 'pioche' | kw= 'limite' | kw= 'gagne' | kw= 'tourne' | kw= 'impose' | kw= 'echange' | kw= 'passe' ) ;
    public final AntlrDatatypeRuleToken ruleLinker2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:519:2: ( (kw= 'pose' | kw= 'pioche' | kw= 'limite' | kw= 'gagne' | kw= 'tourne' | kw= 'impose' | kw= 'echange' | kw= 'passe' ) )
            // InternalUnoDsl.g:520:2: (kw= 'pose' | kw= 'pioche' | kw= 'limite' | kw= 'gagne' | kw= 'tourne' | kw= 'impose' | kw= 'echange' | kw= 'passe' )
            {
            // InternalUnoDsl.g:520:2: (kw= 'pose' | kw= 'pioche' | kw= 'limite' | kw= 'gagne' | kw= 'tourne' | kw= 'impose' | kw= 'echange' | kw= 'passe' )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 30:
                {
                alt10=6;
                }
                break;
            case 31:
                {
                alt10=7;
                }
                break;
            case 32:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUnoDsl.g:521:3: kw= 'pose'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getPoseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:527:3: kw= 'pioche'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getPiocheKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:533:3: kw= 'limite'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getLimiteKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:539:3: kw= 'gagne'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getGagneKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:545:3: kw= 'tourne'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getTourneKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:551:3: kw= 'impose'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getImposeKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalUnoDsl.g:557:3: kw= 'echange'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getEchangeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalUnoDsl.g:563:3: kw= 'passe'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker2Access().getPasseKeyword_7());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinker2"


    // $ANTLR start "entryRuleLinker3"
    // InternalUnoDsl.g:572:1: entryRuleLinker3 returns [String current=null] : iv_ruleLinker3= ruleLinker3 EOF ;
    public final String entryRuleLinker3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinker3 = null;


        try {
            // InternalUnoDsl.g:572:47: (iv_ruleLinker3= ruleLinker3 EOF )
            // InternalUnoDsl.g:573:2: iv_ruleLinker3= ruleLinker3 EOF
            {
             newCompositeNode(grammarAccess.getLinker3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinker3=ruleLinker3();

            state._fsp--;

             current =iv_ruleLinker3.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinker3"


    // $ANTLR start "ruleLinker3"
    // InternalUnoDsl.g:579:1: ruleLinker3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'si meme couleur' | kw= 'si meme numero' ) ;
    public final AntlrDatatypeRuleToken ruleLinker3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:585:2: ( (kw= 'si meme couleur' | kw= 'si meme numero' ) )
            // InternalUnoDsl.g:586:2: (kw= 'si meme couleur' | kw= 'si meme numero' )
            {
            // InternalUnoDsl.g:586:2: (kw= 'si meme couleur' | kw= 'si meme numero' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUnoDsl.g:587:3: kw= 'si meme couleur'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker3Access().getSiMemeCouleurKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:593:3: kw= 'si meme numero'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLinker3Access().getSiMemeNumeroKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinker3"


    // $ANTLR start "entryRuleExpr2"
    // InternalUnoDsl.g:602:1: entryRuleExpr2 returns [String current=null] : iv_ruleExpr2= ruleExpr2 EOF ;
    public final String entryRuleExpr2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr2 = null;


        try {
            // InternalUnoDsl.g:602:45: (iv_ruleExpr2= ruleExpr2 EOF )
            // InternalUnoDsl.g:603:2: iv_ruleExpr2= ruleExpr2 EOF
            {
             newCompositeNode(grammarAccess.getExpr2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr2=ruleExpr2();

            state._fsp--;

             current =iv_ruleExpr2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr2"


    // $ANTLR start "ruleExpr2"
    // InternalUnoDsl.g:609:1: ruleExpr2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sur la pile-talon' | kw= 'de la pioche-pile' | kw= 'le temps de la manche' | kw= 'dans le sens inverse' | kw= 'les mains' | kw= 'si points accumules 500' | kw= 'si carte pioch\\u00E9e +elevee' | kw= 'ses cartes avec autre joueur' | kw= 'son tour' ) ;
    public final AntlrDatatypeRuleToken ruleExpr2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:615:2: ( (kw= 'sur la pile-talon' | kw= 'de la pioche-pile' | kw= 'le temps de la manche' | kw= 'dans le sens inverse' | kw= 'les mains' | kw= 'si points accumules 500' | kw= 'si carte pioch\\u00E9e +elevee' | kw= 'ses cartes avec autre joueur' | kw= 'son tour' ) )
            // InternalUnoDsl.g:616:2: (kw= 'sur la pile-talon' | kw= 'de la pioche-pile' | kw= 'le temps de la manche' | kw= 'dans le sens inverse' | kw= 'les mains' | kw= 'si points accumules 500' | kw= 'si carte pioch\\u00E9e +elevee' | kw= 'ses cartes avec autre joueur' | kw= 'son tour' )
            {
            // InternalUnoDsl.g:616:2: (kw= 'sur la pile-talon' | kw= 'de la pioche-pile' | kw= 'le temps de la manche' | kw= 'dans le sens inverse' | kw= 'les mains' | kw= 'si points accumules 500' | kw= 'si carte pioch\\u00E9e +elevee' | kw= 'ses cartes avec autre joueur' | kw= 'son tour' )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            case 38:
                {
                alt12=4;
                }
                break;
            case 39:
                {
                alt12=5;
                }
                break;
            case 40:
                {
                alt12=6;
                }
                break;
            case 41:
                {
                alt12=7;
                }
                break;
            case 42:
                {
                alt12=8;
                }
                break;
            case 43:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUnoDsl.g:617:3: kw= 'sur la pile-talon'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getSurLaPileTalonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:623:3: kw= 'de la pioche-pile'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getDeLaPiochePileKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:629:3: kw= 'le temps de la manche'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getLeTempsDeLaMancheKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:635:3: kw= 'dans le sens inverse'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getDansLeSensInverseKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:641:3: kw= 'les mains'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getLesMainsKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:647:3: kw= 'si points accumules 500'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getSiPointsAccumules500Keyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalUnoDsl.g:653:3: kw= 'si carte pioch\\u00E9e +elevee'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getSiCartePiochEEleveeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalUnoDsl.g:659:3: kw= 'ses cartes avec autre joueur'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getSesCartesAvecAutreJoueurKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalUnoDsl.g:665:3: kw= 'son tour'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpr2Access().getSonTourKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr2"


    // $ANTLR start "entryRuleCarte"
    // InternalUnoDsl.g:674:1: entryRuleCarte returns [EObject current=null] : iv_ruleCarte= ruleCarte EOF ;
    public final EObject entryRuleCarte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarte = null;


        try {
            // InternalUnoDsl.g:674:46: (iv_ruleCarte= ruleCarte EOF )
            // InternalUnoDsl.g:675:2: iv_ruleCarte= ruleCarte EOF
            {
             newCompositeNode(grammarAccess.getCarteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarte=ruleCarte();

            state._fsp--;

             current =iv_ruleCarte; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarte"


    // $ANTLR start "ruleCarte"
    // InternalUnoDsl.g:681:1: ruleCarte returns [EObject current=null] : (this_CarteClassique_0= ruleCarteClassique | this_CarteActive_1= ruleCarteActive | ( () ruleCarteNoire ) ) ;
    public final EObject ruleCarte() throws RecognitionException {
        EObject current = null;

        EObject this_CarteClassique_0 = null;

        EObject this_CarteActive_1 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:687:2: ( (this_CarteClassique_0= ruleCarteClassique | this_CarteActive_1= ruleCarteActive | ( () ruleCarteNoire ) ) )
            // InternalUnoDsl.g:688:2: (this_CarteClassique_0= ruleCarteClassique | this_CarteActive_1= ruleCarteActive | ( () ruleCarteNoire ) )
            {
            // InternalUnoDsl.g:688:2: (this_CarteClassique_0= ruleCarteClassique | this_CarteActive_1= ruleCarteActive | ( () ruleCarteNoire ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case 46:
            case 47:
            case 48:
                {
                alt13=2;
                }
                break;
            case 49:
            case 50:
            case 51:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUnoDsl.g:689:3: this_CarteClassique_0= ruleCarteClassique
                    {

                    			newCompositeNode(grammarAccess.getCarteAccess().getCarteClassiqueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CarteClassique_0=ruleCarteClassique();

                    state._fsp--;


                    			current = this_CarteClassique_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:698:3: this_CarteActive_1= ruleCarteActive
                    {

                    			newCompositeNode(grammarAccess.getCarteAccess().getCarteActiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CarteActive_1=ruleCarteActive();

                    state._fsp--;


                    			current = this_CarteActive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:707:3: ( () ruleCarteNoire )
                    {
                    // InternalUnoDsl.g:707:3: ( () ruleCarteNoire )
                    // InternalUnoDsl.g:708:4: () ruleCarteNoire
                    {
                    // InternalUnoDsl.g:708:4: ()
                    // InternalUnoDsl.g:709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCarteAccess().getCarteAction_2_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCarteAccess().getCarteNoireParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCarteNoire();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarte"


    // $ANTLR start "entryRuleCarteClassique"
    // InternalUnoDsl.g:727:1: entryRuleCarteClassique returns [EObject current=null] : iv_ruleCarteClassique= ruleCarteClassique EOF ;
    public final EObject entryRuleCarteClassique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarteClassique = null;


        try {
            // InternalUnoDsl.g:727:55: (iv_ruleCarteClassique= ruleCarteClassique EOF )
            // InternalUnoDsl.g:728:2: iv_ruleCarteClassique= ruleCarteClassique EOF
            {
             newCompositeNode(grammarAccess.getCarteClassiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarteClassique=ruleCarteClassique();

            state._fsp--;

             current =iv_ruleCarteClassique; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarteClassique"


    // $ANTLR start "ruleCarteClassique"
    // InternalUnoDsl.g:734:1: ruleCarteClassique returns [EObject current=null] : (otherlv_0= 'carte-numero-' ( (lv_numeroCarte_1_0= RULE_INT ) ) (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) ) ) ;
    public final EObject ruleCarteClassique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numeroCarte_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_couleur_3_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:740:2: ( (otherlv_0= 'carte-numero-' ( (lv_numeroCarte_1_0= RULE_INT ) ) (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) ) ) )
            // InternalUnoDsl.g:741:2: (otherlv_0= 'carte-numero-' ( (lv_numeroCarte_1_0= RULE_INT ) ) (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) ) )
            {
            // InternalUnoDsl.g:741:2: (otherlv_0= 'carte-numero-' ( (lv_numeroCarte_1_0= RULE_INT ) ) (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) ) )
            // InternalUnoDsl.g:742:3: otherlv_0= 'carte-numero-' ( (lv_numeroCarte_1_0= RULE_INT ) ) (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCarteClassiqueAccess().getCarteNumeroKeyword_0());
            		
            // InternalUnoDsl.g:746:3: ( (lv_numeroCarte_1_0= RULE_INT ) )
            // InternalUnoDsl.g:747:4: (lv_numeroCarte_1_0= RULE_INT )
            {
            // InternalUnoDsl.g:747:4: (lv_numeroCarte_1_0= RULE_INT )
            // InternalUnoDsl.g:748:5: lv_numeroCarte_1_0= RULE_INT
            {
            lv_numeroCarte_1_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_numeroCarte_1_0, grammarAccess.getCarteClassiqueAccess().getNumeroCarteINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCarteClassiqueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numeroCarte",
            						lv_numeroCarte_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUnoDsl.g:764:3: (otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) ) )
            // InternalUnoDsl.g:765:4: otherlv_2= '-couleur-' ( (lv_couleur_3_0= ruleCouleurCarte ) )
            {
            otherlv_2=(Token)match(input,45,FOLLOW_21); 

            				newLeafNode(otherlv_2, grammarAccess.getCarteClassiqueAccess().getCouleurKeyword_2_0());
            			
            // InternalUnoDsl.g:769:4: ( (lv_couleur_3_0= ruleCouleurCarte ) )
            // InternalUnoDsl.g:770:5: (lv_couleur_3_0= ruleCouleurCarte )
            {
            // InternalUnoDsl.g:770:5: (lv_couleur_3_0= ruleCouleurCarte )
            // InternalUnoDsl.g:771:6: lv_couleur_3_0= ruleCouleurCarte
            {

            						newCompositeNode(grammarAccess.getCarteClassiqueAccess().getCouleurCouleurCarteParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_couleur_3_0=ruleCouleurCarte();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCarteClassiqueRule());
            						}
            						set(
            							current,
            							"couleur",
            							lv_couleur_3_0,
            							"org.xtext.gameuno.UnoDsl.CouleurCarte");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarteClassique"


    // $ANTLR start "entryRuleCarteActive"
    // InternalUnoDsl.g:793:1: entryRuleCarteActive returns [EObject current=null] : iv_ruleCarteActive= ruleCarteActive EOF ;
    public final EObject entryRuleCarteActive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCarteActive = null;


        try {
            // InternalUnoDsl.g:793:52: (iv_ruleCarteActive= ruleCarteActive EOF )
            // InternalUnoDsl.g:794:2: iv_ruleCarteActive= ruleCarteActive EOF
            {
             newCompositeNode(grammarAccess.getCarteActiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarteActive=ruleCarteActive();

            state._fsp--;

             current =iv_ruleCarteActive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarteActive"


    // $ANTLR start "ruleCarteActive"
    // InternalUnoDsl.g:800:1: ruleCarteActive returns [EObject current=null] : ( (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' ) otherlv_3= '-couleur-' ( (lv_couleur_4_0= ruleCouleurCarte ) ) ) ;
    public final EObject ruleCarteActive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_couleur_4_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:806:2: ( ( (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' ) otherlv_3= '-couleur-' ( (lv_couleur_4_0= ruleCouleurCarte ) ) ) )
            // InternalUnoDsl.g:807:2: ( (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' ) otherlv_3= '-couleur-' ( (lv_couleur_4_0= ruleCouleurCarte ) ) )
            {
            // InternalUnoDsl.g:807:2: ( (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' ) otherlv_3= '-couleur-' ( (lv_couleur_4_0= ruleCouleurCarte ) ) )
            // InternalUnoDsl.g:808:3: (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' ) otherlv_3= '-couleur-' ( (lv_couleur_4_0= ruleCouleurCarte ) )
            {
            // InternalUnoDsl.g:808:3: (otherlv_0= 'carte-passer-tour' | otherlv_1= 'carte-plus-2' | otherlv_2= 'carte-inversion' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt14=1;
                }
                break;
            case 47:
                {
                alt14=2;
                }
                break;
            case 48:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalUnoDsl.g:809:4: otherlv_0= 'carte-passer-tour'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getCarteActiveAccess().getCartePasserTourKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:814:4: otherlv_1= 'carte-plus-2'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getCarteActiveAccess().getCartePlus2Keyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:819:4: otherlv_2= 'carte-inversion'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getCarteActiveAccess().getCarteInversionKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,45,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCarteActiveAccess().getCouleurKeyword_1());
            		
            // InternalUnoDsl.g:828:3: ( (lv_couleur_4_0= ruleCouleurCarte ) )
            // InternalUnoDsl.g:829:4: (lv_couleur_4_0= ruleCouleurCarte )
            {
            // InternalUnoDsl.g:829:4: (lv_couleur_4_0= ruleCouleurCarte )
            // InternalUnoDsl.g:830:5: lv_couleur_4_0= ruleCouleurCarte
            {

            					newCompositeNode(grammarAccess.getCarteActiveAccess().getCouleurCouleurCarteParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_couleur_4_0=ruleCouleurCarte();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarteActiveRule());
            					}
            					set(
            						current,
            						"couleur",
            						lv_couleur_4_0,
            						"org.xtext.gameuno.UnoDsl.CouleurCarte");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarteActive"


    // $ANTLR start "entryRuleCarteNoire"
    // InternalUnoDsl.g:851:1: entryRuleCarteNoire returns [String current=null] : iv_ruleCarteNoire= ruleCarteNoire EOF ;
    public final String entryRuleCarteNoire() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCarteNoire = null;


        try {
            // InternalUnoDsl.g:851:50: (iv_ruleCarteNoire= ruleCarteNoire EOF )
            // InternalUnoDsl.g:852:2: iv_ruleCarteNoire= ruleCarteNoire EOF
            {
             newCompositeNode(grammarAccess.getCarteNoireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarteNoire=ruleCarteNoire();

            state._fsp--;

             current =iv_ruleCarteNoire.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarteNoire"


    // $ANTLR start "ruleCarteNoire"
    // InternalUnoDsl.g:858:1: ruleCarteNoire returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'carte-plus-4' | kw= 'carte-joker' | kw= 'carte-uno' ) ;
    public final AntlrDatatypeRuleToken ruleCarteNoire() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:864:2: ( (kw= 'carte-plus-4' | kw= 'carte-joker' | kw= 'carte-uno' ) )
            // InternalUnoDsl.g:865:2: (kw= 'carte-plus-4' | kw= 'carte-joker' | kw= 'carte-uno' )
            {
            // InternalUnoDsl.g:865:2: (kw= 'carte-plus-4' | kw= 'carte-joker' | kw= 'carte-uno' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt15=1;
                }
                break;
            case 50:
                {
                alt15=2;
                }
                break;
            case 51:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUnoDsl.g:866:3: kw= 'carte-plus-4'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCartePlus4Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:872:3: kw= 'carte-joker'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCarteJokerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:878:3: kw= 'carte-uno'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCarteUnoKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarteNoire"


    // $ANTLR start "entryRuleCouleurCarte"
    // InternalUnoDsl.g:887:1: entryRuleCouleurCarte returns [String current=null] : iv_ruleCouleurCarte= ruleCouleurCarte EOF ;
    public final String entryRuleCouleurCarte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCouleurCarte = null;


        try {
            // InternalUnoDsl.g:887:52: (iv_ruleCouleurCarte= ruleCouleurCarte EOF )
            // InternalUnoDsl.g:888:2: iv_ruleCouleurCarte= ruleCouleurCarte EOF
            {
             newCompositeNode(grammarAccess.getCouleurCarteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCouleurCarte=ruleCouleurCarte();

            state._fsp--;

             current =iv_ruleCouleurCarte.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCouleurCarte"


    // $ANTLR start "ruleCouleurCarte"
    // InternalUnoDsl.g:894:1: ruleCouleurCarte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rouge' | kw= 'jaune' | kw= 'bleu' | kw= 'vert' ) ;
    public final AntlrDatatypeRuleToken ruleCouleurCarte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:900:2: ( (kw= 'rouge' | kw= 'jaune' | kw= 'bleu' | kw= 'vert' ) )
            // InternalUnoDsl.g:901:2: (kw= 'rouge' | kw= 'jaune' | kw= 'bleu' | kw= 'vert' )
            {
            // InternalUnoDsl.g:901:2: (kw= 'rouge' | kw= 'jaune' | kw= 'bleu' | kw= 'vert' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt16=1;
                }
                break;
            case 53:
                {
                alt16=2;
                }
                break;
            case 54:
                {
                alt16=3;
                }
                break;
            case 55:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUnoDsl.g:902:3: kw= 'rouge'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getRougeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:908:3: kw= 'jaune'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getJauneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:914:3: kw= 'bleu'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getBleuKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:920:3: kw= 'vert'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getVertKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCouleurCarte"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\24\3\27\2\31\10\15\1\5\3\55\16\15\2\uffff\1\55\1\64\1\24\1\64\4\15\1\5\3\55\7\15\1\55\2\64\10\15";
    static final String dfa_3s = "\1\26\5\40\10\63\1\5\3\55\5\53\11\16\2\uffff\1\55\1\67\1\63\1\67\4\53\1\5\3\55\7\53\1\55\2\67\10\53";
    static final String dfa_4s = "\40\uffff\1\1\1\2\36\uffff";
    static final String dfa_5s = "\100\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\40\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\16\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\1\41\24\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\40\1\41\24\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
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
            "\3\40\25\uffff\1\52\1\uffff\1\53\1\54\1\55\1\56\1\57\1\60",
            "\1\61\1\62\1\63\1\64",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\67",
            "\1\70\1\71\1\72\1\73",
            "\1\74\1\75\1\76\1\77",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\44\1\41\22\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 223:4: ( ( (lv_exigence_9_0= ruleExigence ) ) otherlv_10= ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FF800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000FDFFE00000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000FFE00002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000FD00000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000FF800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00F0000000000000L});

}