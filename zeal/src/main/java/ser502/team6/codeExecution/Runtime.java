package ser502.team6.codeExecution;

import java.io.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ser502.team6.util.Logger;

public class Runtime {
  // Construct Instruction set and labels map
  private static List<String> instructionsList = new ArrayList<String>();
  private static HashMap<String, Integer> labels = new HashMap<String, Integer>();

  private static void createProgramDataStructures(List<String> instructions) {
    String[] instructionsArray =new String[instructions.size()];
    instructionsArray = instructions.toArray(instructionsArray);
    int programCounter = 0;

    for (int i = 0; i < instructionsArray.length; i++) {
      Logger.printInfo(instructionsArray[i]);
      String word = instructionsArray[i];
      if(!word.isEmpty()) {
        if(word.equalsIgnoreCase(Instruction.LABEL.toString())) {
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
    //    String sourcePath = "";
    //    if(args.length == 0) {
    //      return;
    //    }
    //    sourcePath = args[0];
    String sourcePath =
        "code.txt";
    File sourceFile = new File(sourcePath);
    String intermediateCode = "";
    try {
      Scanner scan = new Scanner(new File(sourcePath));
      if (scan != null) {
        intermediateCode = scan.useDelimiter("\\Z").next();
      }
      scan.close();
    } catch (IOException e) {
      Logger.printError("Cannot find file " + sourcePath);
    }
    Pattern pattern = Pattern.compile("(\"[^\"]+\")|\\S+");
    Matcher matcher = pattern.matcher(intermediateCode);
    while(matcher.find()) {
      instructions.add(matcher.group().replaceAll("\"", ""));
    }
    // Create isntruction set and labels
    createProgramDataStructures(instructions);
    Logger.printInfo(instructionsList.toString());
    Logger.printInfo(labels.toString());

  }
}
