package _Dev_matching.AI은행;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Solution {
	public static void main(String[] args) {

	}
	
	public int solution(int n, String[] customers) throws ParseException {
		int answer = 0;

		Date date;
		SimpleDateFormat df;
		
		Calendar cal = Calendar.getInstance();
		
		for(int i=0; i<customers.length; i++) {
			date = new SimpleDateFormat("MM/DD HH:MM:SS").parse(customers[i]);
			int takeTime = Integer.parseInt(customers[i].split("")[2]); 

			cal.setTime(date);
			cal.add(Calendar.MINUTE, takeTime);
			
			System.out.println(cal);
		}
		

		
		// 숫자 n 과 언제 들어왔는지 그로부터 얼마나 지났는지만 체크하고 카운트 해서 내보내면될것같은데??
	
		// 다음날이 되면 
		
		
		return answer;
	}
}