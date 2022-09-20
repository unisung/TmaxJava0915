package ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) {
		int i=2;
		   
		  aa: while(i<=9) {
			   int j=1;
			   while(true) {
				   System.out.print(i+"x"+j+"= "+(i*j)+" ");
				   if(j==9) {break aa;}
				   j++;
			   }
			  // System.out.println();
			  // i++;
		   }
		  
		  String message = new String("hello");
	}
}