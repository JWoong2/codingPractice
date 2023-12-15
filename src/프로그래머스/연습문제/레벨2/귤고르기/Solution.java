package 프로그래머스.연습문제.레벨2.귤고르기;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
	public static void main(String[] args) {

		int k = 6; // 4

		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };

		System.out.println(solution(k, tangerine));

	}

	public static int solution(int k, int[] tangerine) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < tangerine.length; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}

		return answer;
	}
}