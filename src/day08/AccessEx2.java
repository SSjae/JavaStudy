package day08;

public class AccessEx2 extends Access{
	void method() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		// System.out.println(defaultVar);
		// default�� ��Ű�� �޶����� ����
		// System.out.println(privateVar);
		// private�� ���� Ŭ���������� ���� ����.
	}
}

class AccessEx3 {
	Access ac = new Access();
	int num = ac.publicVar;
	// �ƿ� ��ӵ� �ƴϰ� �ٸ� ���� public�� ��
}
