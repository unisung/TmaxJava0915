package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader=null;
			
			//1문자씩 읽기
			reader = new FileReader("c:/temp/test1.txt");
			while(true) {
				int data = reader.read();//read() char로 읽을 문자를 int로 리턴
				if(data==-1) break;
				System.out.print((char)data);
			}
			reader.close();
			reader = new FileReader("c:/temp/test1.txt");
			System.out.println("--------------------");
			//버퍼
			char[] arr = new char[100];
			while(true) {
				int num = reader.read(arr);//읽은 문자데이타는 arr에 저장되고 저장된 갯수가 num에 리턴
				if(num==-1)break;//파일의 끝이면 -1을 리턴 
				for(int i=0;i<num;i++) {
					System.out.print(arr[i]);
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
