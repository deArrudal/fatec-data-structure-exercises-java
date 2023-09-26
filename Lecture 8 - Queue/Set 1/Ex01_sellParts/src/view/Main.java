package view;

import controller.ControllerOperations;
import java.util.Random;
import model.Client;
import model.Queue;

public class Main {
	public static void main(String[] args) {
		ControllerOperations methods = new ControllerOperations();
		Random rnd = new Random();
		Queue<Client> queueClient = new Queue<>();
		
		String nameClient;
		double valuePart;
		int quantityPart;
		
		for(int i = 1; i < 21; i++) {
			nameClient = "client" + i;
			valuePart = rnd.nextDouble() * 95 + 5;
			quantityPart = rnd.nextInt(50 - 20) + 20;
			
			Client client = new Client(nameClient, valuePart, quantityPart);
			
			queueClient.insertValue(client);
		}
		
		methods.checkoutClient(queueClient);
	}
}
