package day05;

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 20;
		System.out.println("main() : " + d.x); // 20
		System.out.println("main()에서의 d주소 : " + d);
		change(d);
		System.out.println("main() : " + d.x); // 30
		
		int[] ar = new int[4]; // 0, 0, 0, 0
		plusOne(ar);
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	static void change(Data d1) { // Data d1 = d;
		System.out.println("change()에서의 d1주소 : " + d1);
		d1.x = 30;
		System.out.println("change() : " + d1.x); // 30
	}
	
	static void plusOne(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
	}
}
