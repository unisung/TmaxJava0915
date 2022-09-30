package ch12.sec11.exam03;

public class GeResourceExample {
	public static void main(String[] args) {
	  Class clazz = Car.class;
	  
	  //같은 경로 - 이미지명
	  String photo1Path = clazz.getResource("photo1.jpg").getPath();
	  //다른 경로 - 패스/이미지명
	  String photo2Path = clazz.getResource("images/photo1.jpg").getPath();
	  
	  System.out.println(photo1Path);
	  System.out.println(photo2Path);

	}
}
