package ch08.sec02;

//인터페이스를 구현한 실체 클래스
public class Audio implements RemoCon {
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
}
