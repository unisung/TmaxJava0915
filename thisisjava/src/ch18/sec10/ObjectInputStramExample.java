package ch18.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStramExample {
 public static void main(String[] args) throws Exception {
    //기본스트림
	FileInputStream fis = new FileInputStream("c:/temp/object.dat");
    //new 보조스트림(기본스트림)
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	//객체 복원
	Member m1 = (Member)ois.readObject();	 
    //자원해제
	ois.close(); fis.close();
    //복원객체 내용 출력
     System.out.println(m1.toString());
	
	}
}
