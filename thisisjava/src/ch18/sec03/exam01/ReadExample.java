package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
	try {
		  InputStream is = new FileInputStream("c:/temp/test1.db");
		  while(true) {
			  int data = is.read();
			  if(data==-1)break;//파일의 끝을 만나면 read()는 -1을 리턴
			  System.out.println(data);
		  }
		  
	}catch(Exception e) {
		System.out.println(e);
	}

	}
}
