package controller;

import linkedlist.model.LinkedList;
import model.Apartment;

public class BuildingManager {

    LinkedList<Apartment>[] apartmentFloor;

    public BuildingManager(int size) {
        apartmentFloor = new LinkedList[size];
        initFloor(size);
    }

    private void initFloor(int size) {
        for (int i = 0; i < size; i++) {
            apartmentFloor[i] = new LinkedList<>();
        }
    }

    private int hashID(int apartmentId) {
        return apartmentId / 100;
    }

    public void addResident(Apartment apartment) {
        try {
            int floorId = hashID(apartment.getApartmentId());
            apartmentFloor[floorId].addLast(apartment);
        } catch (Exception errAdd) {
            System.err.println(errAdd);
        }
    }

    public void findResident(int apartmentID) {
        try {
            int floorId = hashID(apartmentID);
            int numberApartments = apartmentFloor[floorId].size();
            for (int i = 0; i < numberApartments; i++) {
                if (apartmentFloor[floorId].get(i).getApartmentId() == apartmentID) {
                    System.out.println(apartmentFloor[floorId].get(i).toString());
                    return;
                }
            }
            System.out.println("Apartment Id not found");
        } catch (Exception errFind) {
            System.out.println(errFind);
        }
    }

    public void removeResident(int apartmentID) {
        try {
            int floorId = hashID(apartmentID);
            int numberApartments = apartmentFloor[floorId].size();
            for (int i = 0; i < numberApartments; i++) {
                if (apartmentFloor[floorId].get(i).getApartmentId() == apartmentID) {
                    apartmentFloor[floorId].remove(i);
                    return;
                }
            }
            System.out.println("Apartment Id not found");
        } catch (Exception errRemove) {
            System.out.println(errRemove);
        }
    }

    public void printFloor(int floor) {
        try {
            apartmentFloor[floor].printList();
        } catch (Exception errDisplay) {
            System.err.println(errDisplay);
        }
    }
}