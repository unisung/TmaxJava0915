package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";//String타입 객체는 리터럴로 생성시 new String()으로 자동 생성
		System.out.println(hobby.hashCode());
		hobby = null;//null은 기본타입에서는 사용불가, 참조타입의 초기화로 사용가능.
		
		//null pointer 예외발생 java.lang.NullPointerException
		//System.out.println(hobby.hashCode());
		
		//char c='여';
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " +kind2);
		
		
		
		
		
		

	}
}
