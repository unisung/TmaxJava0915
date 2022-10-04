package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//저장 put(k,v)
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 85);//키 중복 으로 저장 안됨. 
		                    //value는 동일한 키인 경우 마지막 value로 override됨
		//저장된 entry갯수 출력
		System.out.println(map.size());
		Set<String> keySet= map.keySet();
		for(String name:keySet) {
			System.out.println(name+":"+map.get(name));
		}
		

	}

}
