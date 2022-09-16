package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		//참조타입의 변수선언
		// 타입 변수명 = new 참조타입생성자();
		String message = new String("hello");
		System.out.println(message);
		
		//타입 변수명 = 문자열리터럴
		String name="홍길동";
		System.out.println(name);
		
		//escape문자 - 인용부호용 문자 \"
		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		//t가 문자t가 아니고 tab만큼띄우는 기능을 함 
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		//n이 다음줄로 이동하는 기능을 함
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		//u가 unicode의미
		System.out.println("\uD64DF");
		
		//디렉토리 경로 \ 표시용 \\
		System.out.println("c:\\javaworkspace\\ch01\\Hello.java");
		

	}

}
