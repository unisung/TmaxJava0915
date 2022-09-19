package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
	    //나눔을 당하는 수가 정수이고 나누는 수가 0.0 일 때 Infinity, NaN
		int x = 5;
		double y = 0.0;
	
		double z = x / y;
		//double z = x % y; // NaN (Not a Number)
		
		//잘못된 코드
		System.out.println(z + 2);// 	
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) { 
			System.out.println("값 산출 불가"); 
		} else { 
			System.out.println(z + 2); 
		}
	}
}
