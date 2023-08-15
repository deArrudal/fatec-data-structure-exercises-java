package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int[] array = {2, 4, 6, 3, 8, 7, 9};
		int size = array.length;
		
		int answer = methods.countEven(array, size);
		
		System.out.printf("Even = %d", answer);
	}
}
