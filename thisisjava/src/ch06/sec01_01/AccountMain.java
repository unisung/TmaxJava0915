package ch06.sec01_01;

import ch06.sec01.Account;

public class AccountMain {
	
	public static void main(String[] args) {
    Account account1 
      = new Account("홍길동",1000,"Shin-001");
    
    System.out.println("계좌번호: "+account1.getSno());
    System.out.println("잔 고: "+account1.getBalance());
    System.out.println("소유자: "+account1.getOwner());
    
    int result=account1.saveMoney(20000);
    System.out.println("잔고:"+result);
    
    result=account1.withdraw(50000);
    System.out.println("잔고:"+result);
    
    result=account1.withdraw(7000);
    System.out.println("잔고:"+result);
    
    Account account2 
    = new Account("임꺽정",1000,"Shin-002");
    
	}
}
