package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
	  int sum =0;
	  int i;
	  
	  for(i=1;i<=100;i++) {
		  sum +=i;//복합 대입 연산
	  }
	  System.out.println("1~"+(i-1)+"합: "+sum);
	}
}
