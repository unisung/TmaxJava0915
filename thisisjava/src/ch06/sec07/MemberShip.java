package ch06.sec07;

public class MemberShip {
	public static void main(String[] args) {
	 Member m1 = new Member();
	 m1.setSno(1); m1.setName("강길동"); m1.setAddress("서울시");
	 Member m2 = new Member(2,"홍길동","서울시");
	 m2.setPhone("010-111-1234");
	 Member m3 = new Member(3,"임꺽정","수원시","010-111-1212",1);
	 m3.setEmail("im@naver.com");
	 Member m4 = new Member(4,"일지매","광명시");
	 Member m5 = new Member(5,"김길동","광명시","kim@naver.com",2);
	 
	 Member[] members = {m1,m2,m3,m4,m5};
	 for(Member member:members)
		 System.out.println(member.toString());
	}
}