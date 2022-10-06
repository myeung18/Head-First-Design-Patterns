package aws.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingMain {
    public static void main(String[] args) {
        Map<String, ParkingSpot> comSlot = new HashMap<>();
        comSlot.put("A1", new ParkingSpot("A1", ParkingSpotType.Compact));
        comSlot.put("A2", new ParkingSpot("A2", ParkingSpotType.Compact));

        Map<String, ParkingSpot> largeSlot = new HashMap<>();

        Map<ParkingSpotType, Map<String, ParkingSpot>> allSpots = new HashMap<>();
        allSpots.put(ParkingSpotType.Compact, comSlot);
        allSpots.put(ParkingSpotType.Large, largeSlot);



    }
}
