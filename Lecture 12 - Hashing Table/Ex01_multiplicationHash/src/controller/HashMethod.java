package controller;

import linkedlist.model.LinkedList;

public class HashMethod {

    LinkedList<Integer>[] hashTable;
    int size = 100;

    public HashMethod() {
        hashTable = new LinkedList[size];
        initHashTable();
    }

    private void initHashTable() {
        for (int i = 0; i < size; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int computeHash(int number) {
        return (int) (100 * ((((Math.sqrt(7) - 1) * (double) number) / 2) % 1));
    }

    public void fillHashTable(int[] inputs) {
        int sizeInputs = inputs.length;
        for (int i = 0; i < sizeInputs; i++) {
            try {
                hashTable[computeHash(inputs[i])].addLast(inputs[i]);
            } catch (Exception errAdd) {
                System.err.println(errAdd);
            }
        }
    }

    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            try {
                System.out.print(i + ": ");
                hashTable[i].printList();
            } catch (Exception errPrint) {
                System.err.println(errPrint);
            }
        }
    }
}