package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
	//DataOutputStream생성
	FileOutputStream fos 
	          = new FileOutputStream("c:/temp/primitive.db");
	//보조스트림 new 보조스트림(기본스트림);
	DataOutputStream dos = new DataOutputStream(fos);
    
	//기본타입 출력
	dos.writeUTF("홍길동");//문자열
	dos.writeDouble(95.5);//실수
	dos.writeInt(1);//정수
	
	dos.flush(); dos.close(); fos.close();
	
	//DataInputStream 생성
 FileInputStream fis = new FileInputStream("c:/temp/primitive.db");
 DataInputStream dis = new DataInputStream(fis);
 
   String name = dis.readUTF();
   double score = dis.readDouble();
   int order = dis.readInt();
   
   System.out.println(name+" : "+ score + " : "+ order);
   
   dis.close();
   fis.close();

	}
}
