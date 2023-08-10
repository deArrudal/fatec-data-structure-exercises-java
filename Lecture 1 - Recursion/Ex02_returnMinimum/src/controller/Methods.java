package controller;

public class Methods {
	public Methods() {
		super();
	}
	
	// Return the lower element of an array.
	public int minimum(int[] array, int size, int min) {
		if(size == 0) { // Stop if size equals 0.
			return min;
		} else {
			// Compare current minimum with array[size - 1].
			if(array[size - 1] < min) {
				min = array[size - 1];
			}
			// Decrease the size by 1.
			return minimum(array, size - 1, min);
		}		
	}
}
