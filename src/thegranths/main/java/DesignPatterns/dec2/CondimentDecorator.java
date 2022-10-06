package DesignPatterns.dec2;

public class CondimentDecorator extends Beverage {
    Beverage beverage;
    public CondimentDecorator() {
    }

    @Override
    public double getCost() {
        return 0;
    }
}
