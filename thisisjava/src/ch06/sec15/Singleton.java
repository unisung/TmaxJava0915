package ch06.sec15;

public class Singleton {
	//private 접근 권한을 가진 static필드 선언
	private static Singleton instance;//
	
	//private 접근 권한을 가진 생성자 선언
	private Singleton() {}

	//public 접근 권한을 가진 static메소드 선언
	public static Singleton getInstance() {
		if(instance==null) instance=new Singleton();//lazy init
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println(single1==single2?"동일 객체 참조":"다른객체 참조");
	}
}
