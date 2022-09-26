package ch07.sec03.exam01;
//자바에서 모든 클래스의 최상위 부모는 Object
//일반클래스는 extends Object가 생략되었다고 봄.
public class MainExample extends Object {
	public static void main(String[] args) {
		B b= new B();
		System.out.println(b.toString());
	}
}
