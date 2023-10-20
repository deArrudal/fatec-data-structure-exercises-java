package controller;

import linkedlist.model.LinkedList;

public class SortList<T extends Comparable<T>> {
    public SortList() {
        super();
    }

    public boolean compareValues(T value1, T value2) {
        // return true if value1 > value2
        return value1.compareTo(value2) > 0;
    }

    public void bubbleSort(LinkedList<T> list) {
        boolean flag_end; // Flag end of sort procedure.
        int size = list.size();

        do {
            flag_end = true; // Reset.

            for (int i = 1; i <= (size - 1); i++) {
                try {
                    if (compareValues(list.get(i - 1), list.get(i))) {
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
}
