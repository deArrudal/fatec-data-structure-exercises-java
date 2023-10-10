package view;

import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        try {
            list.addFirst(1);
            list.addLast(2);
            list.add(10, 1);
            list.addFirst(0);
            System.out.println(list.get(1));

            list.add(20, 2);
            System.out.println(list.get(3));

            list.removeFirst();
            list.removeLast();
            list.remove(1);

            System.out.println(list.get(1));
            System.out.println(list.size());

        } catch (Exception errList) {
            System.err.println(errList);
        }
    }
}