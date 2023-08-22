package view;

import java.util.Arrays;
import bubblesort.BubbleSort;
import mergesort.MergeSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        
        int[] array_ex1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

        System.out.printf("Exercise 1. Bubble Sort\n\tUnsorted: %s\n",
            Arrays.toString(array_ex1));

        bubbleSort.classicSort(array_ex1);
        
        System.out.printf("\tSorted: %s\n", Arrays.toString(array_ex1));

        int[] array_ex2 = {44, 43, 42, 41, 40, 39, 38};

        System.out.printf("Exercise 2. Merge Sort\n\tUnsorted: %s\n",
            Arrays.toString(array_ex2));

        mergeSort.classicSort(array_ex2);

        System.out.printf("\tSorted: %s", Arrays.toString(array_ex2));

    }
}
