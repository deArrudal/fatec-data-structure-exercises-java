package model;

public class IntStack {
	// attributes.
	IntNode top;

	public IntStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int value) {
		IntNode node = new IntNode();
		node.value = value;
		node.next = top;
		top = node;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty stack");
		}
		
		int tmpValue = top.value;
		top = top.next;
		return tmpValue;
	}
	
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty stack");			
		}
		return top.value;
	}
	
	public int size() {
		int count = 0;
		
		if(!isEmpty()) {
			IntNode aux = top;
			
			while(aux != null) {
				count++;
				
				aux = aux.next;
			}
		}
		
		return count; 
	}
}
