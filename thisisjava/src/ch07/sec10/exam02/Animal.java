package ch07.sec10.exam02;

//abstract로 선언된 클래스 = 추상클래스
public abstract class Animal {
	//일반 메소드 선언
	public void breathe() {System.out.println("숨을 쉽니다.");}

public static void main(String[] args) {
	//추상클래스 이므로 객체 생성 불가
    //Animal animal = new Animal();
	//추상클래스는 타입 선언용
	Animal animal;
	animal = new Bird();//추상클래스의 메소드 사용을 위해서는 자식객체(실체클래스)를 생성해서 대입.
    animal.breathe();
    
}	
}

class Bird extends Animal{}
class Cat extends Animal{}