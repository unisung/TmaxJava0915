package ch11.sec03;

public class ExceptionHandlingExample4 {
	public static void main(String[] args) {
	  try {
		  int[] arr = new int[2];
		  arr[0]=10; arr[1]=20; arr[2]=30;
		  arr[0] = Integer.parseInt("삼");
	//동일레벨의 예외 클래스는 | 로 같이 사용 가능	  
	}catch (IndexOutOfBoundsException | NumberFormatException e) {
		  System.out.println(e);
	}catch (Exception e) {//상위 예외 클래스가 아래로 와야함
		System.out.println(e);
	} finally {
		System.out.println("반드시 실행");
	}
  }
}
