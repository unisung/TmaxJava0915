package ch04.sec04;

//반복문의 count변수로 실수(float)사용 금지
public class FloatCountExample {
	public static void main(String[] args) {
		 for(float x=0.1f; x<=1.0f; x+=0.1f) {
			  System.out.println(x);
		 }
	}
}
