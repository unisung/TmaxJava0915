package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
	try {
		  OutputStream os = new FileOutputStream("c:/temp/test1.db");
		  byte a=10;
		  byte b=20;
		  byte c=30;
		  
		  os.write(a);//byte단위로 파일에 저장
		  os.write(b);
		  os.write(c);
		  
		  os.flush();
		  os.close();
	}catch(Exception e) {
		System.out.println(e);
	}

	}
}
