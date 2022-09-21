package ch05.sec07;

public class MultiDimensionalArrayByNewExample {
	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		//80,83,85    86,90,92
		int[] arr1 = {80,83,85};//배열 객체
		int[] arr2 = {86,90,92};//배열 객체
		
		//일차원 배열 두개를 묶어서 2차원으로 생성
		int[][] arr2Dim = {arr1,arr2};//배열의 요소에 객체를 저장 
		
		for(int i=0;i<arr2Dim.length;i++) {
			  System.out.print(arr2Dim[i][0]+",");
			  System.out.print(arr2Dim[i][1]+",");
			  System.out.println(arr2Dim[i][2]);
		}
		String str1 ="hello";
		String str2 = str1;
		//초기값 1차원을 가지고 만든 2차원 배열
		int[][] arr2Dim2 = {{80,83,85},{86,90,92}};
		
		//초기값 없이 동일한 길이의 2차원배열 생성
		//일차원의 길이가 동일
		int[][] mathScore = new int[2][3];
		mathScore[0] = new int[] {80,83,85};//
		mathScore[1] = new int[] {86,90,92};
		
		System.out.println("2차원 배열(행과 열로 구성된 배열)의 1차원갯수(행의 갯수):"+mathScore.length);
		System.out.println("2차원 배열의 첫번째 1차원배열(첫번째 행)의 요소의 수(열)의 수:" +mathScore[0].length);
		System.out.println("2차원 배열의 두번째 1차원배열(두번째 행)의 요소의 수(열)의 수:" +mathScore[1].length);
		//이차원 배열의 각 요소값 출력
		for(int i=0;i<mathScore.length;i++) {
			for(int j=0;j<mathScore[i].length;j++) {
				 System.out.print(mathScore[i][j]+" ");
			}
			System.out.println();
		}
		
	    //[][]
		//[][][]
		//[][][][]
		int[][] arr5 = {{1,2},{3,4,5},{6,7,8,9}};
		System.out.println("2차원 배열(행과 열로 구성된 배열)의 1차원갯수(행의 갯수):"+arr5.length);
		System.out.println("2차원 배열의 첫번째 1차원배열(첫번째 행)의 요소의 수(열)의 수:" +arr5[0].length);
		System.out.println("2차원 배열의 두번째 1차원배열(두번째 행)의 요소의 수(열)의 수:" +arr5[1].length);
		System.out.println("2차원 배열의 세번째 1차원배열(세번째 행)의 요소의 수(열)의 수:" +arr5[2].length);
		
		for (int i=0;i<arr5.length;i++) {
			for(int j=0;j<arr5[i].length;j++) {
				 System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
