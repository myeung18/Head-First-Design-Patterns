package jdp3e.memento.implementation_1;


/**
 * This is the originator class. As per GoF: 1. It creates a memento that contains
 * a snapshot of its current internal state. 2. It uses a memento to restore its
 * internal state.
 */
  public class Originator {
	private String state;

	// Setting a new internal state
	public void setState(String newState) {
		this.state = newState;
		System.out.print("The current state is " + state);
	}

	// Back to an old state (Restore)
	public void restore(Memento memento) {
		//The following line is ok due to package-private visibility
		this.state = memento.state;
		System.out.println("Restored to state: " + state);
	}
	
	// Originator (which contains its current state) 
	// will supply the memento in response to the
	// caretaker's request.	 
	public Memento getMemento() {

		Memento currentMemento = new Memento(state);
		return currentMemento;
	}
}