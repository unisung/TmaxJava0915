package ch05.sec09;

public class ArrayCopybyForExample2 {
	public static void main(String[] args) {
		//배열 복사
		int[] oldIntArray = {1,2,3};//[1][2][3]
		//길이 5일 배열 
		int[] newIntArray = new int[5];//[0][0][0][0][0]

		//복사되는 배열의 특정 index부터 시작 가능.
		for(int i=0;i<oldIntArray.length;i++)
			newIntArray[2+i] = oldIntArray[i];
		
		for(int i=0;i<newIntArray.length;i++)
			System.out.print(newIntArray[i]+" ");
		System.out.println();
		
		
		
		

	}

}
