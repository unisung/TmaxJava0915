package ch07.verify.exam01;

public class Child extends Parent {
	public String name;
    //호출순서 1. 실행순서 4.
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	 //호출순서 2. 실행순서 3.
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
