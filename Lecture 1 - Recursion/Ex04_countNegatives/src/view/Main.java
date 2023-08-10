package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] array = { 0, -1, 2, -3, 4, -5, 6 };
        int size = array.length;

        int answer = methods.countNegatives(array, size);
        System.out.printf("Answer: %d", answer);
    }
}
