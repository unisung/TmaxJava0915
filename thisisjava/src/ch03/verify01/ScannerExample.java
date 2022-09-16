package ch03.verify01;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//초를 입력받고 입력받은 초를 시 분 초로 나눠서 출력하는 p/g
		//예) 5000초 = 1시간 23분 
		//반복문으로 계속 할지여부 확인 후 "q"를 입력받으면 종료하도록 작성
	   Scanner scanner = new Scanner(System.in);
	   
	   while(true) {
		   System.out.println("입력할 초(seconds):");
		   String inputData = scanner.nextLine();
		   if(inputData.equals("q")) {
			   break;
		   }
		   int minutes = Integer.parseInt(inputData);
		   int result1 = (minutes%3600)/60;//분
		   int result2 = minutes%60;//초
		   int result3 = minutes/(60*60);//시간
		   System.out.printf("%d초는 %d시간 %d분 %d초\n",minutes,result3,result1,result2);
	   }
	}
}
