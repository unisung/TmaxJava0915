package ch19.sec03.exam02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerExample {
	//서버소켓 - Socket객체 생성하는 서버소켓
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("------------------------------------------------");
		//서버시작
		startServer();
		//통신작업
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.equalsIgnoreCase("q")) {
				break;
			}
		}
		//서버종료
		stopServer();

	}
	private static void stopServer() {
	  try {
		    serverSocket.close();
		    System.out.println("[서버] 종료됨");
	} catch (Exception e) {
	  System.out.println(e);
	}
		
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
					 
				//데이터 받기
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int readByteCount = is.read(bytes);
				String message = new String(bytes, 0, readByteCount, "UTF-8");
						
				//데이터 보내기
				OutputStream os = socket.getOutputStream();
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println( "[서버] 받은 데이터를 다시 보냄: " + message);
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
