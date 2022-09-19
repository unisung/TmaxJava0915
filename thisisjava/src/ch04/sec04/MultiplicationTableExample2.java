package ch04.sec04;

public class MultiplicationTableExample2 {
	public static void main(String[] args) {

	 for(int m=1;m<=9;m++) {
		 for(int n=2;n<=9;n++) {
			 System.out.print(n+"x" + m +"="+(m*n)+"\t");
		 }
		 System.out.println();
	 }
	}
}
