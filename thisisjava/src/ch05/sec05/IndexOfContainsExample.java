package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		//indexOf("문자열패턴") - 해당 패턴이 시작되는 index위치 값
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		//lastIndexOf("패턴") 해당 패턴의 제일 마지막 위치
		String subject1 = "자바 프로그래밍 자바 또 자바";
		System.out.println(subject1.lastIndexOf("자바"));
		
		// 해당패턴이 문자열 내에 없으면 리턴 값은 -1이 됨.
		System.out.println(subject.indexOf("java"));
		
		if(location > -1 ) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		//문자열내에 특정패턴이 있으면 true, 아니면 false
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련 없는 책");
		}
		
		

	}
}
