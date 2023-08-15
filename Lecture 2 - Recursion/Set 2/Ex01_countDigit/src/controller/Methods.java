package controller;

public class Methods {
	public Methods() {
		super();
	}

	// Count the number of digits of a number.
	public int countDigit(int n) {
		// If n is less than 10, tha is the last digit. 
		if(n < 10) {
			return 1;
		} else {
			// Remove rightmost digit and call recursion.
			return 1 + countDigit(n / 10);
		}
	}
}
