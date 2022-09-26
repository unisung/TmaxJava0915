package ch06.verify.exam20;

public class AccountExample_Sample {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];// [A][A][null][null][null][null][null][null][null][null]
		accounts[0] = new Account("111-111", "홍길동", 10000);
		accounts[1] = new Account("111-222", "일지매", 20000);

		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account != null) {
				if (account.getAno().equals("111-111")) {
					account.setBalance((account.getBalance() - 3000));
					System.out.println("출금 성공");
				}
			}
		}
	}
}
