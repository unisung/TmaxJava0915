package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		//숫자형문자열("10")을 읽어서 int타입 10으로 출력 parseInt()
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//int 10을 숫자형 문자열"10"을 변환 String.valueOf(숫자)
		String str1 = String.valueOf(value1);
		System.out.println(str1);
		
	}
}
