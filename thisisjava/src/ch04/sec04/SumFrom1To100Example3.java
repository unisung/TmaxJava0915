package ch04.sec04;

public class SumFrom1To100Example3 {
	public static void main(String[] args) {
	  int sum =0;
	  
	  for(int i=1; i<=100; ) {
		  sum +=i;//복합 대입 연산
		  i++;
	  }
	  System.out.println("합: "+sum);
	}
}
