package ch15.sec05.exam01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		//엔트리 저정
	treeMap.put("apple", 10);//autoboxing
	treeMap.put("forever", 60);
	treeMap.put("description", 40);
	treeMap.put("ever", 50);
	treeMap.put("zoo", 80);
	treeMap.put("base", 20);
	treeMap.put("guess", 70);
	treeMap.put("cherry", 30);//Ctrl + Atl + 아래쪽 화살표 
	
	//정렬된 엔트리 가져오기
	Set<Entry<String,Integer>> entrySet = treeMap.entrySet();
	for(Entry<String,Integer> entry:entrySet) {
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}
	System.out.println("---------------------------");
	//특정키에 대한 값 가져오기
	Entry<String,Integer> entry=null;
	entry=treeMap.firstEntry();
System.out.println("제일 앞 단어: "+entry.getKey()+"-"+entry.getValue());
    entry=treeMap.lastEntry();
System.out.println("제일 뒷 단어: "+entry.getKey()+"-"+entry.getValue());
	entry=treeMap.lowerEntry("ever");
System.out.println("ever 앞 단어: "+entry.getKey()+"-"+entry.getValue());
System.out.println("---------------------------");
    //내림차순 정렬
    NavigableMap<String, Integer> descendingMap 
                                = treeMap.descendingMap();
	Set<Entry<String,Integer>> descendingEntrySet 
	                            = descendingMap.entrySet();
	for(Entry<String,Integer> e:descendingEntrySet) {
		System.out.println(e.getKey()+"-"+e.getValue());
	}
		
	//범위검색
	System.out.println("[c~h 사이의 단어 검색]");
	NavigableMap<String, Integer> rangeMap 
	= treeMap.subMap("c", true, "h",false);
	
	System.out.println("---------------------------");	
	for(Entry<String,Integer> e:rangeMap.entrySet()) {
		System.out.println(e.getKey()+"-"+e.getValue());
	}
	
	}
}
