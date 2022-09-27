package ch07.sec03.exam01;

public class Parent {
   void m1() {}
}

//부모클래스에서의 접근제한자보다 좁게는 할수 없음. 넓게는 가능.
class Child extends Parent{
  //private void m1() {}
	public void m1() {}
}
