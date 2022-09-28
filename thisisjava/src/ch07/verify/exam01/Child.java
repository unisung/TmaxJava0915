package ch07.verify.exam01;

public class Child extends Parent {
	public String name;
    //호출순서 1. 실행순서 4.
	public Child() {
		this("홍길동");//생성자호출 메소드
		System.out.println("Child() call");
	}
	
	
	 //호출순서 2. 실행순서 3.
	public Child(String name) {
		super();
		this.name = name;//맴버 접근 키워드
		System.out.println("Child(String name) call");
	}
}
