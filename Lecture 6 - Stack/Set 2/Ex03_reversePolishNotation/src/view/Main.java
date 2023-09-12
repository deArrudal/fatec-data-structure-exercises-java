package view;

import java.util.Scanner;
import model.IntStack;
import controller.ReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReversePolishNotation rpn = new ReversePolishNotation();
        IntStack stack = new IntStack();

        int value;
        int result;
        String tmp; // temporarily stores the value or operator.

        do {
            System.out.print("Enter value or operation [q to quit]: ");
            tmp = scan.nextLine();

            try {
                value = Integer.parseInt(tmp);
                rpn.insertValue(stack, value);

            } catch (Exception errValue) {
                if (!tmp.equals("q")) {
                    result = rpn.computeOperation(stack, tmp);
                    System.out.println("Result: " + result);
                }
            }

        } while (!tmp.equals("q"));

        scan.close();
    }
}