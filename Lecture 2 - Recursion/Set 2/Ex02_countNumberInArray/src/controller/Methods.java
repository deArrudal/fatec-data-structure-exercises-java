package controller;

public class Methods {

	public Methods() {
		super();
	}

	// Count the number of times a number appears inside an array.
	public int countNumberInArray(int a, int b) {
		// Stop at the last digit.
		if(a < 10) {
			// If last digit is equal the target number, add 1. Otherwise, return 0.
			if (a == b) {
				return 1;
			}
			return 0;
		} else {
			// The remainder of the division by 10 returns the digit.
			// If digit is equal the target number, add 1.
			if(a % 10 == b) {
				return 1 + countNumberInArray(a / 10, b);
			}
			return countNumberInArray(a / 10, b);
		}
	}
}