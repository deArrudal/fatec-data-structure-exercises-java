package controller;

import model.IntStack;

public class FactStack {
	public FactStack() {
		super();
	}

	public long computeFat(int n) {
		IntStack stack = new IntStack();
		long fact = 1;

		// fill stack.
		while (n > 1) {
			stack.push(n);
			n--;
		}

		// empty the stack, using popped value to compute the factorial.
		while (!stack.isEmpty()) {
			try {
				fact *= stack.pop();
			} catch (Exception errStack) {
				System.err.println(errStack);
			}
		}

		return fact;
	}

}
