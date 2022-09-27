package ch07.sec08.exam01;

public class Car {
 //필드 선언
  public Tire tire;//null로 초기화
  
  public void run() {
	  tire.roll();//위에서 선언한 tire필드의 roll()메소드 실행
  }
}
