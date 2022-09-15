package ch01;

public class Commands {//클래스명 Commands
	public static void main(String[] args) {//실행에 필수적인 main()메소드
		int x;//기본타입 int타입의 변수 x선언 
		x=2; //기본타입 int타입의 변수에 int 타입 정수리터럴 2를 대입 
		int y=5; //int타입 변수 y를 선언하고 int타입 정수 리터럴 5를 대입
		int result = x+y ;  //int타입 변수 result를 선언하고 정수변수x의 값과 정수변수 y의 값을 합한 결과를 result에 대입
		//API
		//System.out.println(result);//System클래스내의 참조변수 out이 참조하는 클래스에 있는 
		                           //println()함수를 호출하여
		                           //정수변수result에 저장된 값을 출력하는 명령어 
	}
}
