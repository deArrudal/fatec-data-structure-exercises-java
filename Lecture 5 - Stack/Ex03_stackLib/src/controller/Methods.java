package controller;

import java.util.Random;

import model.IntStack;
import model.StrStack;

public class Methods {
    public Methods() {
        super();
    }

    public void testIntStack() {
        Random rnd = new Random();
        IntStack intStack = new IntStack();

        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(101) + 1;
            intStack.push(num);
        }

        System.out.printf("Size: %d\n", intStack.size());

        try {
            while (!intStack.isEmpty()) {
                System.out.println(intStack.pop());
            }
        } catch (Exception errStack) {
            System.err.println(errStack);
        }
    }

    public void testStrStack() {
        Random rnd = new Random();
        StrStack strStack = new StrStack();

        for (int i = 0; i < 10; i++) {
            char chr = (char) (rnd.nextInt(26) + 'a');
            strStack.push(Character.toString(chr));
        }

        System.out.printf("Size: %d\n", strStack.size());

        try {
            while (!strStack.isEmpty()) {
                System.out.println(strStack.pop());
            }

        } catch (Exception errStack) {
            System.err.println(errStack);

        }
    }
}
