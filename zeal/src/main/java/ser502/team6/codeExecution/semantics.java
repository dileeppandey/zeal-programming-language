package ser502.team6.codeExecution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

import ser502.team6.exceptions.ProgramExecutionException;


public class semantics {
	
	

	public semantics(File file) throws IOException {
		String instructionsFile ="instructions.txt";
		String line;
		Stack<String> instructions = new Stack<String>();
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//String[] eachLineOfIntermediate = i.split("\n");
		while ((line = bufferedReader.readLine()) != null)
		{

			if (line.isEmpty())
			{
				new ProgramExecutionException("line empty");

			}
			else
			{

				String[] lineOfWords = line.split(" ");

				for (int i = 0; i < lineOfWords.length; i++)
				{
					instructions.push(lineOfWords[i]);
				}
				instructions.push("END_OF_LINE");
				

			}
			
		}
		
		PrintWriter out = new PrintWriter(instructionsFile);
		while(!(instructions.empty())) {
		out.write(instructions.pop());
		out.write(System.lineSeparator());
		}
		out.close();
		
		
		
		
	}



	

	
}