package ch06.sec08;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		calc.x=10;
		calc.y=20;
		
		int result=calc.plus(10, 20);
		System.out.println(result);
		
		calc.minus(10, 20);
		
		result=calc.multiple();
		System.out.println(result);
		
		calc.divide();

	}
}
