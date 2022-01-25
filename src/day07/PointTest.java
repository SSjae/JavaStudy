package day07;

public class PointTest {
	public static void main(String[] args) {
		Point3D point3d = new Point3D(1, 2, 3);
		System.out.println(point3d.getLocation());
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y); // �θ��� ������ ȣ��
		this.z = z;
	}
	
	@Override
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
