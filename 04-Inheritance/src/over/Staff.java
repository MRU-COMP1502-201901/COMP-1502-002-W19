package over;

public class Staff extends Person {
	private Staff boss;

	@Override
	public String printVersion() {
		return String.format("%s %s", super.printVersion(), boss);
	}
}
