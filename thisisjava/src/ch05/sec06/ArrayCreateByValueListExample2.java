package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	//전달받은 배열의 각 요소를 출력해주는 메소드
   static void printItem(int[] scores) {
			for(int i=0;i<scores.length;i++)
				System.out.print(scores[i]+" ");
		}
		
	public static void main(String[] args) {
		//배열 변수  선언
		int[] scores;
		
		//배열 변수에 배열 대입
		scores = new int[] {83, 90, 87};
		//배열 항목 총합 구하고 출력
		int sum1 = 0;
		for(int i=0;i<scores.length;i++) {
			sum1 = sum1 + scores[i];// sum1 +=scores[i]
		}
		System.out.println("총합: " + sum1);
		
		//printItem()메소드 호출 -  같은 class내의 다른 메소드호출 함수명(매개변수);
		 printItem(new int[] {83, 90, 87});
		 printItem(new int[] {83, 90, 87});
		 printItem(new int[] {83, 90, 87});
		/**
		 * ArrayCreateByValueListExample2 a1 =new  ArrayCreateByValueListExample2();
		a1.printItem(new int[] {83, 90, 87});
		
		ArrayCreateByValueListExample2 a2 = new ArrayCreateByValueListExample2();
		a2.printItem(new int[] {83, 90, 87});
		
		ArrayCreateByValueListExample2 a3 = new ArrayCreateByValueListExample2();
		a3.printItem(new int[] {83, 90, 87});
		*/

		
	}//main() 메소드(함수)
	
	
}
