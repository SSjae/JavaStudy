package day07;

public class Point2 {
	int x, y;
	
	public Point2() {}
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
