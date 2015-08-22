package javaProblems;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main (String [] args){
		
		int menu = 1;
		Scanner scan = new Scanner(System.in);
		
		while (menu != 0) {
			System.out.println("Menu:\n"
			+ "1: Palindrome ");
			System.out.println("Enter your choice:");
			
			try {	
				int choice = scan.nextInt();
				switch (choice) {
				case 1: Palindrome pal = new Palindrome();
						pal.palindrome();
						break;
				case 0: menu = 0;
				}
			}
			
			catch (InputMismatchException e) {
				System.out.println(e + "\nPlease enter an integer choice");
			}
			finally {
			}
		}
		System.out.println("Good bye");
		scan.close();
	}
}


//Work on this at the same time?