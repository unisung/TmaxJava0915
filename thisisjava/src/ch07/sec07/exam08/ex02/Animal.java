package ch07.sec07.exam08.ex02;

public class Animal {
 void say() {
	 System.out.println("의사 소통합니다.");
 }
}
class Bird extends Animal{
	void say() {
		 System.out.println("짹짹입니다.");
	 }
}
class Dog extends Animal{
	void say() {
		 System.out.println("멍멍합니다.");
	 }
}
class Fish extends Animal{
	void say() {
		 System.out.println("뻐끔거립니다.");
	 }
}