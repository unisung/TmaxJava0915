package ch12.sec03.exam02;

public class Member {
	int no;
	public String name;
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return no;
	}

	@Override
	public boolean equals(Object obj) {
		return no==((Member)obj).no & name.equals(((Member)obj).name);
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + "]";
	}
	
	
	
}