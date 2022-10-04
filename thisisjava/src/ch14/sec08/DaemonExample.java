package ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//데몬스레드로 지정
		autoSaveThread.setDaemon(true);
		System.out.println(autoSaveThread.isDaemon());//데몬쓰레드 여부확인
		autoSaveThread.start();
		try {
			 Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("메인 스레드 종료");
	}
}
