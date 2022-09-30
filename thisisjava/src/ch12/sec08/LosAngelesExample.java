package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
public static void main(String[] args) {
	//시간대 정보
 TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
 Calendar now = Calendar.getInstance(timeZone);//싱글톤
 
	System.out.println(now.get(Calendar.YEAR));
	System.out.println(now.get(Calendar.MONTH)+1);//월 +1
	System.out.println(now.get(Calendar.DAY_OF_MONTH));
System.out.println(now.get(Calendar.DAY_OF_WEEK));//요일 숫자

System.out.println(now.get(Calendar.AM_PM)==0?"오전":"오후");
System.out.println(now.get(Calendar.HOUR_OF_DAY));
System.out.println(now.get(Calendar.MINUTE));
System.out.println(now.get(Calendar.SECOND));
 
	}

}
