package view;

import controller.PrinterController;
import javax.swing.JOptionPane;
import model.Queue;

public class Main {
    public static void main(String[] args) {
        PrinterController methods = new PrinterController();
        Queue<String> queuePrinter = new Queue<>();

        String titlePrinter = "Printer";
        String promptPrinter = "[1] Add document\n[2] Start printer\n[9] Quit\nEnter option:";
        String optionPrinter;

        String titleFile = "File";
        String promptFile = "Enter file name:";
        String file;
        String fileCode;

        do {
            optionPrinter = JOptionPane.showInputDialog(null, promptPrinter, titlePrinter, 3);

            switch (optionPrinter) {
                case "1":
                    file = JOptionPane.showInputDialog(null, promptFile, titleFile, 3);
                    fileCode = "ID0" + (int) (Math.random() * 11 + 1) + ";" + file;
                    methods.addFile(queuePrinter, fileCode);
                    break;
                case "2":
                    methods.printFile(queuePrinter);
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Quit", titlePrinter, 1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option", titlePrinter, 0);
                    break;
            }

        } while (!optionPrinter.equals("9"));
    }
}
