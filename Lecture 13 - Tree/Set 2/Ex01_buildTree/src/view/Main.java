package view;

import integertree.model.IntegerTree;

public class Main {
	public static void main(String[] args) {
		IntegerTree intTree = new IntegerTree();
		int[] inputIntTree = { 30, 15, 60, 10, 20, 40, 80 };

		for (int elm : inputIntTree) {
			intTree.insert(elm);
		}

		System.out.println("Original tree:");
		intTree.prefixSearch();
		System.out.println();

		System.out.println("Infix search:");
		intTree.infixSearch();
		System.out.println();

		intTree.remove(60);

		System.out.println("Infix search after element removal:");
		intTree.infixSearch();

	}
}
