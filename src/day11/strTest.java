package day11;

public class strTest {
	public static void main(String[] args) {
		// split : ","을 기준으로 나눠서 배열로 반환한다.
		// "문자열1".split("문자열2") : "문자열1"을 "문자열2" 기준으로 나누기(문자열 배열)
		String animals = "dog,cat,pig";
		
		String[] arr = animals.split(",");
		System.out.println(arr[1]);
		String ip = "192.168.0.1";
		// .,/ 등은 문자열이 아닌 식의 한 종류(정규식)로 인식하기 떄문에 [.]로 해줘서 문자열이라는 것을 나타내줘야 한다.
		System.out.println(ip.split("[.]")[2]);
		
		
		// join : 나눠져 있는 배열을 "-" 이것으로 합쳐서 하나의 문자열로 만든다.
		// String.join("문자열", 문자열배열) : 배열에 있는 문자열들을 "문자열"로 연결해서 하나의 문자열로 만들어주기(문자열)
		String result = String.join("-", arr);
		System.out.println(result);
		
		
		// indexOf : 문자열에서 설정한 문자가 인덱스가 몇인지를 반환
		// "문자열".indexOf("문자열2") : "문자열1"에서 "문자열2"를 찾아서 인덱스를 반환(int)
		String msg = "Hello Java!";
		int idx = msg.indexOf("J");
		System.out.println(idx);
		idx = msg.indexOf("l"); 
		System.out.println(idx); // 중복이면 먼저 앞에 나오는 것이 반환
		idx = msg.indexOf("P");
		System.out.println(idx); // 없는 경우에는 -1로 반환
		idx = msg.indexOf("Java");
		System.out.println(idx); // 문자열이기 떄문에 여러 글자도 넘길수 있음, 문자열이 시작되는 인덱스가 반환
		
		
		// charAt
		// "문자열".charAt(n) : "문자열"의 n번째 글자를 리턴(char)
		char ch = msg.charAt(6);
		System.out.println(ch);
		
		
		// toUpperCase : 대문자로 변환
		// toLowerCase : 소문자로 변환
		// "문자열".toUpperCase() : "문자열"의 소문자를 전부 대문자로 바꾸어서 리턴(String)
		// "문자열".toLowerCase() : "문자열"의 대문자를 전부 소문자로 바꾸어서 리턴(String)
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg); // 실제의 값은 바뀌지 않는다.
		
		
		// subString
		// "문자열".subString(n) : n번째 글자부터 끝까지 잘라서 리턴(String)
		System.out.println(msg.substring(6));
		// "문자열".subString(n, m) : n번째 글자부터 (m-1)까지 잘라서 리턴(String)
		System.out.println(msg.substring(0, 5));
		
		
		// valueOf : 다른 형식인 애를 문자열로 변환
		// String.valueOf(값) : 해당 값을 문자열 타입으로 변환
		// 값이 객체이면 객체.toString으로 들어가게 된다.
		int data = 10;
		String str = String.valueOf(data); // "10"으로 변환
		str = data + ""; // "10" 자동 형변환
		System.out.println(str);
		
		
		// Intergar.parseInt : 문자열 -> 정수
		// Intergar.parseInt("정수로 된 문자열") : 통째로 정수형태로 형변환(int)
		// Double.parseDouble(str);, Boolean.parseBoolean(str); ....
		System.out.println(Integer.parseInt(str) + 5);
	}
}
