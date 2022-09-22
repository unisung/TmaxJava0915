package ch04.sec03;

public class SwitchExample2 {
	public static void main(String[] args) {
		int menu=1;
		
		switch(menu) {
		case 1: 
			 for(int i=0;i<=5;i++)
				 System.out.print(i+" ");
			break;
		
		case 2: System.out.println("끝"); break;
		}
		
		System.out.println("프로그램 종료");

	}

}
