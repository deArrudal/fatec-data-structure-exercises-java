package view;

import controller.CallController;
import javax.swing.JOptionPane;
import model.Queue;

public class Main {
    public static void main(String[] args) {
        CallController methods = new CallController();
        Queue<String> queueCall = new Queue<>();

        String titleMenu = "Call History";
        String promptMenu = "[1] Add call\n[2] Check log\n[9] Quit\nEnter option:";
        String optionMenu;

        String promptCall = "Enter telephone number:";
        String numberCall;

        do {
            optionMenu = JOptionPane.showInputDialog(null, promptMenu, titleMenu, 3);

            switch (optionMenu) {
                case "1":
                    numberCall = JOptionPane.showInputDialog(null, promptCall, titleMenu, 3);
                    methods.addCall(queueCall, numberCall);
                    break;
                case "2":
                    methods.checkLog(queueCall);
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Quit", titleMenu, 1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option", titleMenu, 0);
                    break;
            }
        } while (!optionMenu.equals("9"));
    }
}
