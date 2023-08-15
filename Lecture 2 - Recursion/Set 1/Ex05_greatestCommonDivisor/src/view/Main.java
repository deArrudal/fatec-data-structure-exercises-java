package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int x = 20;
		int y = 15;
		
		int answer = methods.computeGCD(x, y);
		
		System.out.printf("GCD(%d, %d) = %d", x, y, answer);
	}

}
