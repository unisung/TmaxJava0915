package ch06.sec01;

public class PersonMain {
	public static void main(String[] args) {
	  Person gildong = new Person();
	  Person kkokjung = new Person();
	  Person jimae = new Person();
	   
	  //gildong.name="홍길동";
	  gildong.setName("홍길동");
	  //kkokjung.name="임꺽정";
	  kkokjung.setName("임꺽정");
	  //jimae.name="일지매";
	  jimae.setName("일지매");
	  
	  //gildong.age=18;
	  gildong.setAge(18);
	  //kkokjung.age = -5;
	  kkokjung.setAge(-5);
	  //jimae.age = 150;
	  jimae.setAge(150);
	  
	  gildong.getInfo("admin");
	  kkokjung.getInfo("guest");
	  jimae.getInfo("admin");
	  
	}
}
