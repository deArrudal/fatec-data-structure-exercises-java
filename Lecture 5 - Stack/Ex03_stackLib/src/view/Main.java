package view;

import controller.Methods;

public class Main {
	public static void main(String[] args) {
		Methods methods = new Methods();

		methods.testIntStack();

		System.out.println();

		methods.testStrStack();
	}
}
