package view;

import controller.Methods;
import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        Methods<Integer> methods = new Methods<>();
        LinkedList<Integer> list = new LinkedList<>();
        int[] array = { 3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16 };
        int sizeArray = array.length;

        // Add elements to the list.
        for (int i = 0; i < sizeArray; i++) {
            try {
                list.add(array[i], i);
            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        try {
            list.printList(); // display original
            methods.reverseList(list);
            list.printList(); // display reverse
        } catch (Exception errList) {
            System.err.println(errList);
        }

    }
}