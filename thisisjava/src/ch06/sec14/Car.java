package ch06.sec14;

public class Car {
   //필드
	//숫자타입 필드
	private int speed;
	//불리언타입 필드
	private boolean stop;
	//
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <0) {
			this.speed=0;
			return;
		}else {
		 this.speed = speed;
		}
	}
	//is+boolean필드 =>isStop()
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) this.speed=0;
	}
}
