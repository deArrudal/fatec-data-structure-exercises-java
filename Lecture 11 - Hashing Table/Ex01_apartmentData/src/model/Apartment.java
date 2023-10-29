package model;

public class Apartment {
    int apartmentId;
    String residentName;
    String carModel;
    String carColor;
    String carLicensePlate;

    public Apartment(int apartmentId, String residentName, String carModel, String carColor, String carLicensePlate) {
        this.apartmentId = apartmentId;
        this.residentName = residentName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carLicensePlate = carLicensePlate;
    }

    @Override
    public String toString() {
        return "[Id=" + apartmentId + ", Resident=" + residentName + ", Car={" + carModel
                + ", " + carColor + ", " + carLicensePlate + "}]";
    }

    public int getApartmentId() {
        return apartmentId;
    }
}
