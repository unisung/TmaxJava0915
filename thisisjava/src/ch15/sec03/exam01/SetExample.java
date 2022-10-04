package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);//int -> Integer autoBoxing
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println(set1.toString());

	}
}
