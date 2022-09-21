package ch05.sec06;

public class OneDimensionArrayExample {
	public static void main(String[] args) {
	 //배열의 index번호는 0 부터 시작
     int[] intArr = {1,2,3,4};//[1][2][3][4]
     String[] strArr = {"hello","hi","bye"};
     boolean[] barr = {false, true, true, false};
     float[] fArr = {3.14f,2.4f,5.5f};
     
     for(int i=0;i<fArr.length;i++)
    	 System.out.print(fArr[i]+" ");
     
     intArr[1] = 9;
     for(int i=0;i<intArr.length;i++)
    	 System.out.print(intArr[i]+" ");
     
	}
}
