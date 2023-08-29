package controller;

import bubblesort.BubbleSort;
import mergesort.MergeSort;
import quicksort.QuickSort;

public class Methods {
    public Methods() {
        super();
    }

    public void performanceSort(int[] array) {
        BubbleSort bsort = new BubbleSort();
        MergeSort msort = new MergeSort();
        QuickSort qsort = new QuickSort();

        int[] array_output;

        long ti = System.nanoTime();
        array_output = bsort.sort(array);
        long tf = System.nanoTime();
        System.out.printf("Buble Sort: %.5f [s]\n", (tf - ti) / Math.pow(10, 9));

        ti = System.nanoTime();
        array_output = msort.sort(array);
        tf = System.nanoTime();
        System.out.printf("Merge Sort: %.5f [s]\n", (tf - ti) / Math.pow(10, 9));

        ti = System.nanoTime();
        array_output = qsort.sort(array);
        tf = System.nanoTime();
        System.out.printf("Quick Sort: %.5f [s]\n", (tf - ti) / Math.pow(10, 9));

    }
}
