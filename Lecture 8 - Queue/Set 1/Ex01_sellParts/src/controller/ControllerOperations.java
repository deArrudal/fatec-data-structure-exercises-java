package controller;

import model.Queue;
import model.Client;

public class ControllerOperations {
	public ControllerOperations() {
		super();
	}

	public void checkoutClient(Queue<Client> queueClient) {
		if (queueClient.isEmpty()) {
			System.out.println("empty queue");
			return;
		}

		Client client;
		double totalPrice;

		while (!queueClient.isEmpty()) {
			try {
				client = queueClient.removeValue();

				totalPrice = client.getValuePart() * client.getQuantityPart();

				System.out.printf("name: %s\ttotal: %.2f\n", client.getNameClient(), totalPrice);

			} catch (Exception errQueue) {
				System.err.println(errQueue);
			}
		}
	}
}
