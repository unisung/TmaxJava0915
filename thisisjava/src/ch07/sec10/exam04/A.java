package ch07.sec10.exam04;

public abstract class A {
   abstract void m1(); 
public static void main(String[] args) {
	A a = new E();
	a.m1();
  }
}
class B extends A{
	@Override
	void m1() {}
}
abstract class C extends A{
	//abstract void m1(); 
}
abstract class D extends C{
	//abstract void m1();
}
class E extends D{
	@Override
	void m1() { System.out.println("실체 부분 실행");	}
}