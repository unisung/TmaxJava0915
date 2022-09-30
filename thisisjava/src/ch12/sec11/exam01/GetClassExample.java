package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception{
	   Class clazz = Car.class;//클래스 정보로 부터 얻기
	   
	   System.out.println("패키지: "+clazz.getPackageName());
	   System.out.println("클래스이름: "+clazz.getSimpleName());
	   System.out.println("클래스경로및이름: "+clazz.getName());
	  
	   //*** 문자열로 부터 얻기 ***
	  Class clazz2 = Class.forName("ch12.sec11.exam01.Car");
	   System.out.println("패키지: "+clazz2.getPackageName());
	   System.out.println("클래스이름: "+clazz2.getSimpleName());
	   System.out.println("클래스경로및이름: "+clazz2.getName());
	  //인스턴스 생성 newInstance() 
	   Car car2 = (Car)clazz2.newInstance();
	  
	   //Car클래스의 인스턴스 생성
	  Car car = new Car();
	  Class clazz3 = car.getClass();//인스턴스 참조변수에서 정보얻기
	   System.out.println("패키지: "+clazz3.getPackageName());
	   System.out.println("클래스이름: "+clazz3.getSimpleName());
	   System.out.println("클래스경로및이름: "+clazz3.getName());
	   
	   
	   
	  

	}
}
