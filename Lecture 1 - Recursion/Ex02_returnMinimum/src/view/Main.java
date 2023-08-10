package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int[] array = {-2, -3, 0, 3, -1, 5};
		int size = array.length;
		
		// Send size as last entry index (size - 1).
		int answer = methods.minimum(array, size - 1, array[size - 1]);
		System.out.printf("Minimum = %d", answer);
	}
}
