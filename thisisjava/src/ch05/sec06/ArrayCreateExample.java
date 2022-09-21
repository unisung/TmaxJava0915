package ch05.sec06;

public class ArrayCreateExample {
	public static void main(String[] args) {
		//선언과 동시에 배열객체 생성하여 대입
		int[] arr1 = {1,2,3,4};
		System.out.println(arr1.length);//length의 값은 생성시 만들어지고 수정불가
		
		//arr1.length =10;
		
		int arr2[] = {1,2,3,4};
		
		int[] arr3;
		arr3 = new int[] {1,2,3,4};
		
		//배열 출력
		System.out.print(arr1[0]+" "); 
		System.out.print(arr1[1]+" ");
		System.out.print(arr1[2]+" ");
		System.out.print(arr1[3]+" ");
		System.out.println();
		
		//for문으로 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		boolean[] bArr1 = new boolean[3];
		for(int i=0;i<bArr1.length;i++) {
			System.out.print(bArr1[i]+ " ");
		}
		System.out.println();
		bArr1[0] = true;
		for(int i=0;i<bArr1.length;i++) {
			System.out.print(bArr1[i]+ " ");
		}
		System.out.println();
		
	}
}
