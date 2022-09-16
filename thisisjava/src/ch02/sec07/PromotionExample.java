package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		int intValue = 10;
		// 00000000 00000000 00000000 00001010
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		//2진수로 표시
		System.out.println(Integer.toBinaryString(intValue));
		System.out.println(Integer.toBinaryString(byteValue));
		
		intValue = 1234567;
		System.out.println(Integer.toBinaryString(intValue));
		//00000000 00010010 11010110 10000111
		byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;// long = int => long =long
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;//float = long => float = float
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;//double = float => double = double
		System.out.println("doubleValue: " + doubleValue);

		 doubleValue = (double)floatValue;//double = float => double = double
		System.out.println("doubleValue: " + doubleValue);

		System.out.println(10.5/10.0);
		System.out.println((int)10.5/10);//정수/정수 => 정수
		System.out.println((int)(10.5/10.0));
		
		
	}
}
