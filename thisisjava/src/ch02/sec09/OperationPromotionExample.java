package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte v1 = 10;//byte타입 변수 = byte타입 
		byte v2 = 20;//byte타입 변수 = byte타입
		//byte result2 =(byte)(v1 + v2);//byte타입 변수 = byte + byte => int + int
		int result2 = v1 + v2;//
        
		byte result1 = 10 + 20;//리터럴 - 컴파일시 계산되어 바뀜(byte)
		
		byte v3 = 10;
		int v4 =100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;//byte + int => int+int(v3+v4)=> int + long=> long+long((v3+v4)+v5)
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;//char타입 + char타입 => int타입 + int타입 
		      //=> int타입(int타입보다 적은 타입(byte,short,char)는 연산시 모두 int타입으로 변환되어 연산에 참여함) 
		
		System.out.println((char)result4);
		
		int v8 = 10;
		int result5 = v8/4;
		System.out.println(result5);
		
		int v9=10;
		double result6 = v9/4.0;//double/double
		System.out.println(result6);
		
		int v10 =1;
		int v11 =2;
		//double result7 = v10/v11;//int/int => int(0), double =int=> double(0.0) 
        double result7=(double)v10/v11;
        //(double)int/int=>doule/int=>double/double(1.0/2.0)=>0.5,double=double
		System.out.println(result7);
		
	}
}
