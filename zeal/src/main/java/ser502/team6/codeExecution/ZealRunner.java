package ser502.team6.codeExecution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZealRunner {
	// Construct ReservedLiteral set and labels map
	private static List<String> instructionsList = new ArrayList<String>();
	private static HashMap<String, Integer> labels = new HashMap<String, Integer>();

	private static void createProgramDataStructures(List<String> instructions) {
		String[] instructionsArray = new String[instructions.size()];
		instructionsArray = instructions.toArray(instructionsArray);
		int programCounter = 0;

		for (int i = 0; i < instructionsArray.length; i++) {
			String word = instructionsArray[i];
			if (!word.isEmpty()) {
				if (word.equalsIgnoreCase(ReservedLiteral.LABEL.toString())) {
					i++;
					labels.put(instructionsArray[i], programCounter);
				} else {
					instructionsList.add(word);
					programCounter++;
				}
			}
		}
	}

	public static void main(String[] args) {
		List<String> instructions = new ArrayList<String>();
		String sourcePath = "target/" + args[0] + ".zc";
		String intermediateCode = "";
		try {
			Scanner scan = new Scanner(new File(sourcePath));
			if (scan != null) {
				intermediateCode = scan.useDelimiter("\\Z").next();
			}
			scan.close();
		} catch (IOException e) {
			// Logger.printError("Cannot find file " + sourcePath);
		}
		Pattern pattern = Pattern.compile("(\"[^\"]+\")|\\S+");
		Matcher matcher = pattern.matcher(intermediateCode);
		while (matcher.find()) {
			instructions.add(matcher.group());
		}
		// Create isntruction set and labels
		createProgramDataStructures(instructions);

		if (instructionsList.size() > 0) {
			new StackMachine().executeInstructions(instructionsList);
		}

	}
}
