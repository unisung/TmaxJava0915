package ch01;

public class TypeOverflowExam {
	public static void main(String[] args) {
		byte b=127;
		for(int i=1;i<=400;i++) {
			System.out.println("i의 값:"+i+" byte타입의 값:"+(byte)(b+i));
		}
	}
}
