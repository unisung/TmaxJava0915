package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		//
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s:scores) System.out.print(s+" ");
		System.out.println();
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95));
		System.out.println(scores.higher(95));
		System.out.println("--------------------");
		System.out.println(scores.floor(95));
		System.out.println(scores.ceiling(85));
		System.out.println("--------------------");
		
		//80<끝
		NavigableSet<Integer> rangeSet = scores.tailSet(80, false);
		for(Integer s:rangeSet)
			System.out.print(s+" ");
		System.out.println("\n--------------------");
		
		// 80<= 범위 < 90
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer s:rangeSet)
			System.out.print(s+" ");
		System.out.println("\n--------------------");
	}
}