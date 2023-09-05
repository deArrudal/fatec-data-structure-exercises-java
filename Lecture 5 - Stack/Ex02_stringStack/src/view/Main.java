package view;

import java.util.Random;

import model.StrStack;

public class Main {

	public static void main(String[] args) {
		StrStack stack = new StrStack();
		
		for(int i = 0; i < 10; i++) {
			Random rnd = new Random();
			char chr = (char) (rnd.nextInt(26) + 'a');
			
			stack.push(Character.toString(chr));
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
