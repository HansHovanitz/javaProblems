package javaProblems;
import java.util.Scanner;

public class Palindrome {

	private String word;
	private Scanner scan;

	public Palindrome(Scanner scan) {
		word = "";
		this.scan = scan;
	}
	
	public void testPalindrome() {
		word = scan.next();
		System.out.println(word);
	}
}
