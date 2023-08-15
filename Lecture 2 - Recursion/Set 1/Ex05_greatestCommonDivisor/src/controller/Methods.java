package controller;

public class Methods {
	public Methods() {
		super();
	}
	
	// Compute the greatest common divisor between two numbers.
	public int computeGCD(int x, int y) {
		// When both numbers became equal, the GCD is obtained. 
		if(x == y) {
			return x;
		} else {
			// Find the biggest number and subtract for the smaller one, calling the recursion afterwards. 
			if(x > y) {
				return computeGCD(x - y, y);
			} else {
				return computeGCD(x, y - x);
			}
		}
	}
}