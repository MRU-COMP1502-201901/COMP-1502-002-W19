package shapes;

import java.util.ArrayList;

public abstract class Shape implements Drawable {
	protected ArrayList<Point> points = new ArrayList<>();

	public abstract double getArea();
}
