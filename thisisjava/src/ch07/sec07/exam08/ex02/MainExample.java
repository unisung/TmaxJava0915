package ch07.sec07.exam08.ex02;

public class MainExample {
	public static void main(String[] args) {
	  Animal animal;//Animal영역
	  Bird bird = new Bird();//Animal영역 + Bird영역
	  Dog dog = new Dog();//Animal영역 + Dog영역
	  Fish fish = new Fish();//Animal영역 + Fish영역
	  
	  animal = bird;//Bird객체가 Animal타입으로 변환
	  animal.say();//Bird의 say()가 실행
	  animal = dog;
	  animal.say();//Dog의 say()가 실행
	  animal = fish;
	  animal.say();//Fish의 say()가 실행
	}
}