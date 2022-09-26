package ch06.verify.exam20;

public class Account {
	//필드
	private String ano;//계좌번호
	private String owner;//소유자
	private int balance;//잔고
	//매개변수 3개짜리 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//getter/setter
	public int getBalance() {	return balance;	}
	public void setBalance(int balance) { this.balance = balance;}
	public String getAno() {return ano;	}
	public String getOwner() {	return owner;}

	//계좌정보 출력
	@Override
	public String toString() {
		return ano + "\t" + owner + "\t" + balance;
	}
	//입금
	public void deposit(int amount) {
		balance +=amount;//banance = balance + amount;
	}
	//출금
	public void withdraw(int amount) {
		if(balance - amount >= 0)
		balance -=amount;//banance = balance - amount;
	}
}
