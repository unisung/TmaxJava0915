package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        
		//문자열 분리
		String[] tokens = board.split(",");
		
		//인덱스 별로 읽기
		int i=0;
		System.out.println("번호:"+tokens[i++]);
		System.out.println("제목:"+tokens[i++]);
		System.out.println("내용:"+tokens[i++]);
		System.out.println("성명:"+tokens[i++]);
		
		//반복문으로 읽기
	  for(i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		
		
		
	}
}
