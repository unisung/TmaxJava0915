package ch09.sec07.exam02;

public class MainExample {
	public static void main(String[] args) {
	InterA interA 
	= new A();
	interA.turnOn();
	interA.turnOff();
	//interA.m1();
	
	InterA ia
	=new InterA() {
		 void m1(){}//구현체(subclass)에서 추가된 메소드
		@Override
		public void turnOn() {}
		
		@Override
		public void turnOff() {}
	};

	//ia.m1();
	
//	ia = ()->{System.out.println();};
	}

}
