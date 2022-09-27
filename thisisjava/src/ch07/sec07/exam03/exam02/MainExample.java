package ch07.sec07.exam03.exam02;

public class MainExample {
	public static void main(String[] args) {
		//메소드의 동적 바인딩
		A a= new B();
		a.method();
		
		//메소드의 동적 바인딩
		B b = (B)a;
		b.method();
		

	}

}
