package ch19.sec03.exam01;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	//서버소켓 - Socket객체 생성하는 서버소켓
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("------------------------------------------------");
		
		startServer();

	}
	//
	private static void startServer() {
		Thread thread = new Thread(){
			@Override
			public void run() {
			  	try {
					  serverSocket = new ServerSocket(5001);
					  System.out.println("[서버] 시작됨");
					  //대기중에 client요청이 오면 Socket생성
				 while(true) {
					 System.out.println("\n[서버] 연결 요청을 기다림\n");
					 Socket socket = serverSocket.accept();
					 //연결정보 얻기
					 InetSocketAddress isa 
					    =(InetSocketAddress)socket.getRemoteSocketAddress();
					 System.out.println("\n[서버]"+ isa.getHostName()+"의 연결 요청을 수락함");
					 //
					 ///작업
					 //종료
					 socket.close();
					 System.out.println("[서버]" +isa.getHostName()+"의 연결을 끊음");
				 }
					  
				} catch (Exception e) { System.out.println(e);
				}
			}
		};
		//쓰레드 실행
		thread.start();
	}
}
