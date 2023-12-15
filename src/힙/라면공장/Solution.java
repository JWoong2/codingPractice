package 힙.라면공장;

import java.util.*;

class Solution {
	public int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		int date = 0;
		int index=0;

		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		while (stock < k ) {
			for(int i = date; i<dates.length; i++) {
				if(stock >= dates[i]) {
					queue.add(supplies[i]);
					index= i;
				}
			}
			date= index+1;
			stock += queue.poll();
			answer++;
		}

		return answer;
	}
}