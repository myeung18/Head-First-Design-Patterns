package DesignPatterns.state;

public class GameStation {

    State soldOutState;
    State noQuarterState;

    State currState;
    int cnt = 0;

    public GameStation(int number) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);

        currState = noQuarterState;
    }

    public void setState(State currState) {
        this.currState = currState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }
}
