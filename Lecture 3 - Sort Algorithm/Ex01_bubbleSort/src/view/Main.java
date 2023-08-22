package view;

import java.util.Arrays;
import bubblesort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubblesort = new BubbleSort();

        int[] array_input = {7, 4, 6, 3, 1, 9, 5, 2, 8};

        System.out.printf("Original: %s\n", Arrays.toString(array_input));

        bubblesort.optimizedSort(array_input);

        System.out.printf("Sorted: %s", Arrays.toString(array_input));
    }
}
