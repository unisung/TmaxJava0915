package ch12.verify.exam08;

import java.io.FileWriter;//문자단위 출력 스트림

public class FileWriterExample2 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("c:/temp/file.txt");) {
			fw.write("Java");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}