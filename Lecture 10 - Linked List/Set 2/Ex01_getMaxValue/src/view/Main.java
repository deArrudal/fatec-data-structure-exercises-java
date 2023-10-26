package view;

import controller.MethodList;
import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        MethodList<Integer> methods = new MethodList<>();
        LinkedList<Integer> list = new LinkedList<>();
        int[] array = { 3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16 };

        try {
            for (int element : array) {
                list.addLast(element);
            }

            list.printList();
            methods.getMax(list, 2);
            list.printList();
        } catch (Exception errList) {
            System.err.println(errList);
        }

    }
}