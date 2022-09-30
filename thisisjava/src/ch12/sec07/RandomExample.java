package ch12.sec07;

import java.util.Arrays;
import java.util.Random;// 0.0<= 난수 <1.0

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
	    
		//seed가 같으면 반복할때마다 똑같은 난수 결과 발생
		//seed가 없거나 다르면 반복할때마다 다른 난수 결과 발생
		Random random = new Random(3);
		System.out.println("선택번호: ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(selectNumber));
	}
}
