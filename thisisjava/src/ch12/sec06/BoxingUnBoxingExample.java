package ch12.sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
	   Integer obj = 100;// int -> Integer 
	   System.out.println("value: "
	                 + obj.intValue());//unboxing(Wrapper->int)
	   int value=obj;//java 1.5(Auto-Unboxing) Wrapper->int 
	   System.out.println("value: "+ value);
	   
	   Integer obj2 = Integer.valueOf(value);//boxing
	   obj2 = value;//Auto-boxing
	   System.out.println(obj2);
	}
}
