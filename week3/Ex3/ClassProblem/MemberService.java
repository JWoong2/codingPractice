package week3.Ex3.ClassProblem;

public class MemberService {
	String id = "hong";
	String pass = "12345";
	boolean login(String id, String password) {
		if(this.id.equals(id)) {
			if(this.pass.equals(password)) {
				return true;
			}
		}
		return false; 
	}
	
	void logout(String id) {
		System.out.println(id+ "가 로그아웃되었습니다");
	}
}
