package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import linkedlist.model.LinkedList;
import model.Client;

public class UpdateClientData {
    public UpdateClientData() {
        super();
    }

    private void newFile(LinkedList<Client> list, String name) throws IOException {
        // verify file.
        File filePath = new File("C:\\temp");
        File fileName = new File("C:\\temp", name + ".csv");
        if (!filePath.isDirectory()) {
            throw new IOException("invalid inputs");
        }

        if (fileName.exists()) {
            fileName.delete();
        }

        fileName.createNewFile();

        Client client;

        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        while (!list.isEmpty()) {
            try {
                client = list.removeFirst();
                printWriter.printf("%s;%s;%d;%f\n",
                        client.cpf, client.name, client.age, client.limitCredit);
            
                    } catch (Exception errList) {
                System.err.println(errList);
            }
        }

        printWriter.close();
        fileWriter.close();
    }

    public void newClientData(int minAge, int maxAge, double limitCredit) throws IOException {
        // verify file.
        File filePath = new File("C:\\temp");
        File fileName = new File("C:\\temp", "client_data.csv");
        if (!filePath.isDirectory() || !fileName.isFile()) {
            throw new IOException("invalid inputs");
        }

        // read file.
        String line;
        String[] splitline = new String[4]; // CPF;Nome;Idade;LimiteCredito
        int age;
        double credit;

        LinkedList<Client> clientList = new LinkedList<>();

        Scanner scan = new Scanner(fileName);
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            splitline = line.split(";");

            age = Integer.parseInt(splitline[2]);
            credit = Double.parseDouble(splitline[3]);

            if ((age >= minAge) && (age <= maxAge) && (credit > limitCredit)) {
                Client client = new Client(splitline[0], splitline[1], age, credit);
                try {
                    clientList.addLast(client);
                } catch (Exception errList) {
                    System.err.println(errList);
                }
            }
        }

        scan.close();

        String name = "Age " + minAge + " - " + maxAge + " Credit " + limitCredit;
        newFile(clientList, name);
    }
}
