package view;

import integertree.model.IntegerTree;

public class Main {
	public static void main(String[] args) {
		IntegerTree intTree = new IntegerTree();
		int[] inputIntTree = { 12, 4, 16, 2, 8, 6 };

		for (int elm : inputIntTree) {
			intTree.insert(elm);
		}

		System.out.print("Element, Floor: ");
		intTree.search(6);

		System.out.println("Original tree:");
		intTree.prefixSearch();
		System.out.println();

		intTree.remove(12);

		System.out.println("Postfix search after element removal:");
		intTree.postfixSearch();

	}
}
