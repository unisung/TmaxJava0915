package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet 
		            = new TreeSet<>(new PersonComparator());
	    
		//객체 저장
		treeSet.add(new Person(5,"홍길동"));
		treeSet.add(new Person(25,"김자바"));
		treeSet.add(new Person(31,"박지원"));
		
		//
		for(Person person:treeSet)
			System.out.println(person);
		
	}
}
