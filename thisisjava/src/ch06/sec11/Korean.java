package ch06.sec11;

public class Korean {
  //final로 선언한 필드는 선언과 동시에 초기화
  final String nation = "대한민국";//
  //인스턴스마다 생성되는 final필드
  final String ssn;
  
  //인스턴스 필드
  String name;
 //생성자

public Korean(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public String getNation() {
	return nation;
}

public String getSsn() {
	return ssn;
}

public String getName() {
	return name;
}


public static void main(String[] args) {
	Korean korean1 = new Korean("200101011234567","홍길동" );
	System.out.println(korean1.getName());
	
	Korean korean2 = new Korean("200102011234567","김길동" );
	System.out.println(korean1.getName());
	
}
  
  
  
  
  
}
