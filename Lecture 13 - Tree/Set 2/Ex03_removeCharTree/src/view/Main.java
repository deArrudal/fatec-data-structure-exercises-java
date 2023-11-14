package view;

import chartree.model.CharTree;

public class Main {
	public static void main(String[] args) {
		CharTree charTree = new CharTree();
		char[] inputCharTree = { 'k', 'd', 'm', 'b', 'f',
				'l', 't', 'c', 'p', 'z', 'r' };

		for (char elm : inputCharTree) {
			charTree.insert(elm);
		}

		System.out.println("Original tree:");
		charTree.prefixSearch();
		System.out.println();

		charTree.remove('m');

		System.out.println("Outputs after removal:");
		charTree.prefixSearch();
		System.out.println();

		charTree.infixSearch();
		System.out.println();

		charTree.postfixSearch();
		System.out.println();

		System.out.print("Element, Floor: ");
		charTree.search('r');
	}
}
