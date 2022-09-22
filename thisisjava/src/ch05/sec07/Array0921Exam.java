package ch05.sec07;

public class Array0921Exam {

	public static void main(String[] args) {
		String[] names = {"홍길동","일지매","임꺽정","김길동"};
		int[][] scores = {{80,83,85},{86,90,92},{88,87,95},{80,87,90}};
		int kTotal=0,eTotal=0,mTotal=0;
		System.out.println("------------------성적표--------------");
		System.out.print("|이름\t|국어\t|영어\t|수학\t|총점");
		System.out.println("\n-------------------------------------");

		
		for(int i=0;i<scores.length;i++) {
			int sum=0;
			System.out.print("|"+names[i]+"\t|");
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+"\t|");
				sum+=scores[i][j];
			}
			kTotal+=scores[i][0];
			eTotal+=scores[i][1];
			mTotal+=scores[i][2];
		    System.out.println(sum);
		}
		System.out.println("-------------------------------------");
		System.out.print("|총합\t|"+kTotal+"\t|"+eTotal+"\t|"+mTotal+"\t|"+(kTotal+eTotal+mTotal));
		
		System.out.println("\n-------------------------------------");

	}
}
