package ser502.team6.main;

import ser502.team6.codeExecution.ZealRunner;
import ser502.team6.compiler.ZealCompiler;

public class ZealMain {

	public static void main(String[] args) {
		String[] test = new String[1];
		test[0] = "sample/ArithmeticOperations";
		ZealCompiler.main(test);
		ZealRunner.main(test);
	}

}
