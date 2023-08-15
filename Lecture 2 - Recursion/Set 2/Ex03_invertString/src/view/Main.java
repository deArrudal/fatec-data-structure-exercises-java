package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        String sample = "banana";

        String answer = methods.invertString(sample);

        System.out.printf("Original: %s\nInverted: %s", sample, answer);
    }
}
