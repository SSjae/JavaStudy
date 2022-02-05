package day13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();

		// put(Object key, Object value) : map�� key, value entry�� �߰�.
		map.put("1", "11");
		map.put("2", "22");
		map.put("3", "33");
		map.put("4", "44");
		
		// get(Object key) : key�� �����ϴ� value�� ��ȯ
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
		System.out.println(map.get("3"));
		System.out.println(map.get("4"));
		System.out.println();
		
		// containsKey(Object key) : map�� key�� ��ġ�ϴ� ���� �ִ��� �˷���
		System.out.println(map.containsKey("1"));
		System.out.println(map.containsKey("11"));
		System.out.println();
		
		// entrySet() : entry�� ��°�� set���� ����
		Set set1 = map.entrySet();
		System.out.println(set1);
		System.out.println();
		
		// keySet() : key���� set���� ���� 
		Set set2 = map.keySet(); // key���� ������ �ߺ��� �ȵǴϱ� Set����
		System.out.println(set2);
		System.out.println();
		
		// values() : value�� ��ȯ
		Collection values = map.values(); // value���� �ߺ��� �ǵ� ��������Ƿ� Set���� �ϸ� �ȵ�
		System.out.println(values);
	}
}