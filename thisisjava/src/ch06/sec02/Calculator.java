package ch06.sec02;

public class Calculator {
	//접근지정자 리턴타입 메소드명(매개변수){return 리턴타입의 값;}
	static double calc(int x, String op, int y) {
		double result=0.0;
		 switch(op) {
		 case "+": result=x+y; break;
		 case "-": result=x-y; break;
		 case "x": result=x*y; break;
		 case "/": result=x/y; break;
		 }
		 return result;//return 값;
	}
}
