package basiccounter;
//This is our class
public class Counter {
	// What is our data
	private int count;

	// How do we create one
	public Counter() {
		this.count = 0;
	}

	// We need to access data
	public int getCount() {
		return this.count;
	}

	// We need to change data
	// 1. Counting
	public void count() {
		this.count++;
	}

	// 2.Reset
	public void reset() {
		this.count = 0;
	}
}
