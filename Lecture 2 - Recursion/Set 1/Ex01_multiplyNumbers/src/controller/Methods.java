package controller;

public class Methods {
	public Methods() {
		super();
	}
	
	// Compute the multiplication of two numbers via addition.
	public int multNumbers(int a, int b) {
		// f(a, 1) = a
		if(b == 1) {
			return a;
		} else {
			// The multiplication of a * b is given by the sum of a, b times.
			// f(a, b) = a + f(a, b - 1) 
			return a + multNumbers(a, b - 1);
		}
	}
}
