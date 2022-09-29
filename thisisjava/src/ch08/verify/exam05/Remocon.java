package ch08.verify.exam05;

public interface Remocon {
  public void turnOn();
}
class TV implements Remocon{
	public void turnOn() {
		System.out.println(
		this.getClass().getSimpleName()+"가 켜졌습니다");
	}
}