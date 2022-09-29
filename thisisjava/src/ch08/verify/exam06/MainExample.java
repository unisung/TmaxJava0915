package ch08.verify.exam06;

public class MainExample {
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
		
		printSound(new Soundable() {
			@Override
			public String sound() {
				return "멍멍";
			}
		});
		printSound(() -> "야옹");//람다식
	}
	
	public static void printSound(Soundable s) {
		System.out.println(s.sound());
	}
}
