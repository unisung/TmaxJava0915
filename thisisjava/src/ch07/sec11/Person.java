package ch07.sec11;

//부모클래스에서 상속가능한 클래스를 관리 permits뒤에 기술
public sealed class Person permits Employee, Manager {
 public String name;
 public void work() {System.out.println("하는 일이 결정되지 않았습니다.");}
}
