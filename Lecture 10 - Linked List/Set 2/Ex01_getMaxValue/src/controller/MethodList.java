package controller;

import linkedlist.model.LinkedList;

public class MethodList<T extends Comparable<T>> {
    public MethodList() {
        super();
    }

    private int compareValues(T value1, T value2) {
        return value1.compareTo(value2);
    }

    public void getMax(LinkedList<T> list, int n) {
        LinkedList<T> listMax = new LinkedList<>();
        int[] idMax = new int[n];
        int i = 0;
        int size = list.size();
        T max;

        try {
            // find current max, store it and remove from list. 
            while (i < n) {
                max = list.get(0);
                idMax[i] = 0;

                for (int j = 1; j < size; j++) {
                    if (compareValues(list.get(j), max) > 0) {
                        max = list.get(j);
                        idMax[i] = j;
                    }
                }

                listMax.addLast(max);
                list.remove(idMax[i]);

                size = list.size();
                i++;
            }

            // restore elements to original list.
            for (i = n; i > 0; i--) {
                max = listMax.get(i - 1);
                list.add(max, idMax[i - 1]);
            }

            listMax.printList();
        } catch (Exception errList) {
            System.err.println(errList);
        }

    }
}
