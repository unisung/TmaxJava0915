package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
	  Set set = new HashSet();
	  set.add("Java");//
	  set.add("JDBC");
	  set.add("Servleet/JSP");
	  set.add("Java");//중복이므로 저장안됨
	  set.add("myBatis");
	  
	  System.out.println(set.size());
	  //문자열일때 출력
	  System.out.println(set);
	  
	 
	  

	}
}
