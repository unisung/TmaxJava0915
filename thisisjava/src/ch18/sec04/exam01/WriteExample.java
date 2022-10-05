package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		try {
			//2byte단위 출력 스트림
			Writer writer = new FileWriter("c:/temp/test1.txt");
			
			char a='A';
			writer.write(a);
			char b='B';
			writer.write(b);
			
			//char배열
			char[] arr= {'C','D','E'};
			writer.write(arr);
			
			//String
			writer.write("FGH");
			
			//버퍼비우기
			writer.flush();
			//출력스트림 닫기
			writer.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
