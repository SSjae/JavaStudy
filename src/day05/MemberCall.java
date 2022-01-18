package day05;

public class MemberCall {
	int iv = 10;	// �ν��Ͻ� ����
	static int cv = 20; // Ŭ���� ����
	
	//static int cv2 = iv;
	// ����. Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����.
	// Ŭ���� ������ �޸𸮿� �ö� �� �ν��Ͻ������� ������ �� �Ǿ� ���� �� �ִ�.
	
	static int cv2 = new MemberCall().iv;	// ��ü�� �����ϸ� ��� ����
	int iv2 = cv;
	
	static void staticMethod() { // Ŭ���� �޼ҵ�
		System.out.println("cv : " + cv);
		// System.out.println("iV : " + iv); ����. Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ����� �� ����.
		// ��ü ���� �� ����
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod() {	// �ν��Ͻ� �޼ҵ�
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
		//instanceMethod();		����, Ŭ���� �޼ҵ忡 �ν��Ͻ� �޼ҵ� ��� �Ұ�
		// ��ü ���� �� ����
		MemberCall c = new MemberCall();
		c.instanceMethod();
		new MemberCall().instanceMethod();
	}
	
	void instanceMethod2() { // �ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��� ����.
		staticMethod();
		instanceMethod();
	}
}
