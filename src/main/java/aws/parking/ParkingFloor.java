package aws.parking;

import java.util.Map;

public class ParkingFloor {
    String name;
    Map<ParkingSpotType, Map<String, ParkingSpot>> allSpots;

    public ParkingFloor(String name, Map<ParkingSpotType, Map<String, ParkingSpot>> allSpots) {
        this.name = name;
        this.allSpots = allSpots;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpotType type = pickParkingSpotType(vehicle.vehicleType);

        ParkingSpot spot = null;
        var availableSpot = allSpots.get(type);
        for (var ent : availableSpot.entrySet()) {
            if (ent.getValue().isAvailable) {
                ent.getValue().addVehicle(vehicle);
                spot = ent.getValue();
                break;
            }
        }
        return spot;
    }

    private ParkingSpotType pickParkingSpotType(VehicleType vehicleType) {
        if (vehicleType == VehicleType.Compact) {
            return ParkingSpotType.Compact;
        }
        if (vehicleType == VehicleType.Large) {
            return ParkingSpotType.Large;
        }

        return null;
    }
}
