package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int n = 10;

        float answer = methods.computeSeries(n);

        System.out.printf("S(%d) = %.3f", n, answer);
    }    
}
