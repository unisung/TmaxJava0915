package ch05.sec12;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
	 Calendar cal = Calendar.getInstance();
	 
	 int year = cal.get(Calendar.YEAR);
	 int month = cal.get(Calendar.MONTH)+1;//January=0
	 int day = cal.get(Calendar.DATE);
	 int day1 = cal.get(Calendar.DAY_OF_MONTH);
	 int week = cal.get(Calendar.DAY_OF_WEEK);
	 int hour = cal.get(Calendar.HOUR);
	 int minute = cal.get(Calendar.MINUTE);
	 int second = cal.get(Calendar.SECOND);
	 int today = cal.get(Calendar.DAY_OF_YEAR);
	 
	 //System.out.println(new Date().getTime());
	 
	 System.out.println(year+"년"+month+"월"+day+"일"
	                     +week+"요일"+hour+"시"+minute+"분"+second+"초");
	 System.out.println("오늘은 올해의 "+today+"번 째 날입니다.");
	}
}