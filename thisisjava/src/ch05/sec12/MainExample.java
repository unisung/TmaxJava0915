package ch05.sec12;

public class MainExample {
	public static void main(String[] args) {
		MySingleTon ms1=null;
		//ms1 = new MySingleTon();
		//ms2 = new MySingleTon();
		//ms3 = new MySingleTon();
		
		ms1 = MySingleTon.getInstance();
		//ms1 = intance;
        ms1.greet();
        MySingleTon ms2 
            = MySingleTon.getInstance();
        MySingleTon ms3 
             = MySingleTon.getInstance();
 
	}
}
