package ch08.verify.exam06;

public class MainExample2 {
	public static void main(String[] args) {
		//객체생성
		MethoExample m = new MethoExample();
		//호출
		int result = m.plus(10,20);
		System.out.println(result);
		result = m.plus(10,20);
		System.out.println(result);
		String msg = m.sayHello();
		System.out.println(msg);
		
		m.plus(10,20);
		
		m.minus(10, 20);
		m.sayGreet();
	
	}
}
