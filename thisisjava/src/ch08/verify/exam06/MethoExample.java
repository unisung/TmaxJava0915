package ch08.verify.exam06;

public class MethoExample {
  //A.매개변수 받는 메소드
     //1.처리후 결과값을 되돌려주는 메소드
	  public int plus(int a, int b) {return a+b;}
     //2.처리후 결과값을 되돌려주지 않는 메소드
	  public void minus(int a, int b) {System.out.println(a-b);}
  
  //B.매개변수 안받는 메소드
    //1.처리후 결과값을 되돌려주는 메소드
	  public String sayHello(){return "안녕하세요";}
	//2.처리후 결과값을 되돌려주지 않는 메소드	
	  public void sayGreet() {
		  System.out.println("방가여");
	  }
}