package jdp3e.memento.implementation_3;

public class Originator {
    private String state;
    public void setState(String newState) {
        this.state= newState;
    }

    public void restore(Memento memnto) {
        this.state = state;
    }

    public Memento getMemento() {
        return new Memento(state);
    }

    class Memento {
        final String state;

        private Memento(String state) {
            this.state = state;
        }
    }
}
