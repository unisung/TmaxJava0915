package ch12.sec03.exam02;

public class EqualsExample {
	public static void main(String[] args) {
		Member m1 = new Member(1,"blue");
		Member m2 = new Member(1,"blue");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		System.out.println(m1.toString());
		System.out.println(m2);
		
		if(m1.hashCode()==m2.hashCode()) {
			if(m1.equals(m2)) {
			  System.out.println("m1과 m2는 동등합니다");
			}else {
				System.out.println("m1과 m2는 동등하지않습니다");	
			}	
		}else
			System.out.println("m1과 m2는 동등하지않습니다.");
	}
}