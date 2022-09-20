package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10;i++) {
			//if문블럭내에 명령문이 하나만 있으면 블럭 {}을 생략가능
			if(i%2==0) //짝수이면
				 continue;//continue문을 만나면 그 이후 명령문은 실행하지 않고 다음 증가부분으로 이동함
			System.out.print(i +" ");
		}//for문 끝.
	}
}
