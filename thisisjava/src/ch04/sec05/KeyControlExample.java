package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed=0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
			System.out.println("-------------------------");
			System.out.println("선택: ");
			//키보드로 부터 값 입력받기
			String strNum = scanner.nextLine();
			
			if("1".equals(strNum)) {
				speed++;
			}else if(strNum.equals("2")) {
				if(speed--==0) speed=0;
			}else if(strNum.equals("3")) {//while문은 반복문을 빠져나가는 조건이 블럭내에 존재해야함.
				run=!run;
			}
			System.out.println("현재 속도 = "+speed);
		}
		System.out.println("프로그램 종료");
	}
}
