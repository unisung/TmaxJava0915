package ch12.verify.exam08;

import java.io.FileWriter;//문자단위 출력 스트림
import java.util.Scanner;

public class FileWriterExample2 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("c:/temp/file.txt");
			Scanner scanner = new Scanner(System.in);) {
			System.out.println("메세지를 입력하세요");
			
			String msg = scanner.nextLine();
			fw.write(msg);
			throw new Exception();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}