package ser502.team6.compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.parser.zealLexer;
import compiler.parser.zealParser;

public class Test {
	public static void main(String[] args) {
		String path = "test.zeal";
		ANTLRInputStream input = new ANTLRInputStream(path);
		ParseTree tree = parse(input);
	}
	
	public static ParseTree parse(ANTLRInputStream input) {
		zealLexer lexer = new zealLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		zealParser parser = new zealParser(tokens);
		ParseTree tree = parser.program();
		//final TreeViewer view = new TreeViewer(null, tree);
	    //view.open();
		return tree;
	}

}
