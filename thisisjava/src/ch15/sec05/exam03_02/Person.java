package ch15.sec05.exam03_02;

public class Person implements Comparable<Person>{
  //필드
  public int sno;
  public String name;

  //생성자
  public Person(int sno, String name) {
	  this.sno = sno;
	  this.name = name;
  }
  
  
@Override
public int compareTo(Person o) {
	return sno-o.sno;//0,음수,양수
}


@Override
public String toString() {
	return "Person [sno=" + sno + ", name=" + name + "]";
}



 

  
}
