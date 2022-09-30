package ch12.sec05;
//Ctrl + Shift + o
import java.util.StringTokenizer;
//main Ctrl + space바
public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");//{"홍길동","이수홍","박연수"}
		//문자열을 특정기준으로 잘라서 배열로 리턴해주는 메소드
		for(String token:arr)
			System.out.println(token);
		System.out.println(arr[0]);
		System.out.println("----------------");
		
		String data2 = "hong@www.naver.com";
		String[] arr2=data2.split("@");
		for(String a:arr2)
			System.out.println(a);
		//->
		//->[홍길동]
		//->[이수홍]
		//->[박연수]
		//->?
		StringTokenizer st 
		  = new StringTokenizer("홍길동/이수홍/박연수", "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
