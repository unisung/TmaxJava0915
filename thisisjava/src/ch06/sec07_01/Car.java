package ch06.sec07_01;

public class Car {
	//필드 선언
	String company = "H자동차";
	String model;//null,String model은 필드(global변수)
	String color;//null
	int maxSpeed;//0
	
	//생성자
	public Car() {	}
	public Car(String model) {//String model은 local변수
		this.model = model;
	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	@Override//컴파일러가 이해하는 주석
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}