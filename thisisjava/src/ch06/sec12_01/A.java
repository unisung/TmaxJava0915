package ch06.sec12_01;

//A클래스는 ch06.sec12_01.A
public class A {
public static void main(String[] args) {
	System.out.println(A.class.getCanonicalName());
	System.out.println(A.class.getName());
	System.out.println(A.class.getSimpleName());
	System.out.println(A.class.getPackageName());
}

}
