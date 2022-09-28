package ch09.sec07.exam03;

import ch09.sec07.exam03.Button.ClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		Button.ClickClass bc = btn.new ClickClass(); 
		btn.setClickLister(bc);
		btn.click();
		
		btn.setClickLister(btn.new ClickClass());
		btn.click();
		
		//인터페이스 선언
		ClickListener cl = new ClickListener() {
			@Override
			public void onClick() {
			  System.out.println("쿨릭");
			}
		}; 
		btn.setClickLister(cl);
		btn.click();

		
		//익명객체 anonymous
		//인터페이스의 new 생성자를 호출하여 이름없는 객체생성
		btn.setClickLister(new ClickListener() {
			@Override
			public void onClick() {
              System.out.println("익명객체의 click()실행");
			}
		});
		btn.click();
		
		//인터페이스 선언
	 ClickListener cl2 = () -> System.out.println("쿨릭"); 
		btn.setClickLister(cl2);
		btn.click();
	}
}
