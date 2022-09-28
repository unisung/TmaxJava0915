package ch09.sec02.exam02;

public class A {
	//static 멤버 클래스
	//바깥클래스$안쪽클래스
    static class B{}
    //인스턴스 필드값으로 B 객체 초기화
    B field = new B();
    //static 필드
    static B field2 = new B();
    
    //생성자
    A(){ B b=new B();}
    //인스턴스 메소드
    void method() {B b=new B();}
    //static 메소드
    static void method2() {
    	B b=new B();
    }
}

class B{}