package ch19.sec03.exam02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClientExample {
	public static void main(String[] args) {
		try {
			  //연결
			  //Socket socket = new Socket("localhost",5001);
			Socket socket = new Socket("192.168.200.125",5001);
			  System.out.println("[클라이언트] 연결 성공");
			  
			//데이터 보내기
	 		String sendMessage = "나는 자바가 좋아~~";
	 		OutputStream os = socket.getOutputStream();
	 		byte[] bytes = sendMessage.getBytes("UTF-8");
	 		os.write(bytes);
	 		os.flush();
	 		System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

	 		//데이터 받기
	 		InputStream is = socket.getInputStream();
	 		bytes = new byte[1024];
			int readByteCount = is.read(bytes);
			String receiveMessage = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
				
				
			  
			  //종료
			  socket.close();
			  System.out.println("[클라이언트] 연결 끊음");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
