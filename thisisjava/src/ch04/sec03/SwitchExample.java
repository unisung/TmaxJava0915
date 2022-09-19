package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		System.out.println("주사위 번호: " +num);
		
		switch(num) {
		case 1: System.out.println("1번이 나왔습니다."); break;//블럭(if문,switch문,반복문)을 빠져나가는 명령문
		case 2: System.out.println("2번이 나왔습니다."); break;
		case 3: System.out.println("3번이 나왔습니다."); break;
		case 4: System.out.println("4번이 나왔습니다."); break;
		case 5: System.out.println("5번이 나왔습니다."); break;
		default:System.out.println("6번이 나왔습니다."); break;	
		}
	}
}
