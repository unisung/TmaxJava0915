package ch14.sec03.exam03;

public class BeepPrintExample {
	public static void main(String[] args) {
		//쓰레드생성
		Thread thread = new Thread(new MyThread());
        //쓰레드 실행
		thread.start();//run()메소드가 실행되도록 jvm에 요청
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);}catch(Exception e) {				
			}
		}
	}
}
