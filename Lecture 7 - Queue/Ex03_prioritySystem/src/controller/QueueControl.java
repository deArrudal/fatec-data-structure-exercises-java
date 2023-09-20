package controller;

import model.Client;
import model.Queue;

public class QueueControl {

    int numberService = 1; // number of serviced clients.

    public void addClientQueue(Queue<Client> queue, int number, String name) {
        Client client = new Client(number, name);
        queue.insertValue(client);
        System.out.printf("\t=> Adding %s\n", client.toString());
    }

    public void callClient(Queue<Client> queue, Queue<Client> queuePriority) {
        if (queue.isEmpty() && queuePriority.isEmpty()) {
            System.out.println("=> Queues are empty");
            return;
        }

        Client client;

        try {
            if (!queuePriority.isEmpty()) { // follow 3-1 rule.
                if (numberService % 4 != 0 || queue.isEmpty()) {
                    client = queuePriority.removeValue();
                    System.out.printf("\t=> Calling %s\n", client.toString());

                } else {
                    client = queue.removeValue();
                    System.out.printf("\t=> Calling %s\n", client.toString());

                }
            } else if (!queue.isEmpty()) {
                client = queue.removeValue();
                System.out.printf("\t=> Calling %s\n", client.toString());
            }

            numberService++;

        } catch (Exception errCalling) {
            System.err.println(errCalling);
        }
    }
}
