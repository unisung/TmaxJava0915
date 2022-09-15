package ch02;

public class VariableUseExample {
	public static void main(String[] args) {
	  int hour=3;
	  int minute = 5;
	  System.out.println(hour + "시간" + minute+"분");//  정수+문자열=>문자열=>문자열+정수=>문자열 +문자열
	  
	  System.out.println("자바"+10+7);//문자열 +정수 =>문자열:"자바10", =>"자바10"+7 =>"자바10"+"7" =>"자바107" 
	  System.out.println("자바"+(10+7));//"자바"+(17) => "자바"+"17" => "자바17"
	  
	}
}
