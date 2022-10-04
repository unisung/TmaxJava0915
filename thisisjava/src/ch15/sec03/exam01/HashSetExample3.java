package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
	  Set<Board> set = new HashSet<>();
	//객체 저장 add(객체)-append()
	  Board board = new Board(1,"제목1", "내용1", "글쓴이1");
	  set.add(board);
	  set.add(new Board(2,"제목2", "내용2", "글쓴이2"));
	  set.add(new Board(3,"제목3", "내용3", "글쓴이3"));
	  set.add(new Board(4,"제목4", "내용4", "글쓴이4"));
	  set.add(new Board(5,"제목5", "내용5", "글쓴이5"));
	  
	  System.out.println(set.size());
	  //문자열일때 출력
	  System.out.println(set);
	  System.out.println("---------------------------------");
	  
	  Board board1 = new Board(1,"제목1", "내용1", "글쓴이1");
	  set.add(board1);
	  
	  System.out.println(set.size());
	  //문자열일때 출력
	  System.out.println(set);
	}
}
