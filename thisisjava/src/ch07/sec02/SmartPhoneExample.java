package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//Phone으로 부터 상속받은 필드 읽기
		System.out.println(myPhone.model+", "+myPhone.color);
		
		//Phone으로 부터 삭속받은 메소드 읽기
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("방가요~~");
		myPhone.sendVoice("저도 반가요");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
	}
}
