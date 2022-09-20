package ch05.sec03;

public class ReferenceVariableExample {
	public static void main(String[] args) {
		//참조타입 변수명 = new 참조타입생성자();
		String name1 = new String("홍길동");
        System.out.println(System.identityHashCode(name1));
		String name2 = new String("홍길동");
		System.out.println(System.identityHashCode(name2));
		
		String name3 = name2;
		System.out.println(System.identityHashCode(name3));
		
		// == 변수 name1의 값과 name2의 값이 같은지(참조하는 주소가 같은지) 물어봄
		if(name1==name2) {
			System.out.println(" name1이 참조하는 객체의 주소는: "+System.identityHashCode(name1)
			                   +"이고\n,name2가 참조하는 객체의 주소는 : "+System.identityHashCode(name2)+"로 같습니다.");
		}else {
			System.out.println(" name1이 참조하는 객체의 주소는: "+System.identityHashCode(name1)
                                +"이고\n,name2가 참조하는 객체의 주소는 : "+System.identityHashCode(name2)+"로 다릅니다.");
		}
		
		if(name2==name3) {
			System.out.println(" name2가 참조하는 객체의 주소는: "+System.identityHashCode(name2)
			                   +"이고\n,name3가 참조하는 객체의 주소는 : "+System.identityHashCode(name2)+"로 같습니다.");
		}else {
			System.out.println(" name2가 참조하는 객체의 주소는: "+System.identityHashCode(name2)
                                +"이고\n,name3가 참조하는 객체의 주소는 : "+System.identityHashCode(name3)+"로 다릅니다.");
		}
		
		System.out.println("--------------------");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		
		

	}
}
