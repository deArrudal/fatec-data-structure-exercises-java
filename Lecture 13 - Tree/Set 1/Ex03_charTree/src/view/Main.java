package view;

import chartree.model.CharTree;

public class Main {
	public static void main(String[] args) {
		CharTree charTree = new CharTree();
		char[] inputCharTree = { 'M', 'F', 'S', 'D', 'J', 'P',
				'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K' };

		for (char elm : inputCharTree) {
			charTree.insert(elm);
		}

		charTree.remove('F');

		charTree.remove('U');

		charTree.prefixSearch();
		System.out.println();

		charTree.infixSearch();
		System.out.println();

		charTree.postfixSearch();

	}
}
