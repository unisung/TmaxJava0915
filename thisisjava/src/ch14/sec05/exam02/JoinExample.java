package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		//쓰레드 메소드 실행 - 쓰레드.start()
		sumThread.start();
		try {
		sumThread.join();//쓰레드 결과를 얻고싶을 때 대기하는 메소드 join()
		}catch(InterruptedException e) {}
		System.out.println("1~100 합: "+sumThread.getSum());
	}
}