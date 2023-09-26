package model;

public class Person {
    private String namePerson;
    private int agePerson;
    private double heightPerson;

    public Person(String namePerson, int agePerson, double heightPerson) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.heightPerson = heightPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public double getHeightPerson() {
        return heightPerson;
    }
}
