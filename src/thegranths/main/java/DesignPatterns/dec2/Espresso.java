package DesignPatterns.dec2;

public class Espresso extends Beverage {
    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.29;
    }
}
