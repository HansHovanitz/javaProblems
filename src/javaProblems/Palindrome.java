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
		System.out.println("Enter a word:");
		word = scan.next();
		
		int length = word.length();
		
		String reverseWord = "";
		
		for (int i = 0; length-1 >= i; i++) {
			reverseWord = reverseWord + word.charAt((length-1)-i);
		}
		
		System.out.println("The word you entered is: " + word);
		System.out.println("The reverse of the word is: " + reverseWord);
		
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println("The word is a Palindrome.");
		}
		else {
			System.out.println("The word is not a Palindrome.");
		}
	}
}
