package day13;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdfg", "1234");
		// put(Object key, Object value) : map에 key, value entry를 추가.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			String id = s.nextLine().trim(); // trim() : 좌우공백제거
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) { // 입력한 id가 map의 key 중 일치하는 값이 없다면
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else {
				if(!map.get(id).equals(password)) {
					// get(Object key) : key에 상응하는 value값을 반환한다.
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
}
