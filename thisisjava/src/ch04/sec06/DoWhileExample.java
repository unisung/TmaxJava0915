package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		//do{ 실행문; } while(조건);
		do {
			System.out.print(">");
			inputString = scanner.nextLine();//키보드로 부터 한 줄 입력 받기
			System.out.println(inputString);// 입력값 출력
		}while(!inputString.equals("q"));// 입력값이 "q"가 아니면 계속 반복
	}
}
