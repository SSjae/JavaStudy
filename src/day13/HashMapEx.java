package day13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		// put(Object key, Object value) : map에 key, value entry를 추가.
		map.put("1", "11");
		map.put("2", "22");
		map.put("3", "33");
		map.put("4", "44");
		
		// get(Object key) : key에 상응하는 value값 반환
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		System.out.println(map.get("4"));
		System.out.println();
		
		// containsKey(Object key) : map의 key중 일치하는 것이 있는지 알려줌
		System.out.println(map.containsKey("1"));
		System.out.println(map.containsKey("11"));
		System.out.println();
		
		// entrySet() : entry를 통째로 set으로 변경
		Set set1 = map.entrySet();
		System.out.println(set1);
		System.out.println();
		
		// keySet() : key값을 set으로 변경 
		Set set2 = map.keySet(); // key값은 어차피 중복이 안되니깐 Set가능
		System.out.println(set2);
		System.out.println();
		
		// values() : value값 반환
		Collection values = map.values(); // value값은 중복이 되도 상관없으므로 Set으로 하면 안됨
		System.out.println(values);
	}
}