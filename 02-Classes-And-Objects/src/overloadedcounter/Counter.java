package overloadedcounter;

//This is our class
public class Counter {
	// What is our data
	private int count;

	// How do we create one
	public Counter() {
		this.count = 0;
	}

	// How do we create a counter that has starting point
	public Counter(int count) {
		this.count = count;
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

	public String toString() {
		return "count: " + this.count;
	}
}
