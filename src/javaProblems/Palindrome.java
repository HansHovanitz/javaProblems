package javaProblems;
import java.util.Scanner;

public class Palindrome {

	private String word;
	private String reverseWord;
	private Scanner scan;

	public Palindrome(Scanner scan) {
		word = "";
		reverseWord = "";
		this.scan = scan;
	}
	
	public void testPalindrome() {
		System.out.println("Enter a word:");
		word = scan.next();
		
		int length = word.length();
		
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

//Easier version than what I came up with off of the top of my head:

//for ( int i = length - 1; i >= 0; i-- )
//   reverse = reverse + original.charAt(i);
