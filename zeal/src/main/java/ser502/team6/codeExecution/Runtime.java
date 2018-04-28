package ser502.team6.codeExecution;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import ser502.team6.util.Logger;

public class Runtime {
  public static void main(String[] args) {
    //    String sourcePath = "";
    //    if(args.length == 0) {
    //      return;
    //    }
    //    sourcePath = args[0];
    String sourcePath =
        "code.txt";
    File sourceFile = new File(sourcePath);
    List<String> instructions = new ArrayList<String>();
    try {
      Scanner scan = new Scanner(new File(sourcePath));
      if (scan != null) {
        String indermediateCode = scan.useDelimiter("\\Z").next();
        indermediateCode = indermediateCode.replaceAll("\\s+|\\n+|\\r+|\\,|\\:", " ");
        String[] arr = indermediateCode.split("\\s+");
        Logger.printInfo(indermediateCode);
      }
      scan.close();
    } catch (IOException e) {
      Logger.printError("Cannot find file " + sourcePath);
    }
//    Logger.printInfo(instructions.toString());
  }
}
