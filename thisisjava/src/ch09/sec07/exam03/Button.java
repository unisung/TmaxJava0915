package ch09.sec07.exam03;

public class Button {
  //Button클래스의 멤버로서 인터페이스 선언
  public static interface ClickListener{
	  void onClick();
  }
  
  class ClickClass implements ClickListener{
	@Override
	public void onClick() {
        System.out.println("클릭");		
	}
 }
  
//필드
private ClickListener clickLister;

//메소드
public void setClickLister(ClickListener clickLister) {
	this.clickLister = clickLister;
}
//
public void click() {
	this.clickLister.onClick();
}
  
}
