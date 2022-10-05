package ch16.sec05.exam01;

@FunctionalInterface
public interface Calculable {
  double calc(double x, double y);
}

class Computer{
	//static멤버
  public static double staticMethod(double x, double y) {
	  return x+y;
  }
  //non-static멤버
  public double instanceMethod(double x, double y) {
	  return x*y;
  }
}