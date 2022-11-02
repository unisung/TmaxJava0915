package ch20.oracle.boards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import ch20.boards.Board;

public class BoardExample4 {
	Scanner scanner = new Scanner(System.in);
	Connection conn=null;
	public static void main(String[] args) {
	  BoardExample4 boardExample = new BoardExample4();
	  boardExample.list();
	}

public void list() {
System.out.println();
System.out.println("[게시물 목록]");
System.out.println("----------------------------------------------------------");
System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
System.out.println("----------------------------------------------------------");
//
try {
     conn=getConnection();
	//3. sql문작성 dbms에 전달
	  String sql="select bno, bwriter,bdate,btitle from "
	  		   + " boards order by bno desc";

	//3-2. 쿼리문 전달객체 생성
	 PreparedStatement pstmt = conn.prepareStatement(sql);
   
	//3-3. 쿼리문 전달 및 실행 
	 ResultSet rs =pstmt.executeQuery();
	 while(rs.next()) {
	   Board board = new Board();
	   board.setBno(rs.getInt("bno"));
	   board.setBtitle(rs.getString("btitle"));
	   board.setBwriter(rs.getString("bwriter"));
	   board.setBdate(rs.getDate("bdate"));
	
	   System.out.printf("%-6s%-12s%-16s%-40s \n",
			             board.getBno(),
			             board.getBwriter(),
			             board.getBdate(),
			             board.getBtitle());
	 }
   }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }finally {
		 try {
			 conn.close();
		 }catch (Exception e) {
          System.out.println(e.getMessage());
		}
	 }
	 mainMenu();		
 }//list() 끝.

public void mainMenu() {
System.out.println();
System.out.println("----------------------------------------------------------");
System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
System.out.println("----------------------------------------------------------");
System.out.print("메뉴 선택: ");
String menuNo =scanner.nextLine(); 
System.out.println();	


switch(menuNo){
case "1" : create(); break;
case "2" : read(); break;
case "3" : clear(); break;
case "4" : exit(); break;
}
	
}

private void exit() {System.exit(0);}
public void clear() {System.out.println("***clear()메소드 실행 "); list();}
public void read() {System.out.println("***read()메소드 실행 ");  list();}
public void create() {
	System.out.println("***create()메소드 실행 "); 
//입력받기
Board board = new Board();
System.out.println("[새 게시물 입력]");
System.out.print("제목: ");
board.setBtitle(scanner.nextLine());
System.out.print("내용: ");
board.setBcontent(scanner.nextLine());
System.out.print("작성자: ");
board.setBwriter(scanner.nextLine());

try {
	 conn=getConnection();
	 String sql="insert into boards(bno,btitle,bcontent,bwriter)"
	 		  + " values(seq_bno.nextval,?,?,?)";
		//3-2. 쿼리문 전달객체 생성
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,board.getBtitle());
	pstmt.setString(2,board.getBcontent());
	pstmt.setString(3,board.getBwriter());
	
	//3-3. 쿼리문 전달 및 실행 
	pstmt.executeUpdate();	
}catch(Exception e) {
	e.printStackTrace();
	exit();
 }

list();
}//create()메소드 끝.

Connection getConnection() {
	Connection conn = null;
	// 1-1.드라이버로딩
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.연결객체 인스턴스 생성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "java";
		String password = "oracle";
		conn = DriverManager.getConnection(url, user, password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
 }
}
