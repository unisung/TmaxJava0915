package ch02.sec13;

//다른패키에 있는 클래스를 현재의 클래스에 적용하는것 import
import java.util.Scanner;

//스캐너 - byte단위의 입력 스트림을 문자열타입으로 변환하여 리턴해주는 객체
public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//byte => String변환
		
		System.out.println("x 값 입력:");
		String strX = scanner.nextLine();//리턴타입 String
		int x = Integer.parseInt(strX);//String -> int로 변환 parseInt()
		System.out.println("입력한 x값:" +x);
		
		System.out.println("y 값 입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		System.out.println("입력한 y값:"+ strY);
		
		int result = x + y;
		System.out.println("x + y:" + result);
		
		
		
	}
}
