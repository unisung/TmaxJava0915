package ch09.verify.exam07;

public class Chatting {
 class Chat{
	 void start() {}
	 void sendMessage(String message) {}
 }
 //로컬변수로서의 내부클래스 Chat
 void startChat(final String chatId) {
   final String nickName = chatId;
  //nickName = chatId;
  //로컬 클래스
  Chat chat = new Chat() {
	  void start() {
		  while(true) {
			  String InputData = "안녕하세요";
			  String message = "["+nickName+"]"+InputData;
			  sendMessage(message);
		  }
		  
	  }
  };
  chat.start();
 }
}
