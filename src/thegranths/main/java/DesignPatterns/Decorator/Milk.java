package DesignPatterns.Decorator;
//
public class Milk extends IngredientDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getBeverageName() {
        return beverage.getBeverageName() + " with Milk ";
    }

    @Override
    int getBeveragePrice() {
        return beverage.getBeveragePrice() + 2;
    }
}
