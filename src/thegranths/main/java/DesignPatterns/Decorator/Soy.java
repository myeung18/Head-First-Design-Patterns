package DesignPatterns.Decorator;

public class Soy extends IngredientDecorator{
    public Soy(Beverage b ) {
        this.beverage = b;
    }

    @Override
    int getBeveragePrice() {
        return 0;
    }

    @Override
    String getBeverageName() {
        return this.beverage.getBeverageName()  + " with soy";
    }
}
