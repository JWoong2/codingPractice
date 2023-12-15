package 연습문제.정수내림차순;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		long l = solution(118372);
		System.out.println(l);
	}
	public static long solution(long n) {
		long answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		while(n != 0 ) {
			list.add((int) (n%10));
			n /= 10;
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for(int i=0; i<list.size(); i++) {
			answer*=10;
			answer += list.get(i);
		}
		
		return answer;
	}
}