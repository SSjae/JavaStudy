package day13;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		System.out.println("정렬 전 : " + Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println("기본 정렬 후 : " + Arrays.toString(strArr));
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분하지 않고 비교
		System.out.println("대소문자 구분하지 않은 정렬 후 : " + Arrays.toString(strArr));
		
		// 역순정렬
		Arrays.sort(strArr, new Descending());
		System.out.println("역순정렬 후 : " + Arrays.toString(strArr));
	}
}

// compare(a, b) : 새로 들어온 a,b를 비교
// a.compareTo(b) : a와 새로 들어온 b를 비교
// a가 작으면 음수, 같으면 0, a가 크면 양수

class Descending implements Comparator{ // 순서정렬을 재정의 할 때 사용하는 인터페이스
	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}
