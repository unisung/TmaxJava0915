package ch04.sec04;

public class SumFrom1To100Example4 {
	public static void main(String[] args) {
	  int sum =0;
	  int i=1;//최초1회 실행
	  
	  for( ; i<=100; ) {//반복시 마다 실행
		  sum +=i;//복합 대입 연산
		  i++;//반복시 마다 실행
	  }
	  System.out.println("합: "+sum);
	}
}
