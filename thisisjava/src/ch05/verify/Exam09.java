package ch05.verify;

import java.util.Scanner;

public class Exam09 {
	//필드(global) 선언 후 명시적으로 초기화하지 않더라도 jvm이 자동으로 초기화를 해줌
	static int[] scores;//null로 초기화
	static Scanner scanner = new Scanner(System.in);//스캐너객체로 초기화
	
	public static void main(String[] args) {
	  //메소드안에서 선언된 local변수는 선언 후 초기하를 해줘야 사용가능
		boolean run =true;
	  //반복문
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트|4. 분석 |5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			
			String menu = scanner.nextLine();
			switch(menu) {
			case "1": System.out.println("학생수>");
			          //배열 생성
			         try {
			          int length = Integer.parseInt(scanner.nextLine());
			          scores = new int[length];
			          System.out.println("생성된 배열의 길이: "+scores.length);
			          }catch(Exception e) {
			        	  System.out.println("숫자를 입력하세요");
			          }
			          break;
			case "2"://반복  
				     if(scores==null) {
				    	  System.out.println("배열을 먼저 생성 후 실행하세요");
				     }else {
					     for(int i=0;i<scores.length;i++) {
					           System.out.print("scores["+i+"]>");
					           scores[i] = scanner.nextInt();
				          }
					     for(int score:scores)
					    	 System.out.print(score+" ");
					     System.out.println("\n완료");
				     }
				       break;
			case "3": if(scores==null) {
		    	      System.out.println("배열을 먼저 생성 후 실행하세요");
		              }else {
				      int i=0;
				      for(int score:scores)
		    	 	     System.out.println("scores["+(i++)+"]:"+score);
				        System.out.println("완료");
		              }
				       break;
			case "4":if(scores==null) {
		    	     System.out.println("배열을 먼저 생성 후 실행하세요");
		          }else {  
				     int max=0; int sum=0;
			           for(int j=0;j<scores.length;j++) {
			        	   sum +=scores[j];
						if(max<scores[j])
							max=scores[j];
			            }
			          System.out.println("최고 점수: "+max);
			   		  System.out.printf("평균: %5.2f\n",
			   				            ((double)sum/scores.length));
		          }
				       break;
			case "5":  System.out.println("종료");
			           run=!run;
				       break;
		    default: System.out.println("1~5까지의 수만 입력하세요");
			}
		}
	   System.out.println("프로그램 종료");
	}
}
