package controller;

import model.StrStack;

public class Palindrome {
    public Palindrome() {
        super();
    }

    // create a stack containing the word in inverted order.
    private StrStack invertWord(String word) {
        StrStack stack = new StrStack();
        String[] array = word.split("");

        for (String string : array) {
            stack.push(string);
        }

        return stack;
    }

    // check if word is palindrome
    public boolean isPalindrome(String word) {
        StrStack stack = invertWord(word);
        boolean flag = true;
        String[] array = word.split("");
        String aux;

        for (String string : array) {
            try {
                aux = stack.pop();
                if (!string.equals(aux)) {
                    flag = false;
                }
            } catch (Exception errStack) {
                System.err.println(errStack);
            }
        }

        return flag;
    }
}
