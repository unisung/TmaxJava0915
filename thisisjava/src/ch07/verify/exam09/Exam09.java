package ch07.verify.exam09;

public class Exam09 {
public static void main(String[] args) {
	// (B)new A()은 컴파일시 오류안남, 실행시에 runtime오류발생
	//java.lang.ClassCastException 이 발생
	B b=(B)new A();
	 
	 method(b); 
}
static void method(B b) {
	System.out.println(b.toString());
}
}
class A{}
class B extends A{}
class D extends B{}
class E extends B{}

class C extends A{}
class F extends C{}
