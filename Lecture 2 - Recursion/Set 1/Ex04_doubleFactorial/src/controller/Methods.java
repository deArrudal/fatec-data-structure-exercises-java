package controller;

public class Methods {
	public Methods() {
		super();
	}
	
	// Compute the double factorial of an odd number.
	public long doubleFactorial(int n) {
		// f(1) = 1
		if(n == 1) {
			return 1;
		} else {
			// Call the recursion using n - 2 to skip even elements.
			//f(n) = n * f(n - 2)
			return n * doubleFactorial(n - 2);
		}
	}
}
