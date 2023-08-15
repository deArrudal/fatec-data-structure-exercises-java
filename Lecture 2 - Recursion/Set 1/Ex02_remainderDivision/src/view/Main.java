package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int dividend = 23;
		int divisor = 7;
		
		int answer = methods.remainderNumbers(dividend, divisor);
		
		System.out.printf("%d %% %d = %d", dividend, divisor, answer);
	}
}
