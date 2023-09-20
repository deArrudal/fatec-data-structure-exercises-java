package view;

import model.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		
		queue.insertValue(1);
		queue.insertValue(2);
		queue.insertValue(3);
		queue.insertValue(4);
		
		System.out.println(queue.sizeQueue());
		
		try {
			queue.listValue();
			
			queue.removeValue();
			queue.removeValue();

			System.out.println(queue.sizeQueue());			
			
			queue.removeValue();
			queue.removeValue();
			
			System.out.println(queue.sizeQueue());
			
		} catch (Exception errRemove) {
			System.err.println(errRemove);
		}
	}
}
