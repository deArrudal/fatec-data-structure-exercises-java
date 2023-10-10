package queue.model;

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

    public void insert(T value) {
        Node<T> node = new Node<>();
        node.data = value;
        node.next = null;

        if (isEmpty()) {
            first = node;
            last = first;
        } else {
            last.next = node;
            last = node;
        }
    }

    public T remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty queue");
        }

        T value = first.data;
        if (first == last && last != null) {
            first = null;
            last = first;
        } else {
            first = first.next;
        }

        return value;
    }

    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Queue");
        }

        Node<T> node = first;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }

    public int size() {
        int i = 0;

        if (!isEmpty()) {
            Node<T> node = first;
            while (node != null) {
                i++;
                node = node.next;
            }
        }

        return i;
    }
}
