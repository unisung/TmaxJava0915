package ch08.sec10.exam02;

import java.util.Date;

public class MainExample {
	public static void main(String[] args) {
		A[] arr = new A[4];// [null][null][null][null][null]
		arr[0] = new B();// A()
		arr[1] = new C();// A()
		arr[2] = new D();// A()
		arr[3] = new E();// A()
		
		for(A a:arr)
			a.action();
	}
}
