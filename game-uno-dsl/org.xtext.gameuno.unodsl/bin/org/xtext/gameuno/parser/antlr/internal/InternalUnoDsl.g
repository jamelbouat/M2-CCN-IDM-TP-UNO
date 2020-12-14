/*
 * generated by Xtext 2.23.0
 */
grammar InternalUnoDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.gameuno.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUnoDsl
entryRuleUnoDsl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnoDslRule()); }
	iv_ruleUnoDsl=ruleUnoDsl
	{ $current=$iv_ruleUnoDsl.current; }
	EOF;

// Rule UnoDsl
ruleUnoDsl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='regles:'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnoDslAccess().getReglesKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getUnoDslAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_2_0());
				}
				lv_regles_2_0=ruleRegleJeu
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnoDslRule());
					}
					add(
						$current,
						"regles",
						lv_regles_2_0,
						"org.xtext.gameuno.UnoDsl.RegleJeu");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getUnoDslAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUnoDslAccess().getReglesRegleJeuParserRuleCall_3_1_0());
					}
					lv_regles_4_0=ruleRegleJeu
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnoDslRule());
						}
						add(
							$current,
							"regles",
							lv_regles_4_0,
							"org.xtext.gameuno.UnoDsl.RegleJeu");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getUnoDslAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleRegleJeu
entryRuleRegleJeu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegleJeuRule()); }
	iv_ruleRegleJeu=ruleRegleJeu
	{ $current=$iv_ruleRegleJeu.current; }
	EOF;

// Rule RegleJeu
ruleRegleJeu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegleJeuAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			otherlv_1='nom_regle:'
			{
				newLeafNode(otherlv_1, grammarAccess.getRegleJeuAccess().getNom_regleKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_STRING
					{
						newLeafNode(lv_name_2_0, grammarAccess.getRegleJeuAccess().getNameSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegleJeuRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getRegleJeuAccess().getCommaKeyword_1_2());
			}
		)
		(
			otherlv_4='description:'
			{
				newLeafNode(otherlv_4, grammarAccess.getRegleJeuAccess().getDescriptionKeyword_2_0());
			}
			(
				(
					lv_description_5_0=RULE_STRING
					{
						newLeafNode(lv_description_5_0, grammarAccess.getRegleJeuAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegleJeuRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getRegleJeuAccess().getCommaKeyword_2_2());
			}
		)
		(
			otherlv_7='exigences:'
			{
				newLeafNode(otherlv_7, grammarAccess.getRegleJeuAccess().getExigencesKeyword_3_0());
			}
			otherlv_8='['
			{
				newLeafNode(otherlv_8, grammarAccess.getRegleJeuAccess().getLeftSquareBracketKeyword_3_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_2_0_0());
						}
						lv_exigence_9_0=ruleExigence
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRegleJeuRule());
							}
							add(
								$current,
								"exigence",
								lv_exigence_9_0,
								"org.xtext.gameuno.UnoDsl.Exigence");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_10=','
				{
					newLeafNode(otherlv_10, grammarAccess.getRegleJeuAccess().getCommaKeyword_3_2_1());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getRegleJeuAccess().getExigenceExigenceParserRuleCall_3_3_0());
					}
					lv_exigence_11_0=ruleExigence
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRegleJeuRule());
						}
						add(
							$current,
							"exigence",
							lv_exigence_11_0,
							"org.xtext.gameuno.UnoDsl.Exigence");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_12=']'
			{
				newLeafNode(otherlv_12, grammarAccess.getRegleJeuAccess().getRightSquareBracketKeyword_3_4());
			}
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getRegleJeuAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleExigence
entryRuleExigence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExigenceRule()); }
	iv_ruleExigence=ruleExigence
	{ $current=$iv_ruleExigence.current; }
	EOF;

