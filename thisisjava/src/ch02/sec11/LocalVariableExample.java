package ch02.sec11;

public class LocalVariableExample {
	int x=10;//전역
 // [접근제한자] 리턴타입 메소드명(매개변수){실행문;}
 public int method1() {
	 int x=10;//로컬
	 return x;}
 public void method2() {
	 int x=10;//로컬
	 System.out.println(x);
 }
 public void method3(int x) {}//(int x)의 x도 local변수
 int method4(int x) {////(int x)의 x도 local변수
	                  return x;}
}
