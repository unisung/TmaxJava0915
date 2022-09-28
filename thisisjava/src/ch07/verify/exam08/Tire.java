package ch07.verify.exam08;

public class Tire {
public static void main(String[] args) {
   Tire tire = new SnowTire();
   tire.run();
}	
	
  public void run() {
	  System.out.println("일반 타이어가 굴러갑니다.");
  }
}
class SnowTire extends Tire{
	public void run() {
		  System.out.println("스노우 타이어가 굴러갑니다.");
	  }	
}
