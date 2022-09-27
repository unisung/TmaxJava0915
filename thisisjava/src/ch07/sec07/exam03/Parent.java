package ch07.sec07.exam03;

public class Parent {
  public String field1;
  public void method1() {System.out.println("부모 메소드method1");}
  public void method2() {
	  this.method1();
	  System.out.println("부모 메소드method2");
	 }
  public void method4(int a) {System.out.println(a);}
}
// <---------------------
//자식클래스에서 해당 클래스내의 다른메소드 호출시 this.
//자식클래스에서 부모 클래스내의 메소드 호출시 super.
class Child extends Parent{
  @Override
  public void method2() {
	  super.method2();//여기서 super는 부모메소드를 호출하는 키워드 
	  System.out.println("자식 메소드method2");
	  super.method4(10);
	  }
  public void method3() {
	  this.method2();
	  System.out.println("자식 메소드method3");}	
}
