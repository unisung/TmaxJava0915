package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		//타입[] 변수; <- 해당타입 배열 선언
		int[] arr1; // int타입의 값만 저장하는 1차원 배열 선언 (stack)
		int[] arr2; // stack
		
		//배열 객체 생성
		// new 타입[저장길이];
		arr1 = new int[3];//길이가 3인(int타입의 값 3개 저장할수 있는 공간) 배열 객체 생성
		// [1][2][3]
		arr1[0] =1; arr1[1]=2; arr1[2]=3;//생성된 int타입 배열에 각 인덱스에 해당하는 요소에 int타입 값을 저장. 
		
		//초기값으로 배열 객체 만들기
		arr2 = new int[] {1,2,3};
		
		//초기값으로 배열 생성(배열 선언과 동시에 생성) 
		int[] arr3 = {1,2,3};
		
		int[] arr4 = arr3;
		
		//주소값 비교
		System.out.println(arr1==arr2);//참조변수의 ==연산은 변수에 저장된 주소값 비교
		System.out.println(arr3==arr4);//참조변수의 ==연산은 변수에 저장된 주소값 비교
		System.out.println(arr2!=arr3);//참조변수의 ==연산은 변수에 저장된 주소값 비교
		
		
		
		
		

	}
}
