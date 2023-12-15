package 프로그래머스.연습문제.레벨2.연속부분수열합의개수;

import java.util.HashSet;
import java.util.Set;

class Solution {
	// case 1 : 7,9,1,1,4
	// answer : 18

	public static void main(String[] args) {
		int[] elements = { 7, 9, 1, 1, 4 };

		System.out.println(solution(elements));
	}

	public static int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();

		int arraySum = 0;

		// 첫번째는 윈도우
		for (int i = 0; i < elements.length; i++) {

			arraySum += elements[i];

			// 두번째는 반복횟수 및 인덱스
			for (int j = 0; j < elements.length; j++) {
				// 세번째는 덧셈
				int sum = 0;

				for (int k = j; k < j + i; k++) {
					sum += elements[k % elements.length];
				}

				if(sum != 0) set.add(sum);
			}
		}

		set.add(arraySum);

		return set.size();
	}
}