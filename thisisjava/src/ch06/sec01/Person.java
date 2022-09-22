package ch06.sec01;

//접근제한자 class 클래스명{} - 설계도
public class Person {
  //속성
	private String name;
	private int age;
	
  //동작
	void eat(String food) {
		System.out.println(food+"를 먹다");
	}
	void laugh() {
		System.out.println("웃다");
	}
	
	private String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) { 
			age=0;
		}else if(age>120) {
			age=120;
		}
		this.age = age;
	}
	
	public void getInfo(String flag) {
		if("admin".equals(flag)){//admin
			System.out.println(getName()+","+getAge());
		}else {//일반인
			System.out.println("관리자만 볼수 있어요");
		}
	}
}
