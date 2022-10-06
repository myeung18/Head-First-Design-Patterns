package DesignPatterns.Decorator;

public abstract class IngredientDecorator extends Beverage {
    Beverage beverage;
    abstract String getBeverageName();
}
