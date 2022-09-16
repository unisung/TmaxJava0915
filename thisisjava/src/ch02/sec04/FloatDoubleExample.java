package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		//float var1 = 0.1234567890123456789;//왼쪽 float타입 오른쪽 double타입으로 인식
		float var1 = 0.1234567890123456789f;//왼쪽 float타입 오른쪽 float타입으로 인식 
		double var2 = 0.1234567890123456789;//왼쪽 double타입 오른쪽 double타입
		double var3 = 0.1234567890123456789d;//왼쪽 double타입 오른쪽 double타입
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);

	}

}
