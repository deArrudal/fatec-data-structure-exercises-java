package view;

import java.util.Scanner;
import controller.FactStack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FactStack method = new FactStack();

		int n;

		do {
			System.out.println("Enter value:");
			n = scan.nextInt();

			if (n < 1 || n > 10) {
				System.out.println("Invalid entry");
			}
		} while (n < 1 || n > 10);

		// compute and display the factorial on f using stack.
		System.out.println("Factorial: " + method.computeFat(n));

		scan.close();
	}
}
