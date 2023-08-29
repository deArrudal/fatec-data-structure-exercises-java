package view;

import java.util.Arrays;
import bubblesort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubblesort = new BubbleSort();

        // int[] array_input = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        // int[] array_input = { 44, 43, 42, 41, 40, 39, 38 };
        int[] array_input = { 31, 32, 33, 34, 99, 98, 97, 96 };

        System.out.printf("Original: %s\n", Arrays.toString(array_input));

        int[] array_output = bubblesort.sort(array_input);

        System.out.printf("Sorted: %s", Arrays.toString(array_output));
    }
}
