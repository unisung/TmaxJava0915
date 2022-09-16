package ch02.sec05;

public class BooleanExample {
	public static void main(String[] args) {
		//boolean타입 변수 선언하고 boolean타입 리터럴 true를 대입
		boolean stop = true;
		//boolean타입 은 주로 제어문에서 실행블럭{}의 실행여부판단시 사용함.
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
