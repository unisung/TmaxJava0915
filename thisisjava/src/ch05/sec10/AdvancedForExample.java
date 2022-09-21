package ch05.sec10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum=0;
		for(int i=0;i<scores.length;i++){//int i는 index
			System.out.print(scores[i]+" ");
		    sum+=scores[i];
		}
		System.out.println("총합: "+sum+",평균: "+((double)sum/scores.length));
		System.out.println("\n-------------------------");
		sum=0;
		//향상된 for문
		for(int a:scores) {//선언된 변수 int a는 반복자(iterator)
			System.out.print(a+" ");
			sum+=a;
		}
		System.out.println("총합: "+sum+",평균: "+((double)sum/scores.length));
		System.out.println("\n-------------------------");
		
		
	}
}
