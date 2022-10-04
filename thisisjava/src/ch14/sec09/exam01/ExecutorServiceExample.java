package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
	 //ExecutorService executorService = Executors.newCachedThreadPool();
	 ExecutorService executorService 
	             = Executors.newFixedThreadPool(5);//5개
	 
	 //작업
	 //쓰레드풀 종료
	 executorService.shutdown();
       
	}
}
