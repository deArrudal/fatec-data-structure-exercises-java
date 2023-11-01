package model;

public class Product {
    int floor;
    String name;
    String description;

    public Product(int floor, String name, String description) {
        this.floor = floor;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[floor:" + floor + ", " + name + ", " + description + "]";
    }

    public String getName() {
        return name;
    }

}
