package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import org.json.JSONObject;

public class ChatServer {
	//필드
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom 
	              = Collections.synchronizedMap(new HashMap<>());
	//메소드 서버시작
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		
		Thread thread = new Thread(()-> {
				try {
					while(true) {
						Socket socket = serverSocket.accept();
						SocketClient sc = new SocketClient(this,socket);
					}
				}catch(Exception e) {}
		});
		thread.start();
	}//start()
	
	//클라이언트 연결 종료시 
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName +"@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감: "+key);
		System.out.println("현재 채팅자 수: "+ chatRoom.size()+"\n");
	}//removeSocketClient
	
    public void addSocketClient(SocketClient socketClient) {
    	String key = socketClient.chatName +"@" + socketClient.clientIp;
		chatRoom.put(key,socketClient);
		System.out.println("입장: "+key);
		System.out.println("현재 채팅자 수: "+ chatRoom.size()+"\n");
    }//addSocketClient()
    
    //모든 클라이언트에게 메세지 전송
    public void sendToAll(SocketClient sender, String message) {
    	JSONObject root = new JSONObject();
    	root.put("clientIp",sender.clientIp);
    	root.put("chatName",sender.chatName);
    	root.put("message",message);
    	String json = root.toString();
    	
    	Collection<SocketClient> socketClients = chatRoom.values();
    	for(SocketClient sc:socketClients) {
    		if(sc==sender) continue;//전송자는 제외하고 
    		sc.send(json);//나머지 유저들에게 전송
    	}
    }//sendToAll()
    
    //서버 종료
    public void stop() {
    	try {
    		 serverSocket.close();//서버소켓 종료
    		 threadPool.shutdownNow();//thread Pool 종료
    		 chatRoom.values().stream().forEach(t->t.close());
    		 System.out.println("[서버] 종료됨");
    	}catch (Exception e) {
			System.out.println(e);
		}
    }
}