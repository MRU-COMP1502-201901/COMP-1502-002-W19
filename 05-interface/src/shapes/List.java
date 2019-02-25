package shapes;

import java.util.ArrayList;

public class List implements Drawable {

	private ArrayList<String> items;

	public List() {
		items = new ArrayList<>();
	}

	public void add(String item) {
		items.add(item);
	}

	@Override
	public void draw() {
		System.out.println("LIST");
		System.out.println("----");
		for (String item : items) {
			System.out.println(item);
		}
	}

}
