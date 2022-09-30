package ch13.sec01;

public class GenericExample {
public static void main(String[] args) {
	//제네릭 적용 전
	Box box1 = new Box();
	box1.content = "안녕하세요";
	String str = (String)box1.content;//Object->String
	System.out.println(str);
	box1.content = 100;
	int intValue = (Integer)box1.content;//Object->Integer
	System.out.println(intValue);
	
	Box box2 = new Box();
	box2.content = 100;
	int value = (Integer)box2.content;//Object->Integer
	System.out.println(value);
	
	//제네릭 적용 후, 타입 체킹
	//<클래스>  <int><boolean> -> <Integer><Boolean>
	Box<String> box3 = new Box<String>();//컴파일시 String타입으로 변환
	box3.content = "안녕하세요";
	String str3 = box3.content;//
	System.out.println(str3);
	
	Box<Integer> box4 = new Box<Integer>();
	box4.content = 100;
	int value4 = box4.content;//컴파일시 Integer
	System.out.println(value4);
	}
}
