package week4.Ex3.Problem;

import java.util.regex.Pattern;

public class PatternmatcherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID 사용가능");
		}else {
			System.out.println("ID 사용불가");
		}
	}

}
