/*
 * generated by Xtext 2.23.0
 */
package org.xtext.gameuno.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.gameuno.parser.antlr.internal.InternalUnoDslParser;
import org.xtext.gameuno.services.UnoDslGrammarAccess;

public class UnoDslParser extends AbstractAntlrParser {

	@Inject
	private UnoDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUnoDslParser createParser(XtextTokenStream stream) {
		return new InternalUnoDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UnoDsl";
	}

	public UnoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UnoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
