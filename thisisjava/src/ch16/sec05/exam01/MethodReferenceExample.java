package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
	  Person person = new Person();
	  //메소드 참조
	  person.action((x,y) ->Computer.staticMethod(x, y));
	  person.action(Computer::staticMethod);//static메소드 참조 ::
	  
	  //인스턴스 메소드 참조
	  Computer com = new Computer();
	  person.action((x,y) ->com.instanceMethod(x, y));
	  person.action(com::instanceMethod);
	}
}
