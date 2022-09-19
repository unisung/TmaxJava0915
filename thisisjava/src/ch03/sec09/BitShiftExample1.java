package ch03.sec09;

public class BitShiftExample1 {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2= num1 * (int)Math.pow(2, 3);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
	
		//이동하고 비어있는 상위자리는 최상위 비트(양수면0, 음수면 1)로 채워짐
		int num2 = -8;
		System.out.println(Integer.toBinaryString(num2));
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);// num2 / 2^3
		System.out.println(Integer.toBinaryString(num2>>3));
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		
		
		
		
		
		
		

	}
}
