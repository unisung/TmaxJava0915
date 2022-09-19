package ch02;
//camel표기법
public class VariableInitializeExample {//합성어 Variable + initialize + example
	public static void main(String[] args) {
		int intValueResult = 10;//int + value + result\
		//변수 선언시 특수문자 사용불가
		//단, _와 $는 변수에 사용가능
		//int #1=10;
		int _1=10;
		int $1=10;
		//int no#1=10;
		
		//변수 선언시 숫자로 시작 불가(두 번째 부터는 숫자가능)
		//int 5bun = 5;
		int bun5 = 5;
		
		//변수 선언시 변수사이에 공백있으면 안됨.
		//int my space = 10; //int my_space = 10;
		
		//변수 선언시 키워드(예약어-reserved word) 사용불가
		//int const = 10;
		
		//타입
		
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		double var1 = (double) intValue;
		double var11 = Double.parseDouble("10");
		
		byte var2 = (byte ) intValue;
		
		int var3 = (int ) doubleValue;
		Integer var33 = new Integer("10");
		var3 = var33;
		
		//참조타입String이 기본타입 char로 변환 불가
		//char var4 = (char ) strValue;
		char var4 = strValue.charAt(0);
		
		String str = "5";
		byte var111 = Byte.parseByte (str );
		int var22 = Integer.parseInt (str );
		float var333 = Float.parseFloat (str );
		double var444 = Double.parseDouble(str );
		
		int v1 = 1;
		System.out.println("v1: " + v1);
		if(true) {
		int v2 = 2;
			if(true) {
			int v3 = 2;
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			System.out.println("v3: " + v3);
			}
		 System.out.println("v1: " + v1);
		 System.out.println("v2: " + v2);
		// System.out.println("v3: " + v3);
		}
		System.out.println("v1: " + v1);
		//System.out.println("v2: " + v2);
		
		//타입의 값의 범위
		System.out.println("byte타입의 최소값:"+Byte.MIN_VALUE+",최대값:"+Byte.MAX_VALUE);
		System.out.println("int타입의 최소값:"+Integer.MIN_VALUE+",최대값:"+Integer.MAX_VALUE);
		
		byte b1 = 120;
		for(int i=1;i<=200;i++) {
			 System.out.println((byte)(b1+i));
		}
		System.out.println("-------------------------------");
		b1 = -120;
		for(int i=1;i<=200;i++) {
			 System.out.println((byte)(b1-i));
		}
		 
	}
	//메소드명 my + method => myMethod
	public static void myMethod() {
		System.out.println("카멜표기법 메소드");
	}
}
