package day03;

public class FlowEx1 {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("x = " + x + " �� �� ���ΰ��� ?");
		
		if ( x == 0 ) { // �� ( true )
			System.out.println("x == 0");
		}
		
		if ( x != 0 ) { // ���� ( false )
			System.out.println("x != 0");
		}
		
		if ( !( x == 0 ) ) { // ���� ( false )
			System.out.println("!( x == 0 )");
		}
		
		if ( !( x != 0 ) ) { // �� ( true )
			System.out.println("!( x != 0 )");
		}
	}
}
