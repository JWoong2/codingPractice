package _NHN.거친문자열;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		int ans = solution("aaaaabbc", 1);
		System.out.println(ans);
	}

	public static int solution(String s, int n) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		char maxAlpha;
		char minAlpha;

		int max = 0;
		int min = 51;

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxAlpha = entry.getKey();
			}
			if (min > entry.getValue()) {
				min = entry.getValue();
				minAlpha = entry.getKey();
			}
		}

		int answer = max - min - n;
		
		// 만약 n으로 최소를 다 없앤다면 그 다음 최소랑 최대를 비교해야함..
		if (min == n) {
			map.remove(min);
			
			for (Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
				if (max < entry.getValue()) {
					max = entry.getValue();
					maxAlpha = entry.getKey();
				}
				if (min > entry.getValue()) {
					min = entry.getValue();
					minAlpha = entry.getKey();
				}
			}
		}

		int another = max - min;
		
		answer = answer < another ? answer : another;
		
		if (answer < 0)
			return 0;
		return answer;
	}
}