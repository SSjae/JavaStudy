package day07;

public class DrawShape {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(150, 150), 50);
		
		Point[] p = {
				new Point(100, 100),
				new Point(140, 50),
				new Point(200, 100)
		};
		Triangle t = new Triangle(p);
		
		c.draw();
		t.draw();
	}
}

class Shape {
	String color = "black";
	
	void draw() {
		System.out.println("[color = " + color + "]");
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXy() {
		return "("+x+","+y+")"; // Ex. (1,2)
	}
}

class Circle extends Shape {
	Point center; // ÁÂÇ¥
	int r; // ¹ÝÁö¸§
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	Circle() {
		this(new Point(0,0), 100);
	}
	
	@Override
	void draw() {
		System.out.printf("[center = (%d,%d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	@Override
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n", p[0].getXy(), p[1].getXy(), p[2].getXy(), color);
	}
}
