package over;

import java.util.ArrayList;

public class Faculty extends Person {
	
	private ArrayList<Session> lectures;
	
	@Override
	public String printVersion() {
		return String.format("%s %s", super.printVersion(), lectures);
	}
}

