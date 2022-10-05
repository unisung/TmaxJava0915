package ch16.sec04;

public class MyFunctionExample {
	public static void main(String[] args) {
	 MyFunctionalInter mf
	  = new MyFunctionalInter() {
		@Override
		public void greet(String name) {
			System.out.println(name+"님 방가여");
		}
	};
	
	mf.greet("홍길동");
	//매개변수가 하나인 경우 () 생략가능
	mf = a->System.out.println(a+"님 방가여");
	
	}
}
