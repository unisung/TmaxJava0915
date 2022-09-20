package ch04.sec07;

public class BreakOutterExample2 {
	public static void main(String[] args) {
	// 라벨: 바깥반복문{ 안쪽 반복문 { break 라벨; }} 
outter: for(char upper='A';upper<='Z';upper++) {
    	  for(char lower='a'; lower<='z';lower++) {
    		   System.out.println(upper + " - " + lower);
    		   if(lower=='g') {
    			   break outter;
    		   }
    	  }//안쪽 for문 끝.
      }//바깥쪽 for문 끝.
     System.out.println("프로그램 실행 종료");
	}
}
