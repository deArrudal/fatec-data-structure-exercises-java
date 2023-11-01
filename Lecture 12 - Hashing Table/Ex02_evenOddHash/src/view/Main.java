package view;

import controller.HashMethod;

public class Main {
    public static void main(String[] args) {
        HashMethod method = new HashMethod();

        int size = 20;
        int[] inputs = new int[size];
        for(int i = 0; i < size; i++) {
            inputs[i] = (int) (Math.random() * 101);
        }

        method.fillHashTable(inputs);
        method.printHashTable();
    }
}
