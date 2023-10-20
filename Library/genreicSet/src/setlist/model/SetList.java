package setlist.model;

public class SetList<T extends Comparable<T>> {
    Node<T> first;

    public SetList() {
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

    private int compareValues(T value1, T value2) {
        return value1.compareTo(value2);
    }

    private boolean isNodePresent(T value) {
        if (!isEmpty()) {
            Node<T> node = first;
            while (node != null) {
                if (compareValues(node.data, value) == 0) {
                    return true;
                }
                node = node.next;
            }
        }

        return false;
    }

    public void addFirst(T value) throws Exception {
        if (isNodePresent(value)) {
            throw new Exception("Repeated element");
        }

        Node<T> node = new Node<>();
        node.data = value;
        node.next = first;
        first = node;
    }

    public void addLast(T value) throws Exception {
        if (isEmpty()) {
            addFirst(value);
            return;
        } else if (isNodePresent(value)) {
            throw new Exception("Repeated element");
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
        } else if (isNodePresent(value)) {
            throw new Exception("Repeated element");
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

    public T removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        T data = first.data;
        first = first.next;

        return data;
    }

    public T removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        if (size == 1) {
            return removeFirst();
        } else {
            Node<T> last = getNode(size - 2);
            T data = last.data;
            last.next = null;

            return data;
        }
    }

    public T remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        if ((index < 0) || (index > size - 1)) {
            throw new Exception("Invalid index");
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<T> last = getNode(index - 1);
            Node<T> node = getNode(index);
            T data = node.data;
            last.next = node.next;

            return data;
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

    public void printList() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty list");
        }

        int size = size();
        int i = 0;

        try {
            while (i < size - 1) {
                System.out.print(getNode(i).data + ", ");
                i++;
            }

            System.out.print(getNode(size - 1).data + "\n");

        } catch (Exception errList) {
            System.err.println(errList);
        }
    }
}