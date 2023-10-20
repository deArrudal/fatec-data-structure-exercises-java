package view;

import controller.SortList;
import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        SortList<Integer> sort = new SortList<>();
        LinkedList<Integer> list = new LinkedList<>();
        int[] array = { 10, 5, 8, 1, 9, 2, 4, 7, 3, 6 };
        int sizeArray = array.length;

        for (int i = 0; i < sizeArray; i++) {
            try {
                list.add(array[i], i);
            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        try {
            list.printList();
            sort.bubbleSort(list);
            list.printList();
        } catch (Exception errList) {
            System.out.println(errList);
        }
    }
}