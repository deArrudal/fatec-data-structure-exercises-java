package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int a = 4;
		int b = 5;
		
		int answer = methods.multNumbers(a, b);
		
		System.out.printf("%d * %d = %d", a, b, answer);
	}
}
