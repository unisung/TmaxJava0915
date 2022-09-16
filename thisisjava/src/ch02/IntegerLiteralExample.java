package ch02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011;//2진수(binary)표기법: 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 => 8+0+2+1=>15
		int var2 = 0206;//8진수표기법:2*8^2 + 0*8^1 + 6*8^0=2*64 + 0+6 =>134 
		int var3 = 365;//10진수표기법:365
		int var4 = 0xB3;//16진수표기법:11*16^1 + 3*16^0 => 11*16 + 3*1 =>176+3=179
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	
	}
}
