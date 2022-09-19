package ch04.sec04;

public class SumFrom1To100Example8 {
	public static void main(String[] args) {
	  int sum =0;
	  
	  for(int i=1;  ;i++ ) {//반복시 마다 실행
		  if(i>100) { break;}
		  sum +=i;//복합 대입 연산
	  }
	  System.out.println("합: "+sum);
	}
}
