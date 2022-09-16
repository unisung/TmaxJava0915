package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
	 //변수 선언 : 타입 변수명 = 리터럴;
	 // 연산자(+,-,*,/,%,=,==,!=, >, <,..)를 기준으로 왼쪽과 오른쪽이 타입이 같아야 연산이 됨.
	 // byte => short(char) => int => long 
	  long var1 = 10;// long타입 변수를 선언하고 int타입의 리터럴을 대입, int타입이 long타입으로 자동변환되어서 대입연산.
	  long var2 = 20L;// 대입연산자(=)를 기준으로 왼쪽타입(long)과 오른쪽타입(long)이 같음.
	  
	  //long var3 = 1000000000000; //오른쪽 int 리터럴 범위를 벗어나서 오류 발생
	  long var4 = 1000000000000L;// long 리터럴, long 변수
	  
	  System.out.println(var1);
	  System.out.println(var2);
	  System.out.println(var4);

	}
}
