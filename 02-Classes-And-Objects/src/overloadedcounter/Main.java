package overloadedcounter;

public class Main {
	public static void main(String[] args) {
		//Make a tally counter that starts at 10
		Counter tally = new Counter(10);		
		System.out.println("Count: " +tally.getCount());
		
		//Count once
		tally.count();		
		System.out.println("Count: " +tally.getCount());
		
		//Count again to two
		tally.count();		
		System.out.println("Count: " +tally.getCount());
		
		//Reset counter
		tally.reset();		
		System.out.println("Count: " +tally.getCount());
		
		//Print tally
		System.out.println("My Object is -> "+tally);
	}
}
