package ch11.sec07_01;

public class AccountExample {
	public static void main(String[] args) {
	  Account account = new Account();
	  
	  account.deposit(1000);
	  try {
		  account.withdraw(5000);
		  //throws로 선언된 메소드를 호출하는 곳에서는 반드시 예외처리해줘야함
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	}
}