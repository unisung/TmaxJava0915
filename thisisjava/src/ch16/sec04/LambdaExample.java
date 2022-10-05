package ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
	 Person person = new Person();
	 
	 person.action((x,y)-> {
		    double result = x+y;
			return result;
		}
	);
	 
	 person.action((x,y)-> {return x+y;} );
	 //return생략가능
	 person.action((x,y)-> x+y );
	 //다른 함수 호출
	 person.action(new Calcuable() {
		@Override
		public double calc(double x, double y) {
			return sum(x,y);
		}
	});
     //람다식
	 person.action((x,y)-> sum(x,y));//y=f(g(x))
	 
	}
	public static double sum(double x, double y) {
		return x+y;
	}
	

}
