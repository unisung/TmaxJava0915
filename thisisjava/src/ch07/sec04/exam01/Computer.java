package ch07.sec04.exam01;

public class Computer extends Calculator {
//재정의(override)
//public double areaCircle(double r) {
//	return Math.PI*Math.pow(r, 2);
//}
//@Override는 컴파일러에게 부모클래스의 메소드가
//자식클래스에서 재정의 되었음을 알려주는 역할
@Override//어노테이션(컴파일러에게 알려주는 주석)
public double areaCircle(double r) {
		return Math.PI*Math.pow(r, 2);
}
//오버로딩된 메소드	
public double areaCircle(int r) {
	return Math.PI*Math.pow(r, 2);
}

//오버로딩
public int areaCircle(float r) {
	return (int)(Math.PI*Math.pow(r, 2));
}
	
public static void main(String[] args) {
	Computer c1=new Computer();
	double area=c1.areaCircle(10);
	System.out.println(area);
}

}
