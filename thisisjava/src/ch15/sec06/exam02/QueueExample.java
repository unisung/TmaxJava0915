package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메시지 넣기 - FIFO
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "김자바"));
		
		//메세지를 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();//제일 앞의 요소 추출
			switch(message.command) {
			case "sendMail": 
				   System.out.println(message.to+"에게 메일 전송"); 
				   break;
			case "sendSMS": 
				   System.out.println(message.to+"에게 문자 전송");
				break;
			case "sendKakaotalk": 
				System.out.println(message.to+"에게 카톡 전송");
				break;
			}
		}
	}
}