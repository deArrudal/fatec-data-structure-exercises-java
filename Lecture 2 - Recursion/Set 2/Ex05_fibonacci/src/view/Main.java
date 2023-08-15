package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int n = 7;

        int answer = methods.fibonacci(n);
        System.out.printf("Fib(%d) = %d", n, answer);
	}
}