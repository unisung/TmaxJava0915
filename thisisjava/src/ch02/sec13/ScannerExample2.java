package ch02.sec13;

import java.util.Scanner;

//Scanner로 두 정수를 입력받아서 곱한 결과를 출력하도록 작성하세요
public class ScannerExample2 {
	public static void main(String[] args) {
	//스캐너 생성
	Scanner scanner = new Scanner(System.in);
	int x; 	int y;
			
	//x값 입력
	System.out.println("첫 번째 정수를입력하세요:");
	String strX=scanner.nextLine();
	
	//y값 입력
	System.out.println("두 번째 정수를입력하세요:");
	String strY=scanner.nextLine();
	
	//타입변환
	x = Integer.parseInt(strX);
	y = Integer.parseInt(strY);
	
	//두 수 곱하기
	int result = x*y;
	
	System.out.printf("%d * %d 의 결과:%6d\n",x,y,result);

	}
}
