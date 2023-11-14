package view;

import chartree.model.CharTree;
import integertree.model.IntegerTree;

public class Main {
	public static void main(String[] args) {
		IntegerTree intTree = new IntegerTree();
		int[] inputIntegerTree = { 108, 130, 127, 10, 0, 13, 131,
				184, 26, 2, 14, 158, 144, 69, 79, 111 };

		for (int elm : inputIntegerTree) {
			intTree.insert(elm);
		}

		intTree.search(26);

		intTree.prefixSearch();

		System.out.println();

		intTree.infixSearch();

		System.out.println();

		intTree.postfixSearch();

		intTree.remove(10);

		System.out.println();

		intTree.infixSearch();

		System.out.println();

		CharTree charTree = new CharTree();
		char[] inputCharTree = { 'M', 'F', 'S', 'D', 'J', 'P', 'U',
				'A', 'E', 'H', 'Q', 'T', 'W', 'K' };

		for (char elm : inputCharTree) {
			charTree.insert(elm);
		}

		charTree.search('A');

		charTree.prefixSearch();

		System.out.println();

		charTree.infixSearch();

		System.out.println();

		charTree.postfixSearch();

		charTree.remove('D');

		System.out.println();

		charTree.infixSearch();
	}
}
