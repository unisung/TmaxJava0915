package ch07.sec06.package1;

public class B {
 void m1() {
  A a=new A();//생성자는 클래스의 접근제한을 따름	
              //protected로 강제 선언하더라도 같은 패키지라서 접근 가능
  //같은 패키지(protected) 접근 가능
  a.field="A";
  //같은 패키지(protected)접근 가능
  a.method();
}
}
