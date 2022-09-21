package ch05.sec04;

public class GarbageNullExample {
	public static void main(String[] args) {
		//객체 초기화 값 null
		String str1=null;
		//System.out.println(str1.length());//참조하는 객체가 없으므로(null) 접근시 오류발생
		str1=new String("홍길동");
		System.out.println(str1.length());
		
		//str1이 참조하는 객체와의 연결을 해제함(null이 됨)
		// 이때, new String("홍길동");에 의해 생성된 객체는 garbage가 됨
		// 이 객체는 garbage가 되었지만 즉시 제거되지는 않음.
		// garbage collector의 스케줄에 의해 제거됨.
		// 참고 - https://j2wooooo.tistory.com/121
		str1=null;
		System.out.println(str1.length());
		
		String str2 = new String("홍길동");
		
	}
}
