package ch05.sec12;

public class HelloWorld {
	HelloWorld(){}
	HelloWorld(String msg){}
	
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld("hello");
		HelloWorld h2 = new HelloWorld();
	}
}
