package view;

import java.util.Random;

import controller.RideController;
import model.Person;
import model.Queue;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        RideController methods = new RideController();
        Queue<Person> queuePerson = new Queue<>();

        String namePerson;
        int agePerson;
        double heightPerson;

        for (int i = 1; i < 31; i++) {
            namePerson = "Person" + i;
            agePerson = rand.nextInt(40 - 10) + 10;
            heightPerson = rand.nextDouble() * 0.65 + 1.35;

            queuePerson.insertValue(new Person(namePerson, agePerson, heightPerson));
        }

        methods.runRide(queuePerson);
    }
}
