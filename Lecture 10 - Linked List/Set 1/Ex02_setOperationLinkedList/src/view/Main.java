package view;

import controller.SetOperationList;
import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        SetOperationList<Integer> method = new SetOperationList<>();

        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        LinkedList<Integer> intersect = new LinkedList<>();
        LinkedList<Integer> union = new LinkedList<>();

        int[] arrayA = { 3, 5, 8, 12, 9, 7, 16, 3 };
        int[] arrayB = { 9, 6, 2, 3, 7 };

        for (int element : arrayA) {
            try {
                listA.addLast(element);
            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        for (int element : arrayB) {
            try {
                listB.addLast(element);
            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        try {
            listA.printList();
            listB.printList();

            intersect = method.intersectList(listA, listB);
            intersect.printList();

            union = method.unionList(listA, listB);
            union.printList();

        } catch (Exception errSetOp) {
            System.err.println(errSetOp);
        }
    }
}