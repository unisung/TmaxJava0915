package ch08.sec11.exam01;

public class Car {
  //필드의 다형성
  Tire tire1 = new HankookTire();//필드초기화
  Tire tire2 = new HankookTire();//필드초기화
  
  void run() {
     tire1.roll();
     tire2.roll();
  }
}
