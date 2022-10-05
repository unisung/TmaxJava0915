package ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		Calculator calc = (x, y)-> {
				int result=x+y;
				System.out.println(result);
		               };
		//익명객체를 만들어서 전달
	    action(calc);                 
		//람다식 
		action((x, y)->{int result=x+y;System.out.println(result);});
		action((x, y)->System.out.println(x+y));
	
	}
	
	public static void action(Calculator calculable) {
		int x=40;
		int y=4;
		calculable.calculate(x, y);
	}

}
