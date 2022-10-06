package aws.parking;

public enum ParkingSpotType {
    TwoWheeler{
        double getPrice(long duration) {return duration * 0.05;}
    }, Compact{
        double getPrice(long duration) {return duration * 0.075;}
    }, Medium{
        double getPrice(long duration) {return duration * 0.09;}
    }, Large{
        double getPrice(long duration) {return duration * 0.15;}
    };


    ParkingSpotType() {
    }

    abstract double getPrice(long duration);
}
