package ch04.sec02;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;//0~19, 80~100
		System.out.println("점수: " + score);
		
		String grade;
		//중첩(nested)if~else문
		if(score >=90) {//90~100사이의 값 비교
			if(score>95) {
				grade = "A+";
			}else if(score<95) {
				grade = "A-";
			}else {
				grade = "A0";
			}
		}else {//90미만인경우
			if(score>85) {
				grade = "B+";
			}else if(score <85) {
				grade = "B-";
			}else {
				grade = "B0";
			}
		}
		System.out.println("학점: " +grade);
	}
}
