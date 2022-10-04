package ch15.sec04.exam01;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//https://velog.io/@ljo_0920/java-%EB%B2%84%EC%A0%84%EB%B3%84-%EC%B0%A8%EC%9D%B4-%ED%8A%B9%EC%A7%95
public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		//저장 put(k,v)
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 85);//키 중복 으로 저장 안됨. 
		                    //value는 동일한 키인 경우 마지막 value로 override됨
		//저장된 entry갯수 출력
		System.out.println(map.size());
		map.remove("신용권");
		
		//키추출
		Set<String> keySet= map.keySet();
		for(String name:keySet) {
			System.out.println(name+":"
		                       +map.get(name));//get(키)->value
		}
		
		//Entry추출
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryItor 
		                                  = entrySet.iterator();
		while(entryItor.hasNext()) {
			Entry<String, Integer> entry = entryItor.next();
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k+":"+v);
		}
		
		//엔트리 삭제
		map.remove("동장군");
		System.out.println(map.size());
		//전체 삭제
		map.clear();
		
		System.out.println(map.isEmpty()?"비었음":"엔트리가 아직 남아있음");

	}
}
