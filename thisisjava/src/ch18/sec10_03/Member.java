package ch18.sec10_03;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	static String club="health Gym";//전달에서 빠짐
	private String id;
	private transient String name;//전달에서 빠짐 transient로 선언
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

}
