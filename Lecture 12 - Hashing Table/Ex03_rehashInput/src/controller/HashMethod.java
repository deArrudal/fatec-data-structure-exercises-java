package controller;

import linkedlist.model.LinkedList;

public class HashMethod {

    LinkedList<Integer>[] rehashList;
    int size;

    public HashMethod(int size) {
        this.size = size;
        rehashList = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            rehashList[i] = new LinkedList<>();
        }
    }

    private int computeHash(int number) {
        return number % size;
    }

    public LinkedList<Integer>[] getRehashList(LinkedList<Integer>[] list) {
        int sizeList = list.length;
        int sizeNode;

        for (int i = 0; i < sizeList; i++) {
            sizeNode = list[i].size();

            for (int j = 0; j < sizeNode; j++) {
                try {
                    rehashList[computeHash(i)].addLast(list[i].get(j));
                } catch (Exception errAdd) {
                    System.err.println(errAdd);
                }
            }
        }

        return rehashList;
    }

    public void printRehashList() {
        for (int i = 0; i < size; i++) {
            try {
                System.out.print(i + ": ");
                rehashList[i].printList();
            } catch (Exception errPrint) {
                System.err.println(errPrint);
            }
        }
    }
}