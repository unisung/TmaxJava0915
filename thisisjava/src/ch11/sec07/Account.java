package ch11.sec07;

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
		throw new MyException("사용자정의-잔고부족");//강제 예외발생 throw new 예외객체
	balance-=money;
	}catch(Exception e) {
		System.out.println(e);
	}
}
  
  
}
