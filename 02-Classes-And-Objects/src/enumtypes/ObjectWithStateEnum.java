package enumtypes;

public class ObjectWithStateEnum {
	private State state;

	public ObjectWithStateEnum() {
		this.state = State.OFF;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}
}


