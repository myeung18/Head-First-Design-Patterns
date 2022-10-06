package DesignPatterns.state;

public class NoQuarterState implements State {
    private GameStation gs;

    public NoQuarterState(GameStation gs) {
        this.gs = gs;
    }

    @Override
    public void insertquarter() {
        gs.setState(gs.getSoldOutState());

    }

    @Override
    public void ejectQuarter() {


    }

    @Override
    public void dispense() {

    }
}
