package view;

import controller.StoreManager;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StoreManager method = new StoreManager();

        String prompt = "Department Store\n" +
                "1.Insert\n2.Remove\n3.Find\n9.Quit\n" +
                "Enter option:";
        String option;

        String name; // used by search and remove
        String description; // used to compute hash

        do {
            option = JOptionPane.showInputDialog(prompt);

            switch (option) {
                case "1":
                    name = JOptionPane.showInputDialog("Enter name:");
                    description = JOptionPane.showInputDialog("Enter description:");
                    JOptionPane.showMessageDialog(null, method.addProduct(name, description));
                    break;
                case "2":
                    name = JOptionPane.showInputDialog("Enter name:");
                    description = JOptionPane.showInputDialog("Enter description:");
                    JOptionPane.showMessageDialog(null, method.removeProduct(name, description));
                    break;
                case "3":
                    name = JOptionPane.showInputDialog("Enter name:");
                    description = JOptionPane.showInputDialog("Enter description:");
                    JOptionPane.showMessageDialog(null, method.findProduct(name, description));
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, "Quit");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
            }
        } while (!option.equals("9"));
    }
}