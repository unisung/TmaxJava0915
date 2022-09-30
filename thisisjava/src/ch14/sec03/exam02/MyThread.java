package ch14.sec03.exam02;

//Thread클래스 상속
public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("비프");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
