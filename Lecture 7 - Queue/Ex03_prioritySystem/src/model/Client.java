package model;

public class Client {
    int numberQueue;
    String nameClient;

    public Client(int numberQueue, String nameClient) {
        this.numberQueue = numberQueue;
        this.nameClient = nameClient;
    }

    @Override
    public String toString() {
        return numberQueue + ", " + nameClient;
    }
}
