package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
	  //인스턴스멤버로 선언된 클래스는 
	  //바깥쪽 클래스의 객체를 생성후
	  A a=new A();
	  //안쪽 클래스의 객체 생성
	  A.B b = a.new B(); 

	}
}
