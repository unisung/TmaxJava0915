package ch06.sec13.exam03.package1;

public class A {
	public int field1;//public
	int field2;//default
	private int field3;//private
	
	public A() {//public
		field1= 1;
		field2=1;
		field3=1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}//public
	       void method2() {}//default
	private void method3() {}//private	
}
