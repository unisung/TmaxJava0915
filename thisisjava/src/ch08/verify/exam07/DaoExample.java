package ch08.verify.exam07;

public class DaoExample {
	public static void dbWork(DataAccessObject dao){
		dao.intsert();
		dao.select();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}
