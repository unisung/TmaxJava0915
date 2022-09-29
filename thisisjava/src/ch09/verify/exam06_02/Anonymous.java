package ch09.verify.exam06_02;

public class Anonymous {
  Vehicle field=()->System.out.println("자전거가 달립니다.");


  void method1() {
	  Vehicle localVar=()->	System.out.println("승용차가 달립니다.");
	  localVar.run();
  }
  
  void method2(Vehicle v) {
	  v.run();
  }  
}
