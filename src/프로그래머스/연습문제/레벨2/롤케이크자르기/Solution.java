package 프로그래머스.연습문제.레벨2.롤케이크자르기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// https://school.programmers.co.kr/learn/courses/30/lessons/132265

class Solution {
	public static void main(String[] args) {
		int[] topping = { 1, 2, 1, 3, 1, 4, 1, 2 }; // 1234
		int[] topping2 = { 1, 2, 3, 1, 4 };

		System.out.println(solution(topping));
		System.out.println(solution(topping2));
	}

	public static int solution(int[] topping) {
		int answer = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		// timeout
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		for (int i = 0; i < topping.length; i++) {
			map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
			setB.add(topping[i]);
		}

		for (int i = 0; i < topping.length; i++) {
			setA.add(topping[i]);
			map.put(topping[i], map.get(topping[i]) - 1);
			if (map.get(topping[i]) <= 0) {
				setB.remove(topping[i]);
			}

			if (setA.size() == setB.size()) {
				answer++;
			}
		}

		return answer;
	}
}