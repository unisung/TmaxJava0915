package ch05.sec12;

public class MySingleTon {
 // 자신타입의 필드 선언 및 객체 초기화
  private static MySingleTon instance
                 =new MySingleTon();
  //기본생성자를 private로 선언
  private MySingleTon() {}
  //자신을 요청하는 객체에게 전달하는 메소드 
  public static MySingleTon getInstance() {
	return instance;
  }
   
  public static void greet() {
	  System.out.println("hello!!!");
  }
}
