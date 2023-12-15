package ���α׷��ӽ�.��������.����1.��������������ȿ�Ⱓ;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// ��� ���� 28�ϱ���

class Solution {
	public static void main(String[] args) {
		String[] terms = { "A 6", "B 12", "C 3" };

		String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

		int[] answer = solution("2022.05.19", terms, privacies);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(String today, String[] terms, String[] privacies) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		Map<String, Integer> validDate = new HashMap<String, Integer>();

		for (int i = 0; i < terms.length; i++) {
			String[] temp = terms[i].split(" ");

			validDate.put(temp[0], Integer.parseInt(temp[1]));
		}
		
		String[] todayInfo = today.split("\\.");
		
		today = "" + todayInfo[0] + ""+ todayInfo[1] + ""+ todayInfo[2];
		
		LocalDate date1 = LocalDate.of(Integer.parseInt(todayInfo[0]), Integer.parseInt(todayInfo[1]), Integer.parseInt(todayInfo[2]));
		
		
		for(int i=0; i<privacies.length; i++) {
			String[] temp = privacies[i].split(" ");
			
			String[] dateInfo = temp[0].split("\\.");
			
			int year = Integer.parseInt(dateInfo[0]);
			int month = Integer.parseInt(dateInfo[1]);
			int day = Integer.parseInt(dateInfo[2]);
			
			// day�� -1 �Ѵ�
			day -= 1;
			
			if(day == 0) {
				month -= 1;
				
				if(month == 0) {
					year -= 1;
					month = 12;
				}
				
				day = 28;
			}
			
			// month �� terms ���ϱ�
			month += validDate.get(temp[1]); // A B C
			
			if(month >= 13) {
				if(month % 12 == 0 ) {
					year += month/12 -1;
				}else {
					year += month/12;
				}
				
				month %= 12;
				
				if(month == 0) month = 12;
			}
			
			LocalDate date2 = LocalDate.of(year, month, day); 

			Period pe = Period.between(date1, date2);
			
			if( pe.isNegative() ) {
				pq.add(i+1);
			}
		}
		
		int[] answer = pq.stream()
			    .map(String::valueOf)
			    .mapToInt(Integer::parseInt)
			    .toArray();

		return answer;
	}
}