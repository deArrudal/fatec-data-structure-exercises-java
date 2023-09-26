package controller;

import model.Person;
import model.Queue;

public class RideController {
    public RideController() {
        super();
    }

    public void runRide(Queue<Person> queuePerson) {
        if (queuePerson.isEmpty()) {
            System.out.println("empty queue");
            return;
        }

        Person person;
        int i, j; // index.
        String[] situation = { "Denied", "Allowed" };
        String[] reason = { "Age", "Height", "-" };

        while (!queuePerson.isEmpty()) {
            try {
                person = queuePerson.removeValue();

                // check situation.
                if (person.getAgePerson() < 16) {
                    i = 0; // denied.
                    j = 0; // age.

                } else if (person.getHeightPerson() < 1.60) {
                    i = 0; // denied.
                    j = 1; // age.

                } else {
                    i = 1; // allowed.
                    j = 2; // age.
                }

                System.out.printf("Client: %8s\tSituation: %s\tReason: %s\n",
                        person.getNamePerson(), situation[i], reason[j]);

            } catch (Exception errQueue) {
                System.err.println(errQueue);
            }
        }
    }
}
