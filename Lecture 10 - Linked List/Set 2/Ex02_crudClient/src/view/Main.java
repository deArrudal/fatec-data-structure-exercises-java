package view;

import java.io.IOException;
import controller.UpdateClientData;

public class Main {
    public static void main(String[] args) {
        UpdateClientData method = new UpdateClientData();

        try {
            method.newClientData(41, 60, 8000.00);
            method.newClientData(31, 40, 5000.00);
            method.newClientData(21, 30, 3000.00);
        } catch (IOException errMethod) {
            System.err.println(errMethod);
        }

    }
}
