package ch06.verify.exam17;

//메소드 오버loading
public class Printer {
	static void println(int value) {System.out.println(value);}
	static void println(boolean value) {System.out.println(value);}
	static void println(double value) {System.out.println(value);}
	static void println(String value) {System.out.println(value);}
	
public static void main(String[] args) {
	//객체를 만들지 않고 클래스명.메소드()로 접근
	Printer.println(10);
	Printer.println(true);
	Printer.println(5.7);
	Printer.println("홍길동");
}	
}
