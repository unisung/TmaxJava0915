package ch05.sec04;

public class StringLiteralExample {
	public static void main(String[] args) {
		// 리터럴로 만들어진 String은 동일한 객체로 사용(상수임)
		String name1 = "홍길동";//"홍길동"문자열 을 상수풀에 저장
		String name2 = "홍길동";// 상수풀에 똑같은 리터럴이 있으면 상수풀에 저장된 리터럴 사용
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));

	}
}
