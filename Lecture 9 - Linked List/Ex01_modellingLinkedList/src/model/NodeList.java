package model;

public class NodeList<T> {
    T data;
    NodeList<T> next;

    @Override
    public String toString() {
        return (String) data;
    }
}
