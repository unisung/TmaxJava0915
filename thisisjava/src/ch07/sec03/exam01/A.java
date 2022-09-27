package ch07.sec03.exam01;

public class A extends Object{
 //private로 선언된 필드는 상속에서 제외
 private int a;
 //private로 선언된 메소드는 상속에서 제외
 private void m1() {}
 public A() {
		System.out.println("A생성자");
  }
public static void main(String[] args) {
	B b = new B();
	//b.a;
	//b.m1();
} 
}

//부모클래스의 생성자는 상속안됨.
//super()로만 호출됨.
class B extends A{
	public B() {
		super();//컴파일시 추가됨.
		System.out.println("B생성자");
	}
}
