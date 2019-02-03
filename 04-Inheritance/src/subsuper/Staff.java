package subsuper;

public class Staff extends Person {
	private Staff boss;
	public Staff(String name, int id, Staff boss) {
		super(name, id);
		this.boss = boss;
	}

	@Override
	public String printVersion() {
		return String.format("%s Boss->%s", super.printVersion(), boss);
	}
}
