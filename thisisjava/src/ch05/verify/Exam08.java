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
		//향상된 for문
		for(int[] a1:array) {	
			for(int a:a1) {
				sum+=a;
				count++;
			}
		}
		//int[] [95][86]
		//int[] [83][92][96]
		//int[] [78][83][93][87][88]
		sum=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				  sum+=array[i][j];
			}
		}
		System.out.println("합: "+sum+", 평균: "+(double)sum/count);
	}
}
