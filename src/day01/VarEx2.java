package day01;

public class VarEx2 {
	public static void main(String[] args) {
		char ch = 'A'; // 문자를 표현할 때는 ' '를 사용
		String str = "자바"; // 문자열을 표현할 때는 " "를 사용
		int age = 20; 
		int year = 2021;
		long result = 10L;
		float result2 = 10.1F;
		double d = 3.14;
		
		System.out.println(ch); // 변수명 자체만으로도 출력 가능
		System.out.println("ch : " + ch);
		System.out.println("나는 " + age + "살이 되고 싶네요.");
		System.out.println(age + year);
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("d : " + d);
	}
}
