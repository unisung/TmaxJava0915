package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
	  Set<String> set = new HashSet<>();
	  set.add("Java");//
	  set.add("JDBC");
	  set.add("Servleet/JSP");
	  set.add("Java");//중복이므로 저장안됨
	  set.add("myBatis");
	  
	  System.out.println(set.size());
	  //문자열일때 출력
	  System.out.println(set);
	  //반복자생성 iterator() <- index로 접근할수 없기 때문에 반복자 생성
	  Iterator<String> itor = set.iterator();
	  while(itor.hasNext()) {
		  String str=itor.next();
		  System.out.println(str);
	  }
	  
	  System.out.println(set.contains("myBatis")?"있음":"없음");
	  for(String str:set)
		  System.out.println(str);
	  	  
	  
	  
	  
	  
	  
	 
	  

	}
}
