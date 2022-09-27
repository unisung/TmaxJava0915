package ch07.sec07.exam03;

public class MainExample {
public static void main(String[] args) {
Child child = new Child();
child.method1();
child.method2();//상속한 자식클래스에서 재정의 하면 재정의한 메소드가 실행됨
child.method3();
	}
}