package controller;

public class Methods {
	public Methods() {
		super();
	}

	// Return the sum of the first n integers.
	public int sumNumbers(int n) {
		if (n <= 0) {
			// f(0) = 0;
			return 0;
		} else {
			// f(n) = n + f(n - 1);
			return n + sumNumbers(n - 1);
		}
	}
}
