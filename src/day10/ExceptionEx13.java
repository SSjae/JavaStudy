package day10;

public class ExceptionEx13 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
//			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
//			deleteTempFiles();
		} finally {
			// ���ܰ� �߻��ϵ� ���� ������ �߻�
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
