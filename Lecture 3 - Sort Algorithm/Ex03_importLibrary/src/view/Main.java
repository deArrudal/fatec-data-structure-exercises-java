package view;

import java.util.Arrays;
import bubblesort.BubbleSort;
import mergesort.MergeSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();

        int[] array_input1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        System.out.printf("Exercise 1.Unsorted: %s\n", Arrays.toString(array_input1));

        int[] array_outputb = bubbleSort.sort(array_input1);
        System.out.printf("\tBubble: %s\n", Arrays.toString(array_outputb));

        int[] array_outputm = mergeSort.sort(array_input1);
        System.out.printf("\tMerge: %s\n", Arrays.toString(array_outputb));

        int[] array_input2 = { 44, 43, 42, 41, 40, 39, 38 };
        System.out.printf("Exercise 2.Unsorted: %s\n", Arrays.toString(array_input2));

        array_outputb = bubbleSort.sort(array_input2);
        System.out.printf("\tSorted: %s\n", Arrays.toString(array_outputb));

        array_outputm = mergeSort.sort(array_input2);
        System.out.printf("\tSorted: %s\n", Arrays.toString(array_outputm));

    }
}
