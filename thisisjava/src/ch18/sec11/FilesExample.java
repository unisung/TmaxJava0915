package ch18.sec11;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
	public static void main(String[] args) {
		try {
			 String data = ""+
		            "id: winter\n" +
					"email: winter@mycompany.com\n"+
		            "tel: 010-123-1234";
			 
		Path path = Paths.get("c:/tmp/user.txt");
			 //File
		Files.writeString(path, data, Charset.forName("UTF-8"));
			
		//
	   System.out.println("파일 유형: "+Files.probeContentType(path));
	   System.out.println("파일 크기: "+Files.size(path)+"bytes");
	   
	   //파일 읽기
	   String content = Files.readString(path, Charset.forName("UTF-8"));
	   System.out.println(content);
	   
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
