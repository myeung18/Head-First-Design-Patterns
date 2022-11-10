package lang.interf;

/**
 * https://www.baeldung.com/java-static-default-methods
 */
public interface Vehicle {
    String getBrand();

    default  String trunAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
}

