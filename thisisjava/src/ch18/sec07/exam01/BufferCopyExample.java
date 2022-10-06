package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferCopyExample {
	public static void main(String[] args) throws Exception{
	 //입출력 스트림 생성
	String originalFilePath1 = BufferCopyExample.class
			                   .getResource("originalFile2.jpg")
			                   .getPath();	
	//System.out.println(originalFilePath1);
	String targetFilePath = "c:/temp/targetFile2.jpg";
	
	FileInputStream fis = new FileInputStream(originalFilePath1);
	FileOutputStream fos = new FileOutputStream(targetFilePath);
	//보조스트림
	BufferedInputStream bis = new BufferedInputStream(fis);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	
	long bufferTime = copy(fis,fos);
	System.out.println("버퍼 사용:\t"+bufferTime+" ns");
	
	fis.close();
	fos.close();
	bis.close();
	bos.close();
	}
public static long copy(InputStream is, OutputStream os) throws Exception{
	 //시작시간
	 long start = System.nanoTime();
	 
	 //복사작업 
	 while(true) {
		  int data = is.read();
		  if(data==-1) break;
		  os.write(data);
	  }
	  os.flush();
	  
	//끝시간
	long end = System.nanoTime();
	//작업에 걸린시간
	return end - start;
	}
}
