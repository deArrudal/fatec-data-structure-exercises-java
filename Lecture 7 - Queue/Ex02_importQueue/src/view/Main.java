package view;

import model.Queue;

public class Main {
    public static void main(String[] args) {
        // simulation1();
        simulation2();
    }

    public static void simulation1() {
        Queue<Integer> queue = new Queue<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                queue.insertValue(i * i);

            } else {
                if (i <= 5) {
                    queue.insertValue(i);

                } else {
                    try {
                        System.out.println(queue.removeValue());

                    } catch (Exception errRemove) {
                        System.err.println(errRemove);
                    }
                }
            }
            try {
                queue.listValue();

            } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        System.out.println(queue.sizeQueue());
    }

    private static void simulation2() {
        Queue<Integer> queue = new Queue<>();

        for (int i = 100; i < 115; i++) {
            if (queue.isEmpty()) {
                queue.insertValue(i + 100);

            } else {
                if (queue.sizeQueue() <= 4) {
                    queue.insertValue(i + 50);

                } else {
                    try {
                        System.out.println(queue.removeValue());

                    } catch (Exception errRemove) {
                        System.err.println(errRemove);
                    }
                }
            }
            try {
                queue.listValue();

            } catch (Exception errList) {
                System.err.println(errList);
            }
        }
        System.out.println(queue.sizeQueue());

    }
}