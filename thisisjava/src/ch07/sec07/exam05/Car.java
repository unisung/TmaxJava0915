package ch07.sec07.exam05;

public class Car {
  public int speed;
  
  public void speedUp() {speed++;}
  //메소드 앞에 final을 붙이면 재정의(override)불가 
  public final void stop() {
	  System.out.println("차를 멈춤"); 
	  speed=0;
  }
}
