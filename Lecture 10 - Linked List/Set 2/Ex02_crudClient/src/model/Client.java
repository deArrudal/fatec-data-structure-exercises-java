package model;

public class Client {
    public String cpf;
    public String name;
    public int age;
    public double limitCredit;
    
    public Client(String cpf, String name, int age, double limitCredit) {
        this.cpf = cpf;
        this.name = name;
        this.age = age;
        this.limitCredit = limitCredit;
    }

}