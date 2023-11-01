package controller;

import linkedlist.model.LinkedList;

public class ReadInput {

    LinkedList<Integer>[] list;

    int[][] array = { { 12, 647, 158, 136, 467 },
            { 156, 600, 551 },
            { 263, 414, 882, 945, 914, 953, 629 },
            { 884, 795, 194, 513 },
            { 591, 847, 66, 337, 979 },
            { 768, 53 },
            { 114, 803, 90, 339, 550 },
            { 574, 977, 216, 99, 617, 88 },
            { 142, 148, 227, 939, 585, 338, 206 },
            { 569, 708, 844 } };

    int sizeCol = array.length;
    int sizeRow;

    public ReadInput() {
        list = new LinkedList[sizeCol];

        for (int i = 0; i < sizeCol; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public LinkedList<Integer>[] getList() {
        for (int i = 0; i < sizeCol; i++) {
            sizeRow = array[i].length;

            for (int j = 0; j < sizeRow; j++) {
                try {
                    list[i].addLast(array[i][j]);
                } catch (Exception errAdd) {
                    System.err.println(errAdd);
                }
            }
        }

        return list;
    }

    public void printList() {
        for (int i = 0; i < sizeCol; i++) {
            try {
                System.out.print(i + ": ");
                list[i].printList();
            } catch (Exception errPrint) {
                System.err.println(errPrint);
            }
        }
    }
}