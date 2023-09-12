package model;

public class IntStack {
	// attributes.
	Node top;

	public IntStack() {
		top = null;
	}

	// check if stack is empty.
	public boolean isEmpty() {
		return top == null;
	}

	// add value to stack.
	public void push(int value) {
		Node node = new Node();
		node.value = value;
		node.next = top;
		top = node;
	}

	// remove the value at top.
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty stack");
		}

		int tmpValue = top.value;
		top = top.next;
		return tmpValue;
	}

	// check value at top of stack.
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty stack");
		}
		return top.value;
	}

	// compute stack's size.
	public int size() {
		int count = 0;

		if (!isEmpty()) {
			Node aux = top;

			while (aux != null) {
				count++;

				aux = aux.next;
			}
		}

		return count;
	}
}
