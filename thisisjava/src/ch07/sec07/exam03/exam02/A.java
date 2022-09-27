package ch07.sec07.exam03.exam02;

public class A {
  void method() {
	  System.out.println("A클래스의 메소드");
  }
}

class B extends A{
	//재정의 된 메소드의 내용이 실행됨.(부모타입으로 프로모션되더다로, 자신타입으로 캐스팅되더라도)
  void method() {
		  System.out.println("B클래스에서 재정의 된 메소드");
  }
}
