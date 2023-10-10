package controller;

import linkedlist.model.LinkedList;
import stack.model.Stack;

public class Methods<T> {
    public Methods() {
        super();
    }

    public void printList(LinkedList<T> list) {
        int size = list.size();
        int i = 0;

        try {
            while (i < size - 1) {
                System.out.print(list.get(i) + ", ");
                i++;
            }
            System.out.print(list.get(size - 1) + "\n");

        } catch (Exception errList) {
            System.err.println(errList);
        }
    }

    public void reverseList(LinkedList<T> list) {
        Stack<T> stack = new Stack<>();

        while (!list.isEmpty()) {
            try {
                stack.push(list.get(0)); // add value to stack.
                list.removeFirst(); // remove value from list.
            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        while (!stack.isEmpty()) {
            try {
                if (list.isEmpty()) {
                    list.addFirst(stack.pop());
                } else {
                    list.addLast(stack.pop()); // add popped value as last entry.
                }
            } catch (Exception errStack) {
                System.err.println(errStack);
            }
        }
    }
}
