package day10;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
		// �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ��� ( �ν��Ͻ�����, Ŭ�������� ) ������ �����ϴ�.
	}
	
	static class StaticInner {
		// staticŬ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	class Parent{}
	Parent p = null;
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner extends Parent {
			int liv = outerIv; // final int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
			/*
			 * ����Ŭ����(����Ŭ����)������ ����� ����� �����ϴ�.
			 * ���������� �ݴ� �߰�ȣ�� ������ �޸𸮿��� �����ȴ�.
			 * �׷���, ����Ŭ������ ��ü(�ν��Ͻ�)�� �޼ҵ尡 ������ ������ �����ϴ�.
			 */
		}
		LocalInner li = new LocalInner();
		p = li;
	}
}