// Rule Exigence
ruleExigence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExigenceAccess().getExpr1Expr1ParserRuleCall_0_0());
				}
				lv_expr1_0_0=ruleExpr1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExigenceRule());
					}
					set(
						$current,
						"expr1",
						lv_expr1_0_0,
						"org.xtext.gameuno.UnoDsl.Expr1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExigenceAccess().getLinker1Linker1ParserRuleCall_1_0());
				}
				lv_linker1_1_0=ruleLinker1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExigenceRule());
					}
					set(
						$current,
						"linker1",
						lv_linker1_1_0,
						"org.xtext.gameuno.UnoDsl.Linker1");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExigenceAccess().getLinker2Linker2ParserRuleCall_2_0());
				}
				lv_linker2_2_0=ruleLinker2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExigenceRule());
					}
					set(
						$current,
						"linker2",
						lv_linker2_2_0,
						"org.xtext.gameuno.UnoDsl.Linker2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_0_0());
					}
					lv_carte_3_0=ruleCarte
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExigenceRule());
						}
						add(
							$current,
							"carte",
							lv_carte_3_0,
							"org.xtext.gameuno.UnoDsl.Carte");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getExigenceAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExigenceAccess().getCarteCarteParserRuleCall_3_1_1_0());
						}
						lv_carte_5_0=ruleCarte
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExigenceRule());
							}
							add(
								$current,
								"carte",
								lv_carte_5_0,
								"org.xtext.gameuno.UnoDsl.Carte");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExigenceAccess().getLinker3Linker3ParserRuleCall_4_0());
				}
				lv_linker3_6_0=ruleLinker3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExigenceRule());
					}
					set(
						$current,
						"linker3",
						lv_linker3_6_0,
						"org.xtext.gameuno.UnoDsl.Linker3");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExigenceAccess().getExpr2Expr2ParserRuleCall_5_0());
				}
				lv_expr2_7_0=ruleExpr2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExigenceRule());
					}
					set(
						$current,
						"expr2",
						lv_expr2_7_0,
						"org.xtext.gameuno.UnoDsl.Expr2");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleExpr1
entryRuleExpr1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExpr1Rule()); }
	iv_ruleExpr1=ruleExpr1
	{ $current=$iv_ruleExpr1.current.getText(); }
	EOF;

// Rule Expr1
ruleExpr1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='le joueur'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr1Access().getLeJoueurKeyword_0());
		}
		    |
		kw='joueurs'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr1Access().getJoueursKeyword_1());
		}
		    |
		kw='le jeu'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr1Access().getLeJeuKeyword_2());
		}
	)
;

// Entry rule entryRuleLinker1
entryRuleLinker1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLinker1Rule()); }
	iv_ruleLinker1=ruleLinker1
	{ $current=$iv_ruleLinker1.current.getText(); }
	EOF;

// Rule Linker1
ruleLinker1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='dit interception et '
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker1Access().getDitInterceptionEtKeyword_0());
		}
		    |
		kw='suivant'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker1Access().getSuivantKeyword_1());
		}
	)
;

// Entry rule entryRuleLinker2
entryRuleLinker2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLinker2Rule()); }
	iv_ruleLinker2=ruleLinker2
	{ $current=$iv_ruleLinker2.current.getText(); }
	EOF;

// Rule Linker2
ruleLinker2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='pose'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getPoseKeyword_0());
		}
		    |
		kw='pioche'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getPiocheKeyword_1());
		}
		    |
		kw='limite'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getLimiteKeyword_2());
		}
		    |
		kw='gagne'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getGagneKeyword_3());
		}
		    |
		kw='tourne'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getTourneKeyword_4());
		}
		    |
		kw='impose'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getImposeKeyword_5());
		}
		    |
		kw='echange'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getEchangeKeyword_6());
		}
		    |
		kw='passe'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker2Access().getPasseKeyword_7());
		}
	)
;

// Entry rule entryRuleLinker3
entryRuleLinker3 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLinker3Rule()); }
	iv_ruleLinker3=ruleLinker3
	{ $current=$iv_ruleLinker3.current.getText(); }
	EOF;

// Rule Linker3
ruleLinker3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='si meme couleur'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker3Access().getSiMemeCouleurKeyword_0());
		}
		    |
		kw='si meme numero'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLinker3Access().getSiMemeNumeroKeyword_1());
		}
	)
;

// Entry rule entryRuleExpr2
entryRuleExpr2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getExpr2Rule()); }
	iv_ruleExpr2=ruleExpr2
	{ $current=$iv_ruleExpr2.current.getText(); }
	EOF;

// Rule Expr2
ruleExpr2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='sur la pile-talon'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getSurLaPileTalonKeyword_0());
		}
		    |
		kw='de la pioche-pile'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getDeLaPiochePileKeyword_1());
		}
		    |
		kw='le temps de la manche'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getLeTempsDeLaMancheKeyword_2());
		}
		    |
		kw='dans le sens inverse'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getDansLeSensInverseKeyword_3());
		}
		    |
		kw='les mains'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getLesMainsKeyword_4());
		}
		    |
		kw='si points accumules 500'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getSiPointsAccumules500Keyword_5());
		}
		    |
		kw='si carte pioch\u00E9e +elevee'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getSiCartePiochEEleveeKeyword_6());
		}
		    |
		kw='ses cartes avec autre joueur'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getSesCartesAvecAutreJoueurKeyword_7());
		}
		    |
		kw='son tour'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getExpr2Access().getSonTourKeyword_8());
		}
	)
