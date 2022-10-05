package ch17.sec01.exam01;

//Ctrl + Shift + O
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//Set 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
		//외부반복자
		Iterator<String> itor = set.iterator();//외부반복자얻기 iterator()
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Stream을 이용한 내부반복처리
		Stream<String> stream = set.stream();//stream()
		stream.forEach(name-> System.out.println(name));
		

	}

}
