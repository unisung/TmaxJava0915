package ch05.verify;

import java.util.Arrays;

public class Exam07 {
	public static void main(String[] args) {
		int[] array= {1,5,3,8,2};
		
		//최대값 구하기
		int max =0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("최대값: "+max);
		
		//최소값 구하기
		int min = 100;
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("최소값: "+min);
		
		//오름차순 정렬
		int temp=0;//임시 저장변수
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				 if(array[i]>array[j]) {
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			}
		}
		
		for(int a:array)
			System.out.print(a+" ");
		
		//내림차순
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				 if(array[i] < array[j]) {
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			}
		}
		System.out.println("\n-------------------------");
		for(int a:array)
			System.out.print(a+" ");
		
		//System.out.println(Arrays.toString(array));
		
       
	}
}
