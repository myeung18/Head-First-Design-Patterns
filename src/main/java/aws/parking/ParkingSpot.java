package aws.parking;

public class ParkingSpot {
    String name;
    boolean isAvailable = true;
    ParkingSpotType parkingSpotType;

    Vehicle vehicle; //parked here

    public ParkingSpot(String name, ParkingSpotType parkingSpotType) {
        this.name = name;
        this.parkingSpotType = parkingSpotType;
    }

    void addVehicle(Vehicle vehicle) {
    }

    void removeVehicle() {
        this.vehicle = null;
    }
}
