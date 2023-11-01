package view;

import controller.HashMethod;
import controller.ReadInput;
import linkedlist.model.LinkedList;

public class Main {
    public static void main(String[] args) {
        ReadInput method = new ReadInput();
        HashMethod hashMethod = new HashMethod(5);

        LinkedList<Integer>[] list = method.getList();
        method.printList();

        System.out.println();

        LinkedList<Integer>[] rehashList = hashMethod.getRehashList(list);
        hashMethod.printRehashList();
    }
}
