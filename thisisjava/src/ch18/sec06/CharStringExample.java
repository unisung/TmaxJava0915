package ch18.sec06;

public class CharStringExample {

	public static void main(String[] args) {
		char[] cArr = {'안','녕','하','세','요'};//[안][녕][하][세][요]
		String str = new String(cArr);
		System.out.println(str);
		
		//new String(char배열,offset,길이)
		String str2 = new String(cArr,0,cArr.length-3);
		System.out.println(str2);
	}
}