package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String JDBC_URL ="jdbc:oracle:thin:@localhost:1521:xe";
	
	public void open() {
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(JDBC_URL,"java","oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> getAll(){
		open();
		List<Student> students = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Student s = new Student();
				s.setSeq(rs.getInt("id"));
				s.setName(rs.getString("username"));
				s.setSchool(rs.getString("univ"));
				s.setBirth(rs.getString("birth"));
				s.setEmail(rs.getString("email"));
				
				students.add(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return students;
	}
	
	public Student getInfo(int seq){
		open();
		Student s=null;
		
		try {
			pstmt = conn.prepareStatement("select * from student where id=?");
			pstmt.setInt(1, seq);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				s = new Student();
				s.setSeq(rs.getInt("id"));
				s.setName(rs.getString("username"));
				s.setSchool(rs.getString("univ"));
				s.setBirth(rs.getString("birth"));
				s.setEmail(rs.getString("email"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return s;
	}
}
