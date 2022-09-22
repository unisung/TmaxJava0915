package ch06.sec07;

public class Member {
	private int sno;
	private String name;
	private String address;
	private String phone;
	private String email;
	
	//default생성자
	public Member() {}

	public Member(int sno, String name, String address, String phone,int flag) {
		this.sno = sno;
		this.name = name;
		this.address = address;
		if(flag==1)
		this.phone = phone;
		else
		this.email = email;	
	}

	public Member(int sno, String name, String address) {
		this.sno = sno;
		this.name = name;
		this.address = address;
	}
	

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [sno=" + sno + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}



	
	
	
	

}
