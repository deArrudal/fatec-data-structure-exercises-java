package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int a = 121213;
        int b = 3;

		// Check if entries are valid.
        if(((a < 10) || (a > 999999)) || ((b) < 0 || (b > 9))) {
			System.out.print("Entrada inválida.");
			System.exit(0);
		}
		
		int answer = methods.countNumberInArray(a,b);
		System.out.printf("The value %d appears %d times.", b, answer);
	}
}