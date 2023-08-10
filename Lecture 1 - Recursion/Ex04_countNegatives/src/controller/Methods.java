package controller;

public class Methods {
    public Methods() {
        super();
    }

    // Count the number of negative numbers inside an array.
    public int countNegatives(int[] array, int size) {
        if (size == 0) {
            // Stop recursion when size equals 0.
            return 0;
        } else {
            if (array[size - 1] < 0) {
                // Call recursion, adding 1 if array[size - 1] is negative.
                return 1 + countNegatives(array, size - 1);
            } else {
                // Call recursion, adding 0 if array[size - 1] is positive.
                return 0 + countNegatives(array, size - 1);
            }
        }
    }
}
