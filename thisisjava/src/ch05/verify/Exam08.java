package ch05.verify;

public class Exam08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		int sum=0;
		int count=0;
		for(int[] a1:array) {	
			for(int a:a1) {
				sum+=a;
				count++;
			}
		}
		System.out.println("합: "+sum+", 평균: "+(double)sum/count);
	}
}
