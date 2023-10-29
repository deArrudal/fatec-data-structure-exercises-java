package view;

import controller.ChocolateStorage;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ChocolateStorage method = new ChocolateStorage();

        String prompt = "+++Chocolate Storage+++\n" +
                "1.Add new chocolate\n2.Remove chocolate\n" +
                "3.Display storage\n9.Quit\nEnter option: ";
        String option;

        do {
            System.out.print(prompt);
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    method.addChocolate(readInput());
                    break;
                case "2":
                    method.removeChocolate(readInput());
                    break;
                case "3":
                    method.displayStorage();
                    break;
                case "9":
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!option.equals("9"));

        scanner.close();
    }

    public static int readInput() {
        System.out.print("Insert value: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
