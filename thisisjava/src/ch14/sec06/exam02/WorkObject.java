package ch14.sec06.exam02;

public class WorkObject {
	//동기화 메소드에서 wait(), notify() 실행
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();//일시대기 -> 대기열로 이동
		try {
			  wait();//일시대기
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify();
		try {
			  wait();
		}catch(InterruptedException e) {}
	}
	
}
