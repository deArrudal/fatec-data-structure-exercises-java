package model;

public class Account {
    int id;
    String name;
    Double amount;

    public Account(int id, String name, Double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + amount + "]";
    }

    public int getId() {
        return id;
    }

}
