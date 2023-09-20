package model;

// model a queue node using generics.
public class Node<T> {
	T value;
	Node<T> next;
	
	// modify the node's output when displayed.
	@Override
	public String toString() {
		return "["+value+"]";
	}
}
