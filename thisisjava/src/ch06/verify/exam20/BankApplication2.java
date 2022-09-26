package ch06.verify.exam20;
//Scanner 임포트
import java.util.Scanner;
public class BankApplication2 {
	//필드
	static final String BANKNO="111-";
	static int seq;
	static int index;
	static Account[] accounts = new Account[100];//[null][null][null][null][null][null]...[null]
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run=true;
		while(run) {
				 printMenu();
			String menu=scanner.nextLine();
			switch(menu) {
			case "1": createAccount();
				      break;
			case "2": printListAccount();
				      break;
			case "3": deposit();
				      break;
			case "4": withdraw();
					  break;
			case "5": run = !run; break;
			}
		}//while 끝.
		System.out.println("프로그램 종료");
	}
	
	private static void withdraw() {
		System.out.println("--------");
 		 System.out.println("  출 금  ");
 		 System.out.println("--------");
 		 System.out.print("계좌번호: ");
 		 String ano = scanner.nextLine();
 		 System.out.print("출금액: ");
 		 int amount = Integer.parseInt(scanner.nextLine());
 		 
 		Account account2=findAccount(ano);
 		  if(account2!=null)
 			  account2.withdraw(amount);
 		  else
 			  System.out.println("해당 번호의 계좌가 없습니다.");
	}//withdraw() 끝.

	private static void deposit() {
		System.out.println("--------");
		  System.out.println("  예 금  ");
		  System.out.println("--------");
		  System.out.print("계좌번호: ");
		  String ano = scanner.nextLine();
		  System.out.print("예금액: ");
		  int amount = Integer.parseInt(scanner.nextLine());
		  Account account1=findAccount(ano);
		  if(account1!=null)
			  account1.deposit(amount);
		  else
			  System.out.println("해당 번호의 계좌가 없습니다.");
	}//deposit() 끝.

	private static void printListAccount() {
		System.out.println("--------");
        System.out.println(" 계좌목록 ");
        System.out.println("--------");
        for(Account acc:accounts)//참조타입 변수배열 - null여부확인
      	  if(acc!=null)
      	    System.out.println(acc);
	}
 
	private static void createAccount() {
		System.out.println("--------");
        System.out.println(" 계좌생성");
        System.out.println("--------");
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int amount = Integer.parseInt(scanner.nextLine());
        //계좌생성
        String ano = BANKNO+(++seq)+seq+seq;
        Account account = new Account(ano, owner, amount);

        for(int i=0;i<accounts.length;i++)//[null][null][null][null][]
      	  if(accounts[i]==null) {
      		  accounts[i]=account;
      		  break;
      	  }
        System.out.println("결과: 계좌가 생성되었습니다.");
	}//createAccount()

	static void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.println("선택>");
	}
	static Account findAccount(String ano) {
		Account acc=null;
		for(int i=0;i<accounts.length;i++) {
		      acc=accounts[i];
	    	  if(acc!=null) {
	     		   if(acc.getAno().equals(ano)) { //acc.getAno().equals("");
	        		    break;
	    		   }
	    	  }
	      }
		return acc;
	}//findAccount() 끝.
	
}