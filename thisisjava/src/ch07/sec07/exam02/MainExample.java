package ch07.sec07.exam02;

public class MainExample {
	public static void main(String[] args) {
		A a;
		B b = new B();
		
		a = b;//자동 형변환 (참조변수 a는 A타입으므로 A타입 범위만 접근가능)
		a.a=10;//부모클래스(A)범위의 객체의 필드 접근가능
		a.me1();//부모클래스(A)범위의 객체의 메소드 접근가능
		a.b=10;//참조 변수 a범위가 A이므로 자식클래스(B)객체의 필드 접근불가
		a.me2();//참조 변수 a범위가 A이므로 자식클래스(B)객체의 메소드 접근불가
		
		B b2 =(B)a;//강제 형변환(참조변수b2는 B타입으미로 A타입 범위와 B타입 범위 모드 접근 가능)
		b2.a=10;//참조 변수 b2범위가 B이므로 부모클래스(A)객체영역의 필드 접근가능
		b2.me1();//참조 변수 b2범위가 B이므로 부모클래스(A)객체영역의 메소드 접근가능
		b2.b=20;//참조 변수 b2범위가 B이므로 자식클래스(B)객체영역의 필드 접근가능
		b2.me2();//참조 변수 b2범위가 B이므로 자식클래스(B)객체영역의 메소드 접근가능

	}
}
