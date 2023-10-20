package controller;

import linkedlist.model.LinkedList;

public class SetOperationList<T extends Comparable<T>> {
    public SetOperationList() {
        super();
    }

    private int compareValues(T value1, T value2) {
        return value1.compareTo(value2);
    }

    private void bubbleSort(LinkedList<T> list) {
        boolean flag_end; // Flag end of sort procedure.
        int size = list.size();
        do {
            flag_end = true; // Reset.
            for (int i = 1; i <= (size - 1); i++) {
                try {
                    if (compareValues(list.get(i - 1), list.get(i)) > 0) {
                        list.add(list.remove(i - 1), i);
                        flag_end = false;
                    }
                } catch (Exception errSwap) {
                    System.err.println(errSwap);
                }
            }
            size--; // Decrease loop's upper limit.
        } while (!flag_end);
    }

    private void removeDuplicate(LinkedList<T> list) {
        int size = list.size();

        try {
            for (int i = 0; i < size; i++) {
                int j = i + 1;
                while (j < size) {
                    if (compareValues(list.get(i), list.get(j)) == 0) {
                        list.remove(j);
                        size = list.size();
                        continue; // skip increment due to list movement.
                    }
                    j++;
                }
            }
        } catch (Exception errDuplicate) {
            System.err.println(errDuplicate);
        }
    }

    public LinkedList<T> intersectList(LinkedList<T> listA, LinkedList<T> listB) {
        LinkedList<T> list = new LinkedList<>();

        bubbleSort(listA);
        bubbleSort(listB);
        removeDuplicate(listA);
        removeDuplicate(listB);

        int sizeA = listA.size();
        int sizeB = listB.size();

        try {
            for (int i = 0; i < sizeA; i++) {
                for (int j = 0; j < sizeB; j++) {
                    if (compareValues(listA.get(i), listB.get(j)) == 0) {
                        list.addLast(listA.get(i));
                        break;
                    }
                }
            }

        } catch (Exception errIntersect) {
            System.err.println(errIntersect);
        }

        return list;
    }

    public LinkedList<T> unionList(LinkedList<T> listA, LinkedList<T> listB) {
        LinkedList<T> list = new LinkedList<>();

        int sizeA = listA.size();
        int sizeB = listB.size();

        try {
            for (int i = 0; i < sizeA; i++) {
                list.addLast(listA.get(i));
            }
            for (int j = 0; j < sizeB; j++) {
                list.addLast(listB.get(j));
            }
        } catch (Exception errUnion) {
            System.err.println(errUnion);
        }

        bubbleSort(list);
        removeDuplicate(list);

        return list;
    }
}
