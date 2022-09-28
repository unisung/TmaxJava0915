package ch08.sec05;
//구현클래스
public class Audio implements RemoCon {
	//필드
	private int volume;
	
	@Override
	public void turnOn() {
	System.out.println(this.getClass().getSimpleName()
			  +"를 켭니다.");
	}
   /*
	@Override
	public void setVolume(int volume) {
	 System.out.println(this.getClass().getSimpleName()
			                   +"의 볼륨을 올립니다."); 
	}
	*/
    

}
