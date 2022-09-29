package ch12.sec03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	//객체의 동등처리
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
		 return id.equals(((Member)obj).id);
		}else
		 return false;
	}
}