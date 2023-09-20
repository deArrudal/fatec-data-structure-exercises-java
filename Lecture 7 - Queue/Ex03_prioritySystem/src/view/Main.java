package view;

import controller.QueueControl;
import model.Client;
import model.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        QueueControl methods = new QueueControl();

        Queue<Client> queue = new Queue<>();
        Queue<Client> queuePriority = new Queue<>();
        int number = 1;
        int numberPriority = 1;

        String prompt = "1.Add number\n2.Add number priority\n" +
                "3.Call next\n9.Quit\nEnter option: ";
        int option;

        String promptName = "=> Enter name: ";
        String name;

        do {
            System.out.print(prompt);
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.print(promptName);
                    name = scan.nextLine();
                    methods.addClientQueue(queue, number, name);
                    number++;
                    break;
                case 2:
                    System.out.print(promptName);
                    name = scan.nextLine();
                    methods.addClientQueue(queuePriority, numberPriority, name);
                    numberPriority++;
                    break;
                case 3:
                    methods.callClient(queue, queuePriority);
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