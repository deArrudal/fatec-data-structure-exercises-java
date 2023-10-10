package linkedlist.model;

public class LinkedList<T> {
    Node<T> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
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

    private Node<T> getNode(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        int i = 0;

        Node<T> node = first;
        while (i < index) {
            node = node.next;
            i++;
        }

        return node;
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>();
        node.data = value;
        node.next = first;
        first = node;
    }

    public void addLast(T value) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();

        Node<T> node = new Node<>();
        Node<T> last = getNode(size - 1);
        node.data = value;
        node.next = null;
        last.next = node;
    }

    public void add(T value, int index) throws Exception {
        int size = size();
        if ((index < 0) || (index > size)) {
            throw new Exception("Invalid index");
        }

        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node<T> node = new Node<>();
            Node<T> last = getNode(index - 1);
            node.data = value;
            node.next = last.next;
            last.next = node;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        first = first.next;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();

        if (size == 1) {
            removeFirst();
        } else {
            Node<T> last = getNode(size - 2);
            last.next = null;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        if (index == 1) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<T> last = getNode(size - 1);
            Node<T> node = getNode(size);
            last.next = node.next;
        }
    }

    public T get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        Node<T> node = getNode(index);
        return node.data;
    }
}
