package ch15.sec05.exam04;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.sno-o2.sno;
	}
}
