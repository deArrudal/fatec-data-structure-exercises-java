package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int n = 10;

		int answer = methods.sumNumbers(n);
		System.out.printf("Answer: %d", answer);
	}
}
