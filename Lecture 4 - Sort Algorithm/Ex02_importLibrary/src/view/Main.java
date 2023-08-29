package view;

import java.util.Arrays;

import quicksort.QuickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort quicksort = new QuickSort();

        int[] array_input0 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        System.out.printf("Original: %s\n", Arrays.toString(array_input0));
        int[] array_output0 = quicksort.sort(array_input0);
        System.out.printf("Sorted: %s", Arrays.toString(array_output0));

        int[] array_input1 = { 44, 43, 42, 41, 40, 39, 38 };
        System.out.printf("\nOriginal: %s\n", Arrays.toString(array_input1));
        int[] array_output1 = quicksort.sort(array_input1);
        System.out.printf("Sorted: %s", Arrays.toString(array_output1));

        int[] array_input2 = { 31, 32, 33, 34, 99, 98, 97, 96 };
        System.out.printf("\nOriginal: %s\n", Arrays.toString(array_input2));
        int[] array_output2 = quicksort.sort(array_input2);
        System.out.printf("Sorted: %s", Arrays.toString(array_output2));
    }
}