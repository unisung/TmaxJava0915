package ch17.sec04;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	static int sum=0;
	public static void main(String[] args) {
		//배열로 부터
		String[] strArray = {"홍길동","신용권","김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(t-> System.out.println(t));
	    //int 타입 
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(t-> System.out.println(t));
		//int범위
		IntStream iStream = IntStream.rangeClosed(1, 100);
		iStream.forEach(value -> sum +=value);
		System.out.println(sum);
		
		
		
		
		
		
	}
}
