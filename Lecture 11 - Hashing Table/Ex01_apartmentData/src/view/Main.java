package view;

import controller.BuildingManager;
import java.util.Scanner;
import model.Apartment;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Assume that the ground floor can have apartments. (Ex: 012)
        int numberFloor = 10;
        BuildingManager method = new BuildingManager(numberFloor + 1);

        String prompt = "+++Building Manager+++\n" +
                "1.Add new resident\n2.Find resident\n3.Remove resident\n" +
                "4.Display floor\'s info\n9.Quit\nEnter option: ";
        String option;

        Apartment apartment;
        int apartmentID;
        int floor;

        do {
            System.out.print(prompt);
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    apartment = readApartment();
                    method.addResident(apartment);
                    break;
                case "2":
                    apartmentID = readApartmentId();
                    method.findResident(apartmentID);
                    break;
                case "3":
                    apartmentID = readApartmentId();
                    method.removeResident(apartmentID);
                    break;
                case "4":
                    floor = readFloor();
                    method.printFloor(floor);
                    break;
                case "9":
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!option.equals("9"));

        scanner.close();
    }

    public static Apartment readApartment() {
        System.out.print("Enter Apartment's Id: ");
        int apartmentId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Resident's name: ");
        String residentName = scanner.nextLine();
        System.out.print("Enter Car's model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter Car's color: ");
        String carColor = scanner.nextLine();
        System.out.print("Enter Car's license plate: ");
        String carLicensePlate = scanner.nextLine();

        return new Apartment(apartmentId, residentName, carModel, carColor, carLicensePlate);
    }

    public static int readApartmentId() {
        System.out.print("Enter Apartment's Id: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int readFloor() {
        System.out.print("Enter floor: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
