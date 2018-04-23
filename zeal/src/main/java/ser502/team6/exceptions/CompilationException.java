package ser502.team6.exceptions;

import org.antlr.v4.runtime.Token;

@SuppressWarnings("serial")
public class CompilationException extends Exception{
	protected int errorLineOf;
	protected int errorColumn;
	
	public CompilationException(Token token) {
		errorLineOf = token.getLine();
		errorColumn = token.getCharPositionInLine();
	}

}
