package ch08.sec05;

public class MainExample {
	public static void main(String[] args) {
		RemoCon rc = new Audio();
		rc.turnOn();
		
		//tvi
		rc = new TV();
		rc.turnOn();
		rc.setVolume(10);
		
		//정적메소드 실행
		//인터페이스.static메소드
		RemoCon.staticMethod();
	}
}