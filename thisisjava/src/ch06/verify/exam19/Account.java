package ch06.verify.exam19;

public class Account {
	//필드
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	private int balance;//초기값 0
	//생성자
	//메소드
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if( balance>= MIN_BALANCE 
		    && balance <= MAX_BALANCE)
		   this.balance = balance;
	}
  }
