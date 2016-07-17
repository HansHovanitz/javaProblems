package javaProblems;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {
	
	private Scanner scan;
	private boolean flag;
	
	public Fibonacci(Scanner scan) {
		this.scan = scan;
		flag = false;
	}
	
	public void enterNumber() {
		
		while (flag == false) {
			try {
				System.out.println("Please enter a number:");
				int choice = scan.nextInt();
				int fibNumber = fibNumber(choice);
				
				System.out.println("The number " + choice + " in the Fibonacci sequence is: " + fibNumber);
				System.out.println("The Fibonacci sequence up until the number is:");
				
				for (int i = 0; i <= choice; i++) {
					System.out.print(fibNumber(i) + " ");
				}
				System.out.println("");
				flag = true;
			}
			catch (InputMismatchException e) {
				System.out.println(e + "\nPlease enter an integer choice.");
				scan.next();
			}
		}	
	}
	
	public int fibNumber(int number) {
		if (number < 2) {
			return number;
		}
		else {
			return fibNumber(number-1) + fibNumber(number-2);
		}
			
	}
}
