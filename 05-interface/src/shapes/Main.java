package shapes;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List list = new List();
		list.add("item1");
		list.add("item2");
		Triangle tri = new Triangle(new Point(0,0), new Point(0,4), new Point(5,0));
		Circle circle = new Circle(new Point(0,0), 5);
		ArrayList<Drawable> draw = new ArrayList<>();
		draw.add(list);
		draw.add(tri);
		draw.add(circle);
		System.out.println("Drawables: Draw");
		for(Drawable d: draw) {
			d.draw();
		}
		System.out.println("");
		System.out.println("Shapes: Draw and area");
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(tri);
		shapes.add(circle);
		for(Shape s: shapes) {
			s.draw();
			System.out.println(s.getArea());
		}
	}

}
