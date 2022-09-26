package ch07.sec03.exam04;

public class A {
//매개변수 없는 생성자(=default생성자)
 A(){ System.out.println("A의 기본 생성자");}
 A(int a){System.out.println("A의 int타입 매개변수 1개짜리 생성자");}
}

class B extends A{
	B(){ super(); 
		System.out.println("B의 default 생성자");}
	B(int a){super(a);System.out.println("B의 int타입 매개변수 1개짜리 생성자");}
}

class C extends B{
	C(){super(10);System.out.println("C의 기본생성자");}
}
