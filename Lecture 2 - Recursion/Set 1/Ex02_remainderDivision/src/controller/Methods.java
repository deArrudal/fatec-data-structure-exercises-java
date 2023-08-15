package controller;

public class Methods {
	public Methods() {
		super();
	}

	// Compute the remainder of two numbers using subtraction.
	public int remainderNumbers(int dividend, int divisor) {
		// If we cannot subtract the divisor from the dividend, the dividend is the remainder.
		if(dividend < divisor) {
			return dividend;
		} else {
			// Subtract the divisor from the dividend until it became 0 or less than the divisor.
			return remainderNumbers(dividend - divisor, divisor);
		}
	}
}
