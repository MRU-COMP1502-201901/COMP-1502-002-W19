package shapes;

public class Circle extends Shape {
	private double r;

	public Circle(Point centre, double r) {
		points.add(centre);
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("\u25CB");
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

}
