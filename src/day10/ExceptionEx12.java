package day10;

public class ExceptionEx12 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�.
	}
	
	static void copyFiles() {
		// ���ϵ��� �����ϴ� �ڵ带 ���´�.
	}
	
	static void deleteTempFiles() {
		// �ӽ����ϵ��� �����ϴ� �ڵ带 ���´�.
	}
}
