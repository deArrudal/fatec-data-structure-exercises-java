package view;

import model.IntStack;

public class Main {
	public static void main(String[] args) {
		IntStack stack = new IntStack();
		
		for(int i = 0; i < 10; i++) {
			int value = (int) (Math.random() * 100 + 1);
			stack.push(value);
		}
		
		System.out.printf("Size: %d\n", stack.size());
		
		try {
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
			
		} catch (Exception errStack) {
			System.err.println(errStack);
			
		}
	}
}
