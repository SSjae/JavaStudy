package day11;

public class strTest {
	public static void main(String[] args) {
		// split : ","�� �������� ������ �迭�� ��ȯ�Ѵ�.
		// "���ڿ�1".split("���ڿ�2") : "���ڿ�1"�� "���ڿ�2" �������� ������(���ڿ� �迭)
		String animals = "dog,cat,pig";
		
		String[] arr = animals.split(",");
		System.out.println(arr[1]);
		String ip = "192.168.0.1";
		// .,/ ���� ���ڿ��� �ƴ� ���� �� ����(���Խ�)�� �ν��ϱ� ������ [.]�� ���༭ ���ڿ��̶�� ���� ��Ÿ����� �Ѵ�.
		System.out.println(ip.split("[.]")[2]);
		
		
		// join : ������ �ִ� �迭�� "-" �̰����� ���ļ� �ϳ��� ���ڿ��� �����.
		// String.join("���ڿ�", ���ڿ��迭) : �迭�� �ִ� ���ڿ����� "���ڿ�"�� �����ؼ� �ϳ��� ���ڿ��� ������ֱ�(���ڿ�)
		String result = String.join("-", arr);
		System.out.println(result);
		
		
		// indexOf : ���ڿ����� ������ ���ڰ� �ε����� �������� ��ȯ
		// "���ڿ�".indexOf("���ڿ�2") : "���ڿ�1"���� "���ڿ�2"�� ã�Ƽ� �ε����� ��ȯ(int)
		String msg = "Hello Java!";
		int idx = msg.indexOf("J");
		System.out.println(idx);
		idx = msg.indexOf("l"); 
		System.out.println(idx); // �ߺ��̸� ���� �տ� ������ ���� ��ȯ
		idx = msg.indexOf("P");
		System.out.println(idx); // ���� ��쿡�� -1�� ��ȯ
		idx = msg.indexOf("Java");
		System.out.println(idx); // ���ڿ��̱� ������ ���� ���ڵ� �ѱ�� ����, ���ڿ��� ���۵Ǵ� �ε����� ��ȯ
		
		
		// charAt
		// "���ڿ�".charAt(n) : "���ڿ�"�� n��° ���ڸ� ����(char)
		char ch = msg.charAt(6);
		System.out.println(ch);
		
		
		// toUpperCase : �빮�ڷ� ��ȯ
		// toLowerCase : �ҹ��ڷ� ��ȯ
		// "���ڿ�".toUpperCase() : "���ڿ�"�� �ҹ��ڸ� ���� �빮�ڷ� �ٲپ ����(String)
		// "���ڿ�".toLowerCase() : "���ڿ�"�� �빮�ڸ� ���� �ҹ��ڷ� �ٲپ ����(String)
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg); // ������ ���� �ٲ��� �ʴ´�.
		
		
		// subString
		// "���ڿ�".subString(n) : n��° ���ں��� ������ �߶� ����(String)
		System.out.println(msg.substring(6));
		// "���ڿ�".subString(n, m) : n��° ���ں��� (m-1)���� �߶� ����(String)
		System.out.println(msg.substring(0, 5));
		
		
		// valueOf : �ٸ� ������ �ָ� ���ڿ��� ��ȯ
		// String.valueOf(��) : �ش� ���� ���ڿ� Ÿ������ ��ȯ
		// ���� ��ü�̸� ��ü.toString���� ���� �ȴ�.
		int data = 10;
		String str = String.valueOf(data); // "10"���� ��ȯ
		str = data + ""; // "10" �ڵ� ����ȯ
		System.out.println(str);
		
		
		// Intergar.parseInt : ���ڿ� -> ����
		// Intergar.parseInt("������ �� ���ڿ�") : ��°�� �������·� ����ȯ(int)
		// Double.parseDouble(str);, Boolean.parseBoolean(str); ....
		System.out.println(Integer.parseInt(str) + 5);
	}
}
