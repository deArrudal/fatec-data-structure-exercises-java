package controller;

import linkedlist.model.LinkedList;

public class ChocolateStorage {
    LinkedList<Integer>[] storage;
    int[] chocolateWeight = { 60, 115, 160, 215, 280 };
    int size = 5;

    public ChocolateStorage() {
        storage = new LinkedList[size];
        initStorage(size);
    }

    private void initStorage(int size) {
        for (int i = 0; i < size; i++) {
            storage[i] = new LinkedList<>();
        }
    }

    private int hashID(int volume) {
        return (volume / 50) - 1;
    }

    public void addChocolate(int volume) {
        int id = hashID(volume);

        if (id < 0 || id >= size) {
            System.out.println("Invalid dimensions");
            return;
        }

        try {
            storage[id].addLast(volume);
        } catch (Exception errAdd) {
            System.err.println(errAdd);
        }
    }

    private int findWeight(int weight) {
        for (int i = 0; i < size; i++) {
            if (weight == chocolateWeight[i]) {
                return i;
            }
        }

        return -1;
    }

    public void removeChocolate(int weight) {
        try {
            int storageId = findWeight(weight);

            if (storageId == -1) {
                System.out.println("Invalid weight");
                return;
            }

            System.out.println(storage[storageId].removeFirst() + "cm^3 of chocolate removed.");

        } catch (Exception errRemove) {
            System.out.println(errRemove);
        }
    }

    public void displayStorage() {
        for (int i = 0; i < size; i++) {
            try {
                storage[i].printList();
            } catch (Exception errDisplay) {
                System.err.println(errDisplay);
            }
        }
    }
}