package DesignPatterns.state;

public class SoldOutState implements State {
    private GameStation gs;

    public SoldOutState(GameStation gs) {
        this.gs = gs;
    }

    @Override
    public void insertquarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void dispense() {

    }
}
