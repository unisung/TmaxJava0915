package ch14.sec06.exam02;

public class WaitNotifyExample {
	public static void main(String[] args) {
		//공유객체
		WorkObject workObject = new WorkObject();
		//공유객체(임계영역)를 이용하여 쓰레드객체 생성
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();

	}
}
