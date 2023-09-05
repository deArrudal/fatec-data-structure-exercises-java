package model;

public class StrStack {
	// attributes.
	StrNode top;

	public StrStack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(String data) {
		StrNode node = new StrNode();
		node.data = data;
		node.next = top;
		top = node;
	}
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty stack");
		}
		
		String tmpData = top.data;
		top = top.next;
		return tmpData;
	}
	
	public String top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty stack");			
		}
		return top.data;
	}
	
	public int size() {
		int count = 0;
		
		if(!isEmpty()) {
			StrNode aux = top;
			
			while(aux != null) {
				count++;
				
				aux = aux.next;
			}
		}
		
		return count; 
	}
}
