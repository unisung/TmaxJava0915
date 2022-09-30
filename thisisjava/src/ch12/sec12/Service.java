package ch12.sec12;

public class Service {
	@PrintAnnotation
	public void method1() {//default "-"
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#",number=30)
	public void method3() {
		System.out.println("실행 내용3");
	}

}
