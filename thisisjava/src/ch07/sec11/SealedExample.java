package ch07.sec11;

//자바15부터 도입 sealed permits, non-sealed
public class SealedExample {
	public static void main(String[] args) {
	 Person p = new Person();
	 Employee e = new Employee();
	 Manager m = new Manager();
	 Director d = new Director();
	 
	 p.work();
	 e.work();
	 m.work();
	 d.work();

	}
}
