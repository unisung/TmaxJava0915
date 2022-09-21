package ch05.sec09;

public class ArrayCopybyForExample3 {
	public static void main(String[] args) {
		//배열 복사
		int[] oldIntArray1 = {1,2,3};//[1][2][3]
		int[] oldIntArray2 = {4,5,6};//[4][5][6]
		
		//배열 
		int[] newIntArray = new int[oldIntArray1.length + oldIntArray2.length];//

		//첫 번째 배열 복사 
		for(int i=0;i<oldIntArray1.length;i++)
			newIntArray[i] = oldIntArray1[i];
		//두 번째 배열 복사
		for(int i=0;i<oldIntArray2.length;i++)
			newIntArray[oldIntArray1.length+i] = oldIntArray2[i];
		
		for(int i=0;i<newIntArray.length;i++)
			System.out.print(newIntArray[i]+" ");
		System.out.println();
		
	}
}
