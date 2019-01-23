package enumtypes;

public class Main {
	public static void main(String[] args) {
		//First let us use an object with an integer state
		ObjectWithState s0 = new ObjectWithState();
		System.out.println(s0.getState());
		s0.setState(1);
		System.out.println(s0.getState());
		
		//Now let us use an object with state based on constants
		ObjectWithStateConst s1 = new ObjectWithStateConst();
		System.out.println(s1.getState());
		s1.setState(ObjectWithStateConst.HI);
		System.out.println(s1.getState());
		
		//Now let us use an object with state based on enum
		ObjectWithStateEnum s2 = new ObjectWithStateEnum();
		System.out.println(s2.getState());
		System.out.println(s2.getState().ordinal());
		s2.setState(State.HI);
		System.out.println(s2.getState());
		System.out.println(s2.getState().ordinal());
		
	}

}
