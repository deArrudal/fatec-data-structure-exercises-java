package view;

import controller.Methods;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int n = 125;

        if(n > 2000) {
            System.out.print("Entrada inválida.");
            System.exit(0);
        }

        String answer = methods.convertToBinary(n);

        System.out.printf("(%d)_10 = (%s)_2", n, answer);
    }
}
