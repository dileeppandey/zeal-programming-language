package ser502.team6.compiler;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiler.parser.zealLexer;
import compiler.parser.zealParser;

public class ZealCompiler {
	public static void main(String[] args) {
		String path = args[0] + ".zl";
		String outputFile = "intermediateCode/" + args[0] + ".zc";
		File intermediateCode = new File(outputFile);
		ANTLRFileStream input;
		try {
			input = new ANTLRFileStream(path);
			ParseTree tree = parse(input);
			ZealCustomVisitor zealCustomVisitor = new ZealCustomVisitor();
			String intermediate = zealCustomVisitor.visit(tree);
			PrintWriter out = new PrintWriter(intermediateCode);
			out.write(intermediate);
			out.close();
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
		return tree;
	}

}
