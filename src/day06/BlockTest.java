package day06;

public class BlockTest {
	
	static int[] arr = new int[10];
	
	// ������
	BlockTest() {
		System.out.println("�������Դϴ�.");
	}
	
	// �ν��Ͻ� �ʱ�ȭ ���
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ����Դϴ�.");
	}
	
	// static �ʱ�ȭ ���( Ŭ���� �ʱ�ȭ ��� )
	static {
		System.out.println("Ŭ���� �ʱ�ȭ ����Դϴ�.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("ù ���� �ν��Ͻ� �����Դϴ�.");
		BlockTest bt = new BlockTest();
		
		System.out.println("�� ���� �ν��Ͻ� �����Դϴ�.");
		BlockTest bt2 = new BlockTest();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
