package ch08.verify.exam06;

public interface Soundable {
  public String sound();
}
class Cat implements Soundable{
	 public String sound() {return "야옹";}
}
class Dog implements Soundable{
	 public String sound() {return "멍멍";}
}