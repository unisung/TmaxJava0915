package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample3 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",10),
				new Student("신용권",20),
				new Student("유미선",30)
				);
		//향상된 for문
		for(Student s:list) System.out.println(s);
		
		//2. dot(.) notation
		double avg = list.stream()
				         .mapToInt(student->student.getScore())
				         .average()
				         .getAsDouble();
		
		System.out.println("평균: "+avg);
				
		
		
		
		
	}
}