package ch12.sec08;

import java.util.TimeZone;

public class PrinTimeZoneID {
  public static void main(String[] args) {
	String[] availableIDs = TimeZone.getAvailableIDs();
	for(String id:availableIDs) {
		System.out.println(id);
	}
}
}
