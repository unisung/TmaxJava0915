package ch04.sec07;

//두개의 주사위를 던져서 두 눈의 합이 6이 될때 반복문을 빠져나가도록 수정하시오.
// x + y = 6( 1<= x <=6, 1 <= y <=6), (1,5), (2,4),(3,3),(4,2),(5,1)
public class BreakExample2 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1; // 1 <= 범위 < 7
			int num2 = (int)(Math.random()*6) + 1; // 1 <= 범위 < 7
			System.out.print("num1: "+ num1+", num2: "+num2+"\n");
			if(num1+num2 == 6) {
				break;//while문을 빠져나가는 명령문
			}
		}
		System.out.println("프로그램 종료");
	}
}
