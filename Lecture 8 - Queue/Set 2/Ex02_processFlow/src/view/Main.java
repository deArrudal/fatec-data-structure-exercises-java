package view;

import controller.ProcessController;
import java.util.Scanner;
import model.Process;
import model.Queue;

public class Main {
    public static void main(String[] args) {
        ProcessController methods = new ProcessController();
        Scanner scan = new Scanner(System.in);
        Queue<Process> queueProcess = new Queue<>();

        // read input.
        String prompt = "Round Robin Process Scheduler\n" +
                "format: {\"processname;quantity\",\"processname;quantity\"}\n" +
                "Enter process list: ";
        System.out.print(prompt);
        String tmpInput = scan.nextLine();

        // format input.
        tmpInput = tmpInput.replace("{", "");
        tmpInput = tmpInput.replace("}", "");

        String[] processes = tmpInput.split(",");

        String[] tmpProcess;
        String nameProcess;
        int quantityProcess;

        for (String process : processes) {
            process = process.replace("\"", "");
            tmpProcess = process.split(";");

            nameProcess = tmpProcess[0];
            quantityProcess = Integer.parseInt(tmpProcess[1]);

            queueProcess.insertValue(new Process(nameProcess, quantityProcess));
        }

        System.out.println("Starting round robin");
        methods.runRoundRobin(queueProcess);

        scan.close();
    }
}
