package ch07.sec07.exam03.exam01;

public class MainExample {
	public static void main(String[] args) {
		A a= new B();
		a.method();
		
		B b = (B)a;
		b.method();
		
	}
}
