package javaProblems;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordFrequency {
	
	private Scanner scan;
	private String lineToParse;
	
	public WordFrequency(Scanner scan){
		this.scan = scan;	
		lineToParse = "";
	}
	
	public void frequencyTable() {
		try {
			Scanner in = new Scanner(new FileReader("words.txt"));
			while (in.hasNextLine()){
				lineToParse = in.nextLine();
				System.out.println(lineToParse);
			}
			
			//in.close();
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}



// I was asked how I'd write a script that builds a frequency table
//of the words in a text file of a Shakespeare play, which comes down to a similar loop structure.