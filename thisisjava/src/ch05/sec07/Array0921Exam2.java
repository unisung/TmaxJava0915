package ch05.sec07;

public class Array0921Exam2 {

	public static void main(String[] args) {
		String[] names = {"홍길동","일지매","임꺽정","김길동"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95},{80,87,90}};
		int[] total = new int[3];
		int grandTotal=0;
		
		System.out.println("------------------성적표-----------------------");
		System.out.print("|이름\t|국어\t|영어\t|수학\t|총점\t|평균");
		System.out.println("\n----------------------------------------------");

		
		for(int i=0;i<scores.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"\t|");
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+"\t|");
				sum+=scores[i][j];
				total[j]+=scores[i][j];
				grandTotal+=scores[i][j];
			}
		    System.out.print(sum+"\t|");
		    System.out.printf("%5.2f\n",((double)sum/scores[i].length));
		}
		System.out.println("----------------------------------------------");
		System.out.print("|총 합\t|");
		for(int i=0;i<total.length;i++) {
			System.out.print(total[i]+"\t|");
		}
		System.out.printf("%d \t|%5.2f\n",grandTotal,((double)grandTotal/(scores.length*scores[0].length)));
		System.out.println("----------------------------------------------");
	}
}
