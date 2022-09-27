package ch07.sec08.exam01;

//필드의 다형성
public class CarExample {
	public static void main(String[] args) {
	 Car myCar = new Car();
	 
	 //필드를 객체로 초기화
	 myCar.tire = new Tire();//Tire()로 대입
	 //run()메소드 실행
	 myCar.run();
	 
	 
	//필드를 객체로 초기화
	myCar.tire = new HankookTire();//Tire()로 대입
	//HankookTire의 run()메소드 실행
	myCar.run();
	
	//필드를 객체로 초기화
	myCar.tire = new KumhoTire();//Tire()로 대입
	//KumhoTire의 run()메소드 실행
	myCar.run();
	

	}

}
