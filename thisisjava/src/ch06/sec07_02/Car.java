package ch06.sec07_02;

public class Car {
	//필드 선언
	String company;
	String model;//null,String model은 필드(global변수)
	String color;//null
	int maxSpeed;//0
	
	//생성자
	//this()메소드 는 다른 생성자 호출시 사용
	//****** this()메소드는 항상 반드시 must 첫줄에 작성해야함.
	public Car() {
		this.company= "H자동차";
	}
	public Car(String model) {//String model은 local변수
		this();//default생성자 호출
		this.model = model;
	}
	public Car(String model, String color) {
		this(model);//Car(String 변수); 호출
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
	}
	
	@Override//컴파일러가 이해하는 주석
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}