package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection conn=null;
	try {
		//1. jdbc드라이버 메모리 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		//2. connection 연결객체 얻기
		conn=DriverManager.getConnection(url, "java", "oracle");
		String sql="delete boards where bno=?";
		//3. 쿼리 전달객체 생성
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//4. 쿼리 전달객체에 binding변수 값 세팅
		pstmt.setInt(1, 3);
		
		//5. 쿼리문 실행 및 결과 받기
		//insert/update/delete -> executeUpdate()
		int row =pstmt.executeUpdate();
		System.out.println("삭제한 행 수: "+row);
		
		pstmt.close();
		
	} catch (Exception e) {
		
	}finally {
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {}
		}
	 }
   }
}
