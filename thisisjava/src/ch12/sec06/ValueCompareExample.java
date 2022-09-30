package ch12.sec06;

public class ValueCompareExample {
	public static void main(String[] args) {
	 // -128 ~127(byte타입의 범위) 초과 
	 Integer obj1 = 300;
	 Integer obj2 = 300;
	 int i1 = obj1;
	 int i2 = obj2;
	 System.out.println(i1);
	 System.out.println(i2);
	 System.out.println(i1==i2);
	 System.out.println(obj1==obj2);//다른 값으로 인식
	 System.out.println(obj1.equals(obj2));	 
	 
	 //-128 ~127(byte타입 범위내)
	 Integer obj3 = 100;
	 Integer obj4 = 100;
	 System.out.println(obj3==obj4);
	 System.out.println(obj3.equals(obj4));
	 
	 int a = Integer.parseInt("10");
	 double d1 = Double.parseDouble("3.14");
	 
	}
}
