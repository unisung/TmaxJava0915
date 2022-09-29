package ch11.sec07_01;

import ch11.sec07.MyException;

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
public void withdraw(int money) throws Exception{
	if(balance < money)
		throw new MyException("예외 떠넘기기 - 잔고부족");//강제 예외발생 throw new 예외객체
	balance-=money;
  }
}