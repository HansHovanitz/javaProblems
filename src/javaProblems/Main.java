package javaProblems;
import java.util.InputMismatchException;
import java.util.Scanner;

//1.0.2

public class Main {
	
	public static void main (String [] args){
			
		int menu = 1;
		Scanner scan = new Scanner(System.in);
		
		while (menu != 0) {
			
			System.out.println("Menu:\n"
			+ "1: Palindrome\n"
			+ "2: Fibonacci");
			System.out.println("Enter your choice:");
			
			try {			
				//int choice = Integer.parseInt(scan.next());
				int choice = scan.nextInt();
				
				
				switch (choice) {
				case 1: Palindrome pal = new Palindrome(scan);
						pal.testPalindrome();
						break;
				case 2: Fibonacci fib = new Fibonacci(scan);
						fib.enterNumber();
						break;
				case 0: menu = 0;
				}
			}
			catch (NumberFormatException e) {
				System.out.println(e + "\nPlease enter an integer choice.");
			}
			catch (InputMismatchException e) {
				System.out.println(e + "\nPlease enter an integer choice.");
				scan.next();
			}
			finally {
			}
		}
		System.out.println("Good bye");
		scan.close();
	}
}


