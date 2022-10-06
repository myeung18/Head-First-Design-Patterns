package aws.parking;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    String address;
    private List<ParkingFloor> parkingfloor;

    public ParkingLot(String address, List<ParkingFloor> parkingfloor) {
        this.address = address;
        this.parkingfloor = parkingfloor;
    }

    public void addFloor(String name, Map<ParkingSpotType, Map<String, ParkingSpot>> allSpot) {
        this.parkingfloor.add( new ParkingFloor(name, allSpot));
    }

    public Ticket getTicket(Vehicle vehicle) {
        ParkingSpot spot = null;
        for (ParkingFloor fl : parkingfloor) {
            spot = fl.parkVehicle(vehicle);
            if (spot == null) break;
        }

        if (spot == null) return null; // not more spot
        Ticket ticket = new Ticket();
        return ticket;
    }

    public double scanAndPay(Ticket ticket) {
        return ticket.parkingSpot.parkingSpotType.getPrice(1000);
    }

}
