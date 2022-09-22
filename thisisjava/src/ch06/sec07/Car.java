package ch06.sec07;

public class Car {
	//static영역에는 동일한 이름의 변수,메소드,클래스
	//는 하나만 로드됨.
	//생성자 오버로딩(overloading)
	//생성자 선언부 <- signature가 다르면 다른 생성자로 인식(jvm)
  Car(){}//()
  Car(String model, String color){}//(String, String)
  Car(String model, int maxSpeed){}//(String,int)
  Car(int maxSpeed, String model){}//(int,String)
  Car(String model, String color, int maxSpeed){}//(String,String,int);
}
