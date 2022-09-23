package ch06.sec08;

public class ComputerExample {
	//가변 길이 매개변수 ->  값 입력시는 (값1, 값2,...) => 배열로 생성되어 실행블럭으로 전달.
   int sumAll(int ... args) {
	  int sum=0;
	  System.out.println(args.length);
	  for(int a:args) sum+=a;
	 return sum;
 }
//java compute 1 2 3    
public static void main(String[] args) {
	ComputerExample ce = new ComputerExample();
	int result =ce.sumAll(1,2,3,4,5);//[1][2][3][4][5]
	System.out.println(result);
	
	result =ce.sumAll(1,2,3,4,5,6,7,8,9,10);//[1][2][3][4][5][6][7][8][9][10]
	System.out.println(result);
	//배열도 전달 가능
	System.out.println(ce.sumAll(new int[] {1,2,3,4,5}));
	
}   
   
	
}
