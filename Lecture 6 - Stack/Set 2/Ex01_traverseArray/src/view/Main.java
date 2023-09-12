package view;

import model.IntStack;

public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        int[] array = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
        int aux;

        for (int i : array) {
            if (i >= 0) {
                stack.push(i);
            } else {
                try {
                    aux = stack.pop() + stack.pop();
                    stack.push(i);
                    stack.push(aux);
                } catch (Exception errStack) {
                    System.err.println(errStack);
                }
            }
        }

        System.out.println("Stack's size: " + stack.size());
    }
}