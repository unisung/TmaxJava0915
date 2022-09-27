package ch07.sec08.exam02;

public class A {
	public static void main(String[] args) {
		F f=new F();
		System.out.println(f instanceof F);//true
		System.out.println(f instanceof D);//true
		System.out.println(f instanceof B);//true
		System.out.println(f instanceof A);//true
		
		B b = new B();
		System.out.println(b instanceof D);//B -> D로 변환 불가 false
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		
		//상속관계가 아니므로 오류 발생
		//System.out.println(f instanceof C);
	}
}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
class F extends D{}

