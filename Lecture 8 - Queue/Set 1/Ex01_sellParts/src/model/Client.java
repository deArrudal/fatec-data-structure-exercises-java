package model;

public class Client {
	private String nameClient;
	private double valuePart;
	private int quantityPart;
	
	public Client(String nameClient, double valuePart, int quantityPart) {
		this.nameClient = nameClient;
		this.valuePart = valuePart;
		this.quantityPart = quantityPart;
	}
	
	public String getNameClient() {
		return nameClient;
	}
	
	public double getValuePart() {
		return valuePart;
	}
	
	public int getQuantityPart() {
		return quantityPart;
	}
}
