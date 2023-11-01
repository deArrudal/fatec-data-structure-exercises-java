package view;

import controller.AccountManager;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AccountManager methods = new AccountManager();

        String prompt = "Account Data\n" +
                "1.Insert account\n2.Remove account\n" +
                "3.Find account\n9.Quit\nEnter option:";
        String option;

        int idAccount;
        String nameAccount;
        Double amountAccount;

        do {
            option = JOptionPane.showInputDialog(prompt);

            switch (option) {
                case "1":
                    idAccount = Integer.parseInt(JOptionPane.showInputDialog("Enter account's number:"));
                    nameAccount = JOptionPane.showInputDialog("Enter client's name:");
                    amountAccount = Double.parseDouble(JOptionPane.showInputDialog("Enter account's amount:"));
                    JOptionPane.showMessageDialog(null, methods.addAccount(idAccount, nameAccount, amountAccount));
                    break;
                case "2":
                    idAccount = Integer.parseInt(JOptionPane.showInputDialog("Enter account's number:"));
                    JOptionPane.showMessageDialog(null, methods.removeAccount(idAccount));
                    break;
                case "3":
                    idAccount = Integer.parseInt(JOptionPane.showInputDialog("Enter account's number:"));
                    JOptionPane.showMessageDialog(null, methods.findAccount(idAccount));
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Quit");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
                    break;
            }
        } while (!option.equals("9"));

    }
}