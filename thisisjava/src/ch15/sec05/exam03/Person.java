package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
  //필드
  public String name;
  public int age;
  //생성자
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
@Override
public int compareTo(Person o) {
	return name.compareTo(o.name) ;//자신의 name앞이면-,뒤면+, 같은위치면0
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
 

  
}
