package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
 void method() {
	 A a=new A();
	  a.field1=10;
	  //private는 같은 패키지에서도 접근 불가
	  //a.field3=10;
	  //default접근제한자는 다른패키지에서 접근 불가
	   // a.field2=10;
	  
	  a.method1();
	  //defaul접근제한자 로 선언된 메소드는 다른패키지에서 접근불가
	  //a.method2();
	  //private 접근제어자로 선언된 메소드는 같은 패키지에서도 접근불가
	  //a.method3();
 }

}
