package ch06.verify.exam18;
//싱글톤
public class ShopService {
 //1. 클래스 자신타입의 private static필드 선언
  private static ShopService instance 
                  = new ShopService();
 //2. private 생성자 선언
  private ShopService() {}
 //3. getInstance메소드 선언
public static ShopService getInstance() {
	return instance;
}
  
}
