package ch07.sec07.exam08.ex02;

public class MainExample {
	public static void main(String[] args) {
	  Animal animal;
	  Bird bird = new Bird();
	  Dog dog = new Dog();
	  Fish fish = new Fish();
	  
	  animal =bird;//Bird객체가 Animal타입으로 변환
	  animal.say();
	  animal =dog;
	  animal.say();
	  animal =fish;
	  animal.say();

	}
}
