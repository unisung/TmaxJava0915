package ch05.sec05;

public class CharAtExample2 {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		
		char sex = ssn.charAt(6);//리턴 타입은 char
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
		}
	}
}
