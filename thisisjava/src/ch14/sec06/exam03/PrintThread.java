package ch14.sec06.exam03;

public class PrintThread extends Thread {
    private boolean stop;//초기값 false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
	 try {
	   while(!stop) {
		   System.out.println("실행 중");
		   Thread.sleep(1);//잠시대기 상태
	   }
	 }catch(Exception e) {} 
	   System.out.println("리소스 정리");
	   System.out.println("실행 종료");
	}
}
