package ch06.sec08_04;

//메소드 오버로딩
public class Calculator {
 //정사각형 넓이
 double areaRectangle(double width) {//signature (double)
	 return width*width;
 }
 //직사각형 넓이
 double areaRectangle(double width,double height) {//(double,double)
	 return width*height;
 }
 
public static void main(String[] args) {
	Calculator calc = new Calculator();
	System.out.println(calc.areaRectangle(100));
	System.out.println(calc.areaRectangle(100,200));
	
	
} 
}
