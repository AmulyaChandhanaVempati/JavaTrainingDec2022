package inClassDay06_12_2022;

public class MethodOverRiding {

	public static void main(String[] args) {
		Shape s = null;
		int noC = 0, noR = 0, noT = 0;
		for (int i = 1; i <= 10; i++) {
			s = ShapesFactory.produceShape();
			System.out.println(s.area());
			if (s instanceof Rectangle)
				noR++;
			else if (s instanceof Circle)
				noC++;
			else
				noT++;
		}
		System.out.println("Circles: " + noC);
		System.out.println("Rectangle: " + noR);
		System.out.println("Triangle: " + noT);
	}

}

abstract class Shape {
	abstract public double area();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length, breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double area() {
		return length * breadth;
	}
}

class Triangle extends Shape {
	private double base, height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double area() {
		return 0.5 * base * height;
	}
}

class ShapesFactory {
	public static Shape produceShape() {
		int n = new java.util.Random().nextInt();
		switch (n % 3) {
		case 0:
			return new Circle(4.5);
		case 1:
			return new Rectangle(5.4, 6.4);
		default:
			return new Triangle(5, 6);
		}
	}
}
