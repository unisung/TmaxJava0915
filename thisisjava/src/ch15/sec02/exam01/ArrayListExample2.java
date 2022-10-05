package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<Board> list = Collections.synchronizedList(new ArrayList<>());
		//객체 저장 add(객체)-append()
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//저장된 객체 수 얻기 size()
		System.out.println(list.size());
		
		//특정 인덱스의 객체 얻기 get(index번호)
		Board board =list.get(0);
		System.out.println(board);
		
		//set(인덱스,객체)
		list.set(0, new Board("제목_new1", "내용_new1", "글쓴이_new1") );
		board =list.get(0);
		System.out.println(board);
		
		//index번호로 삭제 remove(index번호)
		board = list.remove(0);
		System.out.println(board);
		//향상된 for문으로 출력
		for(Board b:list)
			System.out.println(b);
		System.out.println("----------------------");
		
		//객체를 중간에 삽입 add(index번호, 객체)
		list.add(2,new Board("제목_중간삽입", "내용_중간삽입", "글쓴이_중간삽입"));
		
		for(Board b:list)
			System.out.println(b);
		System.out.println("----------------------");
		
		//객체로 삭제 remove(객체) 
		//<- equivalent해야함.(hashCode(), equals()를 재정의)
		boolean isRemoved =
				list.remove(new Board("제목2", "내용2", "글쓴이2"));
		System.out.println(isRemoved?"객체가 삭제됨":"객체가 삭제안됨");
		
		for(Board b:list)
			System.out.println(b);
	
		//list내의 모든 객체 삭제 clear()
		list.clear(); 
		//list가 비어있는지 확인 isEmpty()
		System.out.println(list.isEmpty()?"리스트는 비어있음":"아직 객체가 남아있음");

	}
}
