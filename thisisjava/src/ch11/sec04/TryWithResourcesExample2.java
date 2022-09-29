package ch11.sec04;

import java.util.Scanner;

public class TryWithResourcesExample2 {
	public static void main(String[] args) {
		//Autocloseable인터페이스로 구현된 객체만
		//with-resources구문으로 사용가능
		try(Scanner scanner = new Scanner(System.in);){
			  String msg = scanner.nextLine();
			  System.out.println(msg);
		}catch(Exception e) {
			 System.out.println(e);
		}
	}
}