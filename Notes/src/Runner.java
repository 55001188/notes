
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	

}


class Circle extends Ellipse {
	
	public Circle (double rad) {
		super(rad, rad);
	}
	
}

class Ellipse extends Shape {
	
	public Ellipse (double height, double width) {
		h = height;
		w = width;
		area = h*w*Math.PI;
	}
	
}


class Square extends Rectangle {
	
	public Square (double length) {
		super(length, length); //parent constructor
	}
}

class Rectangle extends Shape {
	
	public Rectangle (double height, double width) {
		super();
		h = height;
		w = width;
	}
}


class Triangle extends Shape {
	private String type;
	public Triangle () {
		super();
		type = "isoceles";
		area = 1/2 * (w*h);
	}
}

class Shape {
	protected double area;
	protected double h, w;
	
	public Shape () {
		h = 2;
		w = 2;
		area = h*w;
	}

	public double getArea() {
		return area;
	}
	
}