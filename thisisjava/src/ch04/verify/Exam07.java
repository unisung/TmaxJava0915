package ch04.verify;

import java.util.Scanner;

//7. while 문과 Scanner의 nextLine ( ) 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
//입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
public class Exam07 {
	public static void main(String[] args) {
     //스캐너 생성
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		long balance = 0;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>");
			
			String menu=scanner.nextLine();
			
			int amount=0;
			switch(menu) {
			case "1": System.out.println("예금액>");
			        amount = Integer.parseInt(scanner.nextLine());
			        balance +=amount;
			        break;
			case "2": System.out.println("출금액>");
					amount = Integer.parseInt(scanner.nextLine());
					if(balance - amount < 0) {
						System.out.println("출금액("+amount+")이 잔고("+balance+")보다 큽니다.");
					}else {
			           balance -=amount;
					}   
			        break;
			case "3": System.out.print("잔고>"); 
			        System.out.println(balance);
			        break;
			case "4":  run =!run;
			}
		}
		System.out.println("프로그램 종료");
	}
}
