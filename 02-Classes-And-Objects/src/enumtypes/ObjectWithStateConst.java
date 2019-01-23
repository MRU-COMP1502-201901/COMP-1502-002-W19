package enumtypes;

public class ObjectWithStateConst {
	private int state;
	public static final int OFF = 0;
	public static final int LO = 1;
	public static final int MED = 2;
	public static final int HI = 3;

	public ObjectWithStateConst() {
		this.state = OFF;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

}

