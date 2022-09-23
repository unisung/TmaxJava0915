package ch05.verify;

import java.util.Scanner;

public class Exam09 {
	static int[] scores;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run=true;
	 while(run) {
		printMenu();
		
		String menu = scanner.nextLine();
		switch(menu) {
		case "1": createArray();
		          break;
		case "2": inputScores();
			       break;
		case "3": scorelist();
			      break;
		case "4": analyzes();
			       break;
		case "5": run=!run; break;
		}
	 }
	 System.out.println("프로그램 종료");
	}
	
	static void printMenu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트|4. 분석 |5. 종료");
		System.out.println("---------------------------------------------");
		System.out.println("선택>");
	}
	static void createArray() {
		System.out.println("배열생성"); 
		System.out.println("학생수>");
		int length = Integer.parseInt(scanner.nextLine());
		scores=new int[length];
		System.out.println("생성된 배열의 길이: "+scores.length);
	}
	static void inputScores() {
		if(checkNull()){
		for(int i=0;i<scores.length;i++) {
			System.out.print("scores["+i+"]>");
			int score = Integer.parseInt(scanner.nextLine());
			scores[i] = score;
			System.out.println((i+1)+"번째 점수:"+score);
		 }
		System.out.println("입력 완료");
		}
    }
	static void scorelist() {
		if(checkNull()) {
		for(int i=0;i<scores.length;i++)
			System.out.println("scores["+i+"]>"+scores[i]);
		}
		System.out.println();
	}
	static void analyzes() {
		int max=0;
		for(int i=0;i<scores.length;i++) {
			if(max<scores[i])
				max=scores[i];
		}
		int sum=0;
		for(int score:scores)
			sum+=score;
		System.out.println("최고 점수: "+max);
		System.out.printf("평균: %5.2f\n",((double)sum/scores.length));
			
	}
	
	static boolean checkNull() {
		if(scores==null) {
			System.out.println("먼저 배열을 생성후 입력하세요");
			return false;
		}else {
			return true;
		}
	}
}
