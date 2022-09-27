package ch07.sec08.exam01;

public class Tire {
  public void roll() {System.out.println("회전합니다.");}
}
class HankookTire extends Tire{
	public void roll() {
		System.out.println("한국타이어 회전합니다.");}
}
class KumhoTire extends Tire{
	public void roll() {
		System.out.println("금호타이어 회전합니다.");}	
}