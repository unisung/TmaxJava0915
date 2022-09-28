package ch07.verify.exam12;

public class Example {
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}

	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {//java15버전에서 추가
			//C c=(C)a;
			c.method2();
		}
	}
}