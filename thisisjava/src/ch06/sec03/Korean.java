package ch06.sec03;

public class Korean {
  //필드 선언
  String nation;
  String name;
  String ssn;
  
  
//생성자 선언
//동일 클래스내에서 다른 생성자를 호출시 this()를 사용
public Korean() {
	this.nation= "대한민국";
}
public Korean(String name, String ssn) {
	this(name);//반드시 첫째 줄에 작성
	this.ssn = ssn;
}
public Korean(String name) {
	this();
	this.name = name;
}



public static void main(String[] args) {
	Korean korean = new Korean("홍길동", "20010103000010");
  }
}
