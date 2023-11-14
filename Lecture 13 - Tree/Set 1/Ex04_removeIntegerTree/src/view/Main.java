package view;

import integertree.model.IntegerTree;

public class Main {
	public static void main(String[] args) {
		IntegerTree intTree = new IntegerTree();
		int[] inputIntTree = { 7, 8, 3, 4, 2, 1, 6, 5 };

		for (int elm : inputIntTree) {
			intTree.insert(elm);
		}

		intTree.remove(7);

		intTree.remove(6);

		intTree.prefixSearch();
		System.out.println();

		intTree.infixSearch();
		System.out.println();

		intTree.postfixSearch();

	}
}
