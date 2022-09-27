package ch08.sec02;

public class MainExample {
public static void main(String[] args) {
//RemoCon rc =new RemoCon();
  RemoCon rc;
		
 if(new TV() instanceof RemoCon) {
	 rc = new TV();
	 rc.turnOn();       
 }else if(new Audio() instanceof RemoCon){
	 rc = new Audio();
     rc.turnOn();
	}
  }
}