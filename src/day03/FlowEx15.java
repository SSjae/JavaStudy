package day03;

public class FlowEx15 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			// 누적합 ( sum )이 100을 넘으면 반복문 종료
			if ( sum > 100) {
				break;
			}
			
			i++;
			sum += i;
		}
		
		System.out.println("최종 i값 : " + i);
		System.out.println("최종 sum값 : " + sum);
	}
}
