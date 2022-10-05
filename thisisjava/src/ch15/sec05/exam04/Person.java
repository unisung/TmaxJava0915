package ch15.sec05.exam04;

//Comparable인터페이스로 구현이 안된 일반클래스
public class Person{
  //필드
  public int sno;
  public String name;

  //생성자
  public Person(int sno, String name) {
	  this.sno = sno;
	  this.name = name;
  }
  

@Override
public String toString() {
	return "Person [sno=" + sno + ", name=" + name + "]";
}



 

  
}
