package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {

	 for(int m=2;m<=9;m++) {
		 for(int n=1;n<=9;n++) {
			 System.out.print(m+"x" + n +"="+(m*n)+"\t");
		 }
		 System.out.println();
	 }
	}
}
