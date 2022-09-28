package ch08.sec05;

//인터페이스는 메소드 집합
public interface RemoCon {
  public static final int MAX_VOLUME=10;//상수
  int MIN_VOLUME=0;//상수
  
  //추상메소드
  void turnOn();
  
  //default메소드
  default void setVolume(int volume) {
	  System.out.println("디폴트메소드입니다");
  }
  //정적메소드
  static void staticMethod() {
	  System.out.println("static메소드");
  }
}
