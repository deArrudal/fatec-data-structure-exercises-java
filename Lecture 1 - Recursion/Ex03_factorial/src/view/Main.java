package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int n = 6; // set n < 12 to prevent memory overflow.

		int answer = methods.factorial(n);
		System.out.printf("fact(%d) = %d", n, answer);
	}
}
