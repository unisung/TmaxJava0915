package ch09.sec07.exam02;

public interface InterA {
 public void turnOn();
 public void turnOff();
}
class A implements InterA{
	@Override
	public void turnOn() {}

	@Override
	public void turnOff() {}
	/* 추가된 메소드 */
	public void m1() {}
}