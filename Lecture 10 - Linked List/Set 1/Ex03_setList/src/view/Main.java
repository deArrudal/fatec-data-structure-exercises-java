package view;

import setlist.model.SetList;

public class Main {
    public static void main(String[] args) {
        SetList<Integer> setL = new SetList<>();
        int[] array = { 1, 3, 5, 7, 9, 10, 2, 2, 4, 4, 4, 6, 8, 8, 10, 10, 11, 12, 13, 14, 15 };

        for (int element : array) {
            try {
                setL.addLast(element);
            } catch (Exception errSet) {
                System.err.println(errSet);
            }
        }

        try {
            setL.printList();
        } catch (Exception errSet) {
            System.err.println(errSet);
        }
    }
}
