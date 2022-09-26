package ch06.verify.exam20;
//Scanner 임포트
import java.util.Scanner;
public class BankApplication {
	//필드
	static Account[] accounts = new Account[100];//[null][null][null][null][null][null]...[null]
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			
		}
	}
}
