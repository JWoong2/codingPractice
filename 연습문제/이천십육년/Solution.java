package 연습문제.이천십육년;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Solution {
	public static void main(String[] args) {
		String day = solution(6, 20);
		System.out.println(day);
	}
	
	public static String solution(int a, int b) {
		String answer = "";

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("E", Locale.US);
		
		date.setYear(2016);
		date.setMonth(a - 1);
		date.setDate(b);
		System.out.println(df.format(date));
		
		
		switch (date.getDay()) {
		case 5:
			answer = "FRI";
			break;
		case 6:
			answer = "SAT";
			break;
		case 0:
			answer = "SUN";
			break;
		case 1:
			answer = "MON";
			break;
		case 2:
			answer = "TUE";
			break;
		case 3:
			answer = "WED";
			break;
		case 4:
			answer = "THU";
			break;

		}

		return answer;
	}
}