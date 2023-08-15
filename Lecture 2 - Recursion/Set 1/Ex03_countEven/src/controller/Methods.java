package controller;

public class Methods {
	public Methods() {
		super();
	}

	// Count the number of even elements inside an array.
	public int countEven(int[] array, int size) {
		// Return when size equals 0.
		if(size == 0) {
			return 0;
		} else {
			// If an element array is even adds 1, else add 0.
			if(array[size - 1] % 2 == 0) {
				return 1 + countEven(array, size - 1);
			} else {
				return countEven(array, size - 1);
			}
		}
	}
}
