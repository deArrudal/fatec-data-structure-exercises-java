package controller;

public class Methods {
	public Methods() {
		super();
	}

	// Compute the factorial of a number.
	public int factorial(int n) {
		if (n == 1) {
			// fact(1) = 1.
			return 1;
		} else {
			// fact(n) = n * fact(n - 1).
			return n * factorial(n - 1);
		}
	}
}
