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


/*String original, reverse = "";
Scanner in = new Scanner(System.in);

System.out.println("Enter a string to check if it is a palindrome");
original = in.nextLine();

int length = original.length();

for ( int i = length - 1; i >= 0; i-- )
   reverse = reverse + original.charAt(i);

if (original.equals(reverse))
   System.out.println("Entered string is a palindrome.");
else
   System.out.println("Entered string is not a palindrome.");*/