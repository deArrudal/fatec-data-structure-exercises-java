package controller;

import model.IntStack;

public class Methods {
	public Methods() {
		super();
	}

	// Convert a base-10 number to base-2 (binary).
	public String convertToBinary(int n) {
		IntStack stack = new IntStack();
		String bin = "";

		while (n != 0) {
			stack.push(n % 2);
			n = n / 2;
		}

		while (!stack.isEmpty()) {
			try {
				bin += Integer.toString(stack.pop());

			} catch (Exception errPop) {
				System.err.println(errPop);

			}
		}

		return bin;
	}
}
