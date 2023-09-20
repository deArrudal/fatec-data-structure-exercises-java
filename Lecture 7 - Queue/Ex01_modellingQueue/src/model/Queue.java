package model;

public class Queue<T> {
	Node<T> first;
	Node<T> last;
	
	public Queue() {
		first = null;
		last = first;
	}
	
	public boolean isEmpty() {
		if (first == last && first == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insertValue(T value) {
		Node<T> newNode = new Node<>();
		
		newNode.value = value;
		newNode.next = null;
		
		if(isEmpty()) { // set first and last to same new node.
			first = newNode;
			last = first;
			
		} else { // set last's next to the new one and update last.
			last.next = newNode;
			last = newNode;
		}
	}
	
	public T removeValue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty Queue");
		}
		
		T value = first.value;
		
		if(first == last && last != null) { // single node queue.
			first = null;
			last = first;
			
		} else { // update first to next node.
			first = first.next;
		}
		
		return value;
	}
	
	public void listValue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Empty Queue");
		}
		
		Node<T> aux = first;
		
		while(aux != null) {
			System.out.print(aux.value + " ");
			
			aux = aux.next;
		}
		
		System.out.println();
	}
	
	public int sizeQueue() {
		int size = 0;
		
		if(!isEmpty()) {
			Node<T> aux = first;
			
			while(aux != null) {
				size++;
				aux = aux.next;
			}
		}
		
		return size;
	}
}
