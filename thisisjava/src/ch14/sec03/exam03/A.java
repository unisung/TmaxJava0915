package ch14.sec03.exam03;

public class A {
	
public static void main(String[] args) {
	Thread thread = new Thread(new B());
	System.out.println(thread.getName());
	
	thread.setName("mythread");
	System.out.println(thread.getName());
	
	Thread thread1=null;
	for(int i=0;i<10;i++) {
		 thread1= new Thread();
		 thread1.setName("Mythread-"+i);
		 System.out.println(thread1.getName());
		 
	}
}
}
class c extends Thread{}
//Runnable인터페이스로 구현된 클래스
class B extends A implements Runnable {
	@Override
	public void run() {
		
	}
}


