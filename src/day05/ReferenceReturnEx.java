package day05;

public class ReferenceReturnEx {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		Data data2 = copy(data);
		System.out.println("data.x : " + data.x); // 10
		System.out.println("data2.x : " + data2.x); // 10
		
		System.out.println(data);
		System.out.println(data2);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}