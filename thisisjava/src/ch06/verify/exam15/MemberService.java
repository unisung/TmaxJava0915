package ch06.verify.exam15;

public class MemberService {
/*	
	boolean login(String id, String password) {
		if("hong".equals(id) & "12345".equals(password))
		   return true ;
		else
		   return false;
	}
*/	
	boolean login(String id, String password) {
		return ("hong".equals(id) & 
				   "12345".equals(password))?true:false;
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
}
