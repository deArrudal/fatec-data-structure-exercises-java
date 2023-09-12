package view;

import java.util.Scanner;
import controller.HistoryMethod;
import model.StrStack;

public class Main {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        HistoryMethod method = new HistoryMethod();
        StrStack stack = new StrStack();

        String prompt = "Address History\n1.Insert new address\n" +
                "2.Remove last address\n3.Display last address\n" +
                "9.Quit\nEnter option: ";
        int option;

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    method.insertAddress(stack);
                    break;
                case 2:
                    method.removeAddress(stack);
                    break;
                case 3:
                    method.showLastAddress(stack);
                    break;
                case 9:
                    System.out.println("=> Quit");
                    break;
                default:
                    System.out.println("=> Invalid option");
                    break;
            }

        } while (option != 9);

        scan.close();
    }
}