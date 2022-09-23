package ch06.sec08;

public class ReturnExample {
	public static void main(String[] args) {
		ReturnExample re = new ReturnExample();
        re.method1();
		System.out.println("끝");  
}
 
void method1() {
	 System.out.println("메소드에서");
	 System.out.println("return문이 하는 역할은");
	 System.out.println("return문 전까지의 명령실행후 ");
	 System.out.println("return문 에서 실행을 멈추고");
	 System.out.println("메소드를 호출한 곳으로 되돌아가는 명령");
	 return;
    // System.out.println("return문 뒤에는 추가 실행문을 작성할수 없음");	 
 }
	
	
}