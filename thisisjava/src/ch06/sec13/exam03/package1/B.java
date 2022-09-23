package ch06.sec13.exam03.package1;

public class B {
 A a=new A();
 //a.field1=0;
 
 void method() {
  A a=new A();
  a.field1=10;
  //private는 같은 패키지에서도 접근 불가
  //a.field3=10;
  
  a.method1();
  a.method2();
  //private 접근제어자로 선언된 메소드는 같은 패키지에서도 접근불가
  //a.method3();
  
 }
}
