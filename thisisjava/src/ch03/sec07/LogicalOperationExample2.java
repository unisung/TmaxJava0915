package ch03.sec07;

public class LogicalOperationExample2 {
	public static void main(String[] args) {
		int x=-1;
		int y=1;
		
		//논리곱(&)가 하나면 양쪽을 다 계산 후 논리비교
		//&&가 두개면 왼쪽이 false인 경우 왼쪽만 계산함.
		if( y!=1 && (10/++x)==1 ) { // false & , &&
			System.out.println(true);
		}
		System.out.println("x:"+x);
		
		x=-1;
		//논리합(|)가 하나면 양쪽을 다 계산 후 논리비교
		//||가 두개면 왼쪽이 true인 경우 왼쪽만 계산함
		if( y==1 || (10/++x)==1) { // | , ||
			System.out.println(true);
		}
		System.out.println("x:"+x);
	}

}
