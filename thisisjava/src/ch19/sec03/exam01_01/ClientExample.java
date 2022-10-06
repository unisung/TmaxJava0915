package ch19.sec03.exam01_01;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		try {
			  //연결
			  //Socket socket = new Socket("localhost",5001);
			Socket socket = new Socket("192.168.200.125",5001);
			  System.out.println("[클라이언트] 연결 성공");
			  
			  //종료
			  socket.close();
			  System.out.println("[클라이언트] 연결 끊음");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
