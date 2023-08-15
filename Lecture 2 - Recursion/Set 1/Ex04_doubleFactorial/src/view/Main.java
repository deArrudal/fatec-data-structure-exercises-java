package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int n = 7;
		
		// Check if entry is valid.
		if(n % 2 == 0) { 
			System.out.print("Entry must be an odd number.");
			System.exit(0);
		}
		
		long answer = methods.doubleFactorial(n);
		
		System.out.printf("Double Factorial of %d = %d", n, answer);
	}
}
