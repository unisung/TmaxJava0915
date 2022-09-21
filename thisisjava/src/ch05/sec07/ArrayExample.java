package ch05.sec07;

public class ArrayExample {
	public static void main(String[] args) {
      int[] arr =new int[3];
      
      arr[0] +=10;//arr배열의 첫번째 요소의 값(0)에 10을 더한 값을 첫번째 요소에 저장
      arr[0] +=20;//arr배열의 첫번째 요소의 값(10)에 20을 더한 값을 첫번째 요소에 저장
      arr[0] +=30;//arr배열의 첫번째 요소의 값(30)에 30을 더한 값을 첫번째 요소에 저장
      
      arr[2] +=30;//arr배열의 세번째 요소의 값(0)에 30을 더한 값을 세번째 요소에 저장
      
      for(int i=0;i<arr.length;i++) 
    	  System.out.println(arr[i]);
       
      int result = arr[0] + arr[2];//첫 번째 요소에 저장된 값 + 세번째 요소에 저장된 값 의 결과를 result에 저장
      System.out.println(result);
      
      int[][][] dim3Arr = new int[2][3][3];
      

	}
}
