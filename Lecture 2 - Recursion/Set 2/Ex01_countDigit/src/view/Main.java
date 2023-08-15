package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int n = 1256;

		int answer = methods.countDigit(n);
		System.out.printf("%d has %d digits.", n, answer);
	}

}
