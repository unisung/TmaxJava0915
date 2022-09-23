package ch06.sec08;

public class Calculator {
  int x,y;
  //1.매개변수를 받고 결과를 리턴하는 메소드
  int plus(int x, int y) //선언부, 리턴타입 메소드명(매개변수1, 매개변수2,...)
  {//실행부(실체부) {}블럭
	return x+y;
  }
  //2.매개변수를 받고 결과를 리턴하지 않는 메소드
   void minus(int x, int y) {
	  System.out.println(x-y);
  }
  //3.매개변수를 받지 않고 결과를 리턴하는 메소드
   int multiple() {
	   return x*y;
   }
   
  //4.매개변수를 받지 않고 결과를 리턴하지 않는 메소드
   void divide() {
	   if(y!=0) 
		   System.out.println(x/y);
   }
}
