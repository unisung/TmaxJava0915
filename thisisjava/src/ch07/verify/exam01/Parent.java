package ch07.verify.exam01;

public class Parent {
	public String nation;
	 //호출순서 3. 실행순서2.
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	 //호출순서 4. 실행순선 1.
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
