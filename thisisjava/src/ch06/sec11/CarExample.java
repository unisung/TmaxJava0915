package ch06.sec11;

public class CarExample {
  public static void main(String[] args) {	
	 Car car1 = new Car();
	 Car car2 = new Car();
	 Car car3 = new Car();
 Car[] cars = {car1,car2,car3};
 for(Car car:cars) {
	  System.out.println(car);//toString() 자동 실행
  }
 }
}

class Car{
 static final String model="소나타";
 static int sno = 1;	
 String carmodel;
 
 public Car() {
  carmodel = model+ sno++;	 
 }
@Override
public String toString() {
	return "Car [carmodel=" + carmodel + "]";
 }
}
