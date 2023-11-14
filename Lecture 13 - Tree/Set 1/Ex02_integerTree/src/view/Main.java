package view;

import integertree.model.IntegerTree;

public class Main {
	public static void main(String[] args) {
		IntegerTree intTree = new IntegerTree();
		int[] inputIntTree = { 33, 15, 41, 38, 47, 34, 49, 43 };

		for (int elm : inputIntTree) {
			intTree.insert(elm);
		}

		intTree.prefixSearch();
		System.out.println();

		intTree.infixSearch();
		System.out.println();

		intTree.postfixSearch();

	}
}
