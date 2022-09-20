package ch05.sec05;

public class CharAtExample {
 public static void main(String[] args) {
    String str = "자바 프로그래밍";
    System.out.println(str.length());
    
    //메소드 String.length()
    for(int i=0; i < str.length();i++) { //  0<= i반복범위 < 8: 0 ~ 7
    	 char c = str.charAt(i);//문자열에서 index에 해당하는 문자 하나 출력 charAt()
    	 System.out.println(c);
    }
    
    char[] charArray = {'j','a','v','a',' ','p','r','o','g','r','a','m','m','i','n','g'};
    //속성값 배열.length
    System.out.println(charArray.length);
    
    str = new String(charArray);
    System.out.println(str);
    
    
}
}
