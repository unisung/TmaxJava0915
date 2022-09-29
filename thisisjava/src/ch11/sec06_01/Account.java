package ch11.sec06_01;

public class Account {
  private long balance;

public Account() {}

public long getBalance() {
	return balance;
}

public void deposit(int money) {
	balance +=money;
}
//예외 떠넘기기
public void withdraw(int money){
	try {
	if(balance < money)
		throw new Exception();//강제 예외발생 throw new 예외객체
	balance-=money;
	}catch(Exception e) {
		System.out.println("잔고가 부족합니다.");
	}
}
  
  
}
