package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int n = 10;

        double answer = methods.computeSeries(n);
        System.out.printf("Answer = %.2f", answer);
    }
}