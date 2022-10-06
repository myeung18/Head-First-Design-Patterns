package DesignPatterns.dec2;

public abstract class Beverage {
    String desc = "unnamed";

    public String getDesc() {
        return desc;
    }

    public abstract double getCost();
}
