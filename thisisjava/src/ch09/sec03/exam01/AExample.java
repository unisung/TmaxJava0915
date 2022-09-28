package ch09.sec03.exam01;

public class AExample {
	public static void main(String[] args) {
		A.B b = new A.B();
		//인스턴스 멤버
		System.out.println(b.field1);
		b.method1();
		
		//B의 정적필드 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();
	}
}
