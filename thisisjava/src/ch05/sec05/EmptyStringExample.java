package ch05.sec05;

public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby="";
		//빈 문자열 객체를 참조함.
		if("".equals(hobby)) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
			System.out.println("".length());
		}
	}
}
