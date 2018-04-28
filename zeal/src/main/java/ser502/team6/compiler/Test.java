package ser502.team6.compiler;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.parser.zealLexer;
import compiler.parser.zealParser;
import ser502.team6.codeExecution.semantics;

public class Test {
	public static void main(String[] args) {
		String path = "test.zeal";
		String outputFile ="target/output.txt";
		File file = new File(outputFile);
		ANTLRFileStream input;
		try {
			input = new ANTLRFileStream(path);
			ParseTree tree = parse(input);
			ZealCustomVisitor vst = new ZealCustomVisitor();
			String intermediate = vst.visit(tree);
			PrintWriter out = new PrintWriter(outputFile);
			/* String */ //newFormattedOutput = intermediate.replaceAll("\n", System.lineSeparator());
			out.write(intermediate);
			out.close();
			new semantics(file);
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
