package _Dev_matching.AI����;

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
		

		
		// ���� n �� ���� ���Դ��� �׷κ��� �󸶳� ���������� üũ�ϰ� ī��Ʈ �ؼ� ��������ɰͰ�����??
	
		// �������� �Ǹ� 
		
		
		return answer;
	}
}