;

// Entry rule entryRuleCarte
entryRuleCarte returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCarteRule()); }
	iv_ruleCarte=ruleCarte
	{ $current=$iv_ruleCarte.current; }
	EOF;

// Rule Carte
ruleCarte returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCarteAccess().getCarteClassiqueParserRuleCall_0());
		}
		this_CarteClassique_0=ruleCarteClassique
		{
			$current = $this_CarteClassique_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCarteAccess().getCarteActiveParserRuleCall_1());
		}
		this_CarteActive_1=ruleCarteActive
		{
			$current = $this_CarteActive_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getCarteAccess().getCarteAction_2_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getCarteAccess().getCarteNoireParserRuleCall_2_1());
			}
			ruleCarteNoire
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCarteClassique
entryRuleCarteClassique returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCarteClassiqueRule()); }
	iv_ruleCarteClassique=ruleCarteClassique
	{ $current=$iv_ruleCarteClassique.current; }
	EOF;

// Rule CarteClassique
ruleCarteClassique returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='carte-numero-'
		{
			newLeafNode(otherlv_0, grammarAccess.getCarteClassiqueAccess().getCarteNumeroKeyword_0());
		}
		(
			(
				lv_numeroCarte_1_0=RULE_INT
				{
					newLeafNode(lv_numeroCarte_1_0, grammarAccess.getCarteClassiqueAccess().getNumeroCarteINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCarteClassiqueRule());
					}
					setWithLastConsumed(
						$current,
						"numeroCarte",
						lv_numeroCarte_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_2='-couleur-'
			{
				newLeafNode(otherlv_2, grammarAccess.getCarteClassiqueAccess().getCouleurKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCarteClassiqueAccess().getCouleurCouleurCarteParserRuleCall_2_1_0());
					}
					lv_couleur_3_0=ruleCouleurCarte
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCarteClassiqueRule());
						}
						set(
							$current,
							"couleur",
							lv_couleur_3_0,
							"org.xtext.gameuno.UnoDsl.CouleurCarte");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCarteActive
entryRuleCarteActive returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCarteActiveRule()); }
	iv_ruleCarteActive=ruleCarteActive
	{ $current=$iv_ruleCarteActive.current; }
	EOF;

// Rule CarteActive
ruleCarteActive returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='carte-passer-tour'
			{
				newLeafNode(otherlv_0, grammarAccess.getCarteActiveAccess().getCartePasserTourKeyword_0_0());
			}
			    |
			otherlv_1='carte-plus-2'
			{
				newLeafNode(otherlv_1, grammarAccess.getCarteActiveAccess().getCartePlus2Keyword_0_1());
			}
			    |
			otherlv_2='carte-inversion'
			{
				newLeafNode(otherlv_2, grammarAccess.getCarteActiveAccess().getCarteInversionKeyword_0_2());
			}
		)
		otherlv_3='-couleur-'
		{
			newLeafNode(otherlv_3, grammarAccess.getCarteActiveAccess().getCouleurKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCarteActiveAccess().getCouleurCouleurCarteParserRuleCall_2_0());
				}
				lv_couleur_4_0=ruleCouleurCarte
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCarteActiveRule());
					}
					set(
						$current,
						"couleur",
						lv_couleur_4_0,
						"org.xtext.gameuno.UnoDsl.CouleurCarte");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCarteNoire
entryRuleCarteNoire returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCarteNoireRule()); }
	iv_ruleCarteNoire=ruleCarteNoire
	{ $current=$iv_ruleCarteNoire.current.getText(); }
	EOF;

// Rule CarteNoire
ruleCarteNoire returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='carte-plus-4'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCartePlus4Keyword_0());
		}
		    |
		kw='carte-joker'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCarteJokerKeyword_1());
		}
		    |
		kw='carte-uno'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCarteNoireAccess().getCarteUnoKeyword_2());
		}
	)
;

// Entry rule entryRuleCouleurCarte
entryRuleCouleurCarte returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCouleurCarteRule()); }
	iv_ruleCouleurCarte=ruleCouleurCarte
	{ $current=$iv_ruleCouleurCarte.current.getText(); }
	EOF;

// Rule CouleurCarte
ruleCouleurCarte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='rouge'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getRougeKeyword_0());
		}
		    |
		kw='jaune'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getJauneKeyword_1());
		}
		    |
		kw='bleu'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getBleuKeyword_2());
		}
		    |
		kw='vert'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCouleurCarteAccess().getVertKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
