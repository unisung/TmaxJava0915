package ch08.sec05;
//구현클래스
public class TV implements RemoCon {
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
	System.out.println(this.getClass().getSimpleName()
			  +"를 켭니다.");
	}

	

	

}
