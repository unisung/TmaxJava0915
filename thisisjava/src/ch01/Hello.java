package ch01;

public class Hello {
	/*
	 * 이 주석은 범위 주석 -- 여러줄 표시함. 
	 * written by yhs 2022.09.15
	 * */
	public Hello(){}//매개변수 없는 default 생성자
	public Hello(String str){}//매개변수 1개 생성자
	public Hello(int a, int b) {}//매개변수 2개 생성자
	public static void main(String[] args)/* 이것은 main 메소드의 선언부 입니다. */ {
		System.out.println("안녕하세요!!!/**/");
	}
}
