package ch08.verify.exam07;

public interface DataAccessObject {
   void select();
   void intsert();
   void update();
   void delete();
}
class OracleDao implements DataAccessObject{
	public void select(){System.out.println("Oracle DB에서 검색");}
	public void intsert(){System.out.println("Oracle DB에 삽입");}
	public void update(){System.out.println("Oracle DB를 수정");}
	public void delete(){System.out.println("Oracle DB를 삭제");}
	
}
class MysqlDao implements DataAccessObject{
	public void select(){System.out.println("Mysql DB에서 검색");}
	public void intsert(){System.out.println("Mysql DB에 삽입");}
	public void update(){System.out.println("Mysql DB를 수정");}
	public void delete(){System.out.println("Mysql DB를 삭제");}
}
