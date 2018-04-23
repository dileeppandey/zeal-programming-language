package ser502.team6.compiler;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.parser.zealLexer;
import compiler.parser.zealParser;

public class Test {
	public static void main(String[] args) {
		String path = "test.zeal";
		ANTLRFileStream input;
		try {
			input = new ANTLRFileStream(path);
			ParseTree tree = parse(input);
			ZealCustomVisitor vst = new ZealCustomVisitor();
			String intermediate = vst.visit(tree);
			System.out.println(intermediate);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ParseTree parse(ANTLRFileStream input) {
		zealLexer lexer = new zealLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		zealParser parser = new zealParser(tokens);
		ParseTree tree = parser.program();
		// final TreeViewer view = new TreeViewer(null, tree);
		// view.open();
		return tree;
	}

}
