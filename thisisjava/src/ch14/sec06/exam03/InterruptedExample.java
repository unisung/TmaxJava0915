package ch14.sec06.exam03;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);//thread 일시정지
		}catch(Exception e) {}
		thread.interrupt();//인터룹트 처리
	}
}
