package day15;

public class ThreadEx3 {
	public static void main(String[] args) {
		// �̱۾����� �ҿ�ð� Ȯ��
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("�ҿ�ð� : " + ( System.currentTimeMillis() - startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("�ҿ�ð� : " + ( System.currentTimeMillis() - startTime));
	}
}
