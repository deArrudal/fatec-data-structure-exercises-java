package stack.model;

public class Stack<T> {
    Node<T> top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(T value) {
        Node<T> node = new Node<T>();
        node.data = value;
        node.next = top;
        top = node;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty stack");
        }

        T value = top.data;
        top = top.next;

        return value;
    }

    public T top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty stack");
        }

        return top.data;
    }

    public int size() {
        int i = 0;

        if (!isEmpty()) {
            Node<T> aux = top;
            while (aux != null) {
                i++;
                aux = aux.next;
            }
        }

        return i;
    }
}
