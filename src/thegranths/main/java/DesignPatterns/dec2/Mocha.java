package DesignPatterns.dec2;

public class Mocha extends CondimentDecorator {
    @Override
    public double getCost() {
        return beverage.getCost() + .33;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " with Mocha ";
    }
}
