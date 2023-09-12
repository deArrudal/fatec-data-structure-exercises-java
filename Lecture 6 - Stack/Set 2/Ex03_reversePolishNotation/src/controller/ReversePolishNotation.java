package controller;

import model.IntStack;

public class ReversePolishNotation {
    public ReversePolishNotation() {
        super();
    }

    public void insertValue(IntStack stack, int value) {
        stack.push(value);
    }

    public int computeOperation(IntStack stack, String operator) {
        int x, y;
        int result = 0; // default value.

        try {
            x = stack.pop();
            y = stack.pop();

            switch (operator) {
                case "+":
                    result = y + x;
                    this.insertValue(stack, result);
                    break;
                case "*":
                    result = y * x;
                    this.insertValue(stack, result);
                    break;
                case "-":
                    result = y - x;
                    this.insertValue(stack, result);
                    break;
                case "/":
                    result = y / x;
                    this.insertValue(stack, result);
                    break;
                default:
                    System.out.println("Invalid operator");
                    // return popped values to stack.
                    this.insertValue(stack, y);
                    this.insertValue(stack, x);
                    break;
            }
        } catch (Exception errStack) {
            System.err.println(errStack);
        }

        return result;
    }
}
