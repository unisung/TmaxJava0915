package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
 //필드
 Socket socket;//통신주체
 DataInputStream dis;//데이타 출력
 DataOutputStream dos;//데이타 입력
 String chatName;//클라이언트 명
 
 //서버연결
public void connect() throws IOException{
 socket = new Socket("192.168.200.125",50001);//채팅서버의 주소와 포트번호
 dis = new DataInputStream(socket.getInputStream());//스트림객체 얻기
 dos = new DataOutputStream(socket.getOutputStream());//스트림객체 얻기
 System.out.println("[클라이언트] 서버에 연결됨");	 
 }//connect()

//JSON받기
public void receive() {
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			try {
				while(true) {
					String json = dis.readUTF();
					//json객체 생성
					JSONObject root = new JSONObject(json); 
					String clientIp =root.getString("clientIp");
					String chatName =root.getString("chatName");
					String message =root.getString("message");
					System.out.println("<"+chatName+"@"+clientIp+">" +message);
				}
			}catch(Exception e) {
				System.out.println("[클라이언트] 서버 연결 끊김");
				System.exit(0);//프로그램 종료
			}
		}
	});
	
	thread.start();//스레드 실행
}//receive()

//Json보내기
public void send(String json) throws IOException{
	dos.writeUTF(json);
	dos.flush();
}//send()

//연결 종료
public void unconnect() throws IOException{
	socket.close();
}//unconnect()

//메인(실행)
public static void main(String[] args) {
	try {
		  ChatClient chatClient = new ChatClient();
		  chatClient.connect();//서버 연결
		  
		  //
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("대화명 입력: ");
		  chatClient.chatName = scanner.nextLine();//대화명
		  
		  //데이타 전송
		  JSONObject jsonObject = new JSONObject();
		  jsonObject.put("command", "incomming");
		  jsonObject.put("data", chatClient.chatName);
		  String json = jsonObject.toString();
		  chatClient.send(json);
		  //데이타 받기
		  chatClient.receive();
		  
		  System.out.println("------------------------------");
		  System.out.println("보낼 메시지를 입력하고 Enter");
		  System.out.println("채팅을 종료하려명 q를 입력하고 Enter");
		  System.out.println("------------------------------");
		  while(true) {
			  String message = scanner.nextLine();
			  if(message.equalsIgnoreCase("q")) {
				  break;
			  }else {
				  jsonObject = new JSONObject();
				  jsonObject.put("command", "message");
				  jsonObject.put("data", message);
				  json = jsonObject.toString();
				  chatClient.send(json);
			  }
		  }
		  scanner.close();//스캐너 종료
		  chatClient.unconnect();//서버와 연결 종료
	} catch (Exception e) {
		System.out.println("[클라이언트] 서버 연결 안됨");
	}
 }//main()
}