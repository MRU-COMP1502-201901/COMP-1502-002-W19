package shapes;

public class Triangle extends Shape {

	public Triangle(Point p1, Point p2, Point p3) {
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}

	@Override
	public void draw() {
		System.out.println("\u25B3");
	}

	@Override
	public double getArea() {
		Point p1 = points.get(0);
		Point p2 = points.get(1);
		Point p3 = points.get(2);
		return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0);
	}

}
