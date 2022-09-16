package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple =1;
		double pieceUnit = 0.1;
		int number =7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
		System.out.println("-----------------------");
		
		//실수 계산시 소수점의 자리수만큼 10의 배수로 곱한  후 연산한 결과를 다시 10의 배수만큼 나눠서 실수로 변환처리.
		int totalPieces = apple*10;
		int result2 = totalPieces - number;
		System.out.println("사과 1개에서 남은 양: " + result2/10.0);
	}
}
