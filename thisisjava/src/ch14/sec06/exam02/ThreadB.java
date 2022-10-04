package ch14.sec06.exam02;

public class ThreadB extends Thread {
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
		System.out.println(getPriority());
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodB();
		}
	}
}
