package ch06.sec02;

//Person과 Calculator 사용의 관계
public class Person {
	Calculator calculator;
	
	public static void main(String[] args) {
		Person person = new Person();
		double result = person.calculator.calc(10, "+", 20);
        System.out.println(result);
	}
}
