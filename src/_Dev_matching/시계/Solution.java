package _Dev_matching.½Ã°è;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws ParseException {
		String p = "PM 11:59:59";
		int n = 100000;
		
		String ans = solution(p, n);
	}

	public static String solution(String p, int n) throws ParseException {
		String answer = null;

		Date date;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		
		String[] timeInfo= p.split(" ");
		String is = timeInfo[0];
		String time = timeInfo[1];
		System.out.println("tiem : " + time);
		
		date = new SimpleDateFormat("HH:mm:ss").parse(time);
		
		if (is.equals("AM")) {
			cal.setTime(date);
			
			
			cal.add(Calendar.SECOND, n);
			System.out.println("AM");
				
		}else {
			cal.setTime(date);
			cal.add(Calendar.SECOND, n);
			cal.add(Calendar.HOUR, 12);
			
			System.out.println("PM");
		}
		
		answer = df.format(cal.getTime());
		System.out.println(answer);
		return answer;
	}
}