package ch11.sec04;

import java.util.Scanner;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			  String msg = scanner.nextLine();
			  System.out.println(msg);
		}catch(Exception e) {
			 System.out.println(e);
		}finally {
			scanner.close();
		}
	}
}
