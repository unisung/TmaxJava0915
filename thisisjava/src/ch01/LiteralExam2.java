package ch01;

public class LiteralExam2 {
	public static void main(String[] args) {
		char var1 = 'A';//문자타입 char변수에 문자 리터럴 'A'저장
		System.out.println(var1);
		char var3 ='가'; //문자타입 char변수에 문자 리터럴 '가'저장
		System.out.println(var3);
		
		char c=97;//문자타입 char변수에 정수리터럴 97이 char타입으로 변환되어 저장
		System.out.println(c);
		c=0x0041;
		System.out.println(c);
		
		c=' ';//문자타입은 빈문자 리터럴인 경우 공백하나있어야 오류가 안남.
		String s="";//참고:문자열 리터럴은 공백이 없는 문자열도 가능.
		
		

	}

}
