package model;

public class LinkedList<T> {

    NodeList<T> first;

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

    public int sizeList() {
        int i = 0;

        if (!isEmpty()) {
            NodeList<T> aux = first;

            while (aux != null) { // loop through list.
                i++;
                aux = aux.next;
            }
        }

        return i;
    }

    private NodeList<T> getNode(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = sizeList();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        int i = 0;
        NodeList<T> aux = first;

        while (i < index) { // loop through nodes till index.
            aux = aux.next;
            i++;
        }

        return aux;
    }

    public void addFirst(T value) {
        NodeList<T> node = new NodeList<>();
        node.data = value;
        node.next = first;
        first = node;
    }

    public void addLast(T value) throws Exception {
        if (isEmpty()) {
            // addFirst(value);
            // return;

            throw new Exception("Empty list");
        }

        int size = sizeList();
        NodeList<T> node = new NodeList<>();
        NodeList<T> last = getNode(size - 1);
        node.data = value;
        node.next = null;
        last.next = node;
    }

    public void addNode(T value, int index) throws Exception {
        int size = sizeList();
        if ((index < 0) || (index > size)) {
            throw new Exception("Invalid index");
        }

        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            NodeList<T> last = getNode(index - 1);
            NodeList<T> node = new NodeList<>();
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

        int size = sizeList();
        if (size == 1) {
            removeFirst();
        } else {
            NodeList<T> last = getNode(size - 2);
            last.next = null;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = sizeList();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        if (index == 1) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            NodeList<T> last = getNode(size - 1);
            NodeList<T> node = getNode(size);
            last.next = node.next;
        }
    }

    public T get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = sizeList();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        NodeList<T> node = getNode(index);
        return node.data;
    }
}
