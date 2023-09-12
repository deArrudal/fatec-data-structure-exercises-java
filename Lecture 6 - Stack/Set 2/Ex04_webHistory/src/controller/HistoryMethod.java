package controller;

import model.StrStack;
import view.Main;

public class HistoryMethod {
    public HistoryMethod() {
        super();
    }

    public void insertAddress(StrStack stack) {
        System.out.print("=> Enter address: ");
        String address = Main.scan.nextLine();

        // check if address is valid.
        if (address.contains("http://www")) {
            stack.push(address);

        } else {
            System.out.println("=> Invalid address");
        }
    }

    public void removeAddress(StrStack stack) {
        try {
            stack.pop();

        } catch (Exception errStack) {
            System.out.println("=> Empty history");
        }
    }

    public void showLastAddress(StrStack stack) {
        if (!stack.isEmpty()) {
            try {
                System.out.println("=> " + stack.top());
            } catch (Exception errStack) {
                System.err.println(errStack);
            }
        } else {
            System.out.println("=> Empty history");
        }
    }
}
