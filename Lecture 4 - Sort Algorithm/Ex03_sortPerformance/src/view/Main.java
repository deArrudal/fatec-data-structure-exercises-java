package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] array = new int[150000];
        int size = array.length;

        for (int i = 0; i < size; i++) {
            array[i] = size - (i + 1);
        }

        methods.performanceSort(array);
    }
}