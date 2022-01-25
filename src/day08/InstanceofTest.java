package day08;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		// instanceof�� �̿��� �������� true�� ����ٴ� ����
		// ���������� �˻��� Ÿ������ ����ȯ�� �����ϴٴ� ���� ���Ѵ�.
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance");
			Car car = (Car) fe;
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instance");
			Object obj = (Object) fe;
		}
	}
}
