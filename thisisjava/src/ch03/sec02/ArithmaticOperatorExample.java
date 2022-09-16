package ch03.sec02;

public class ArithmaticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
	   int result1 = v1 + v2;//int타입으로 변환후 연산
	   System.out.println(result1);
	   
	   long result2 = v1 + v2 -v4;//long타입으로 변환후 연산
	   System.out.println(result2);
	   
	   double result3 = (double)v1/v2;//double로 강제 형변환 후 연산
	   System.out.println(result3);
	   
	   int result4 = v1 % v2;
	   System.out.println(result4);
	   System.out.printf("%d을 %d로 나누면 몫은 %d이고 나머지는 %d입니다.\n", v1, v2, v1/v2, v1%v2);
	   
	}
}
