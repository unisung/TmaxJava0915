package ch02.sec13;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
	    
		//반복문
		while(run) {
			System.out.print("입력 문자열:");
			String data = scanner.nextLine();//console로 부터 한줄 단위로 입력받아서 리턴해주는 명령어
			if(data.equals("q")) {// 문자열의 내용비교는 비교연산자(==)를 사용하면 안됨, equals()메소드만 사용해야함.
				break;//반복문을 빠져나가는 명령문
			}
			System.out.println("출력 문자열: "+data);
			System.out.println();
		}
		
		System.out.println("종료");
	}
}
