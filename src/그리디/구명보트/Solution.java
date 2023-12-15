package 그리디.구명보트;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		//int a = solution(new int[] { 70, 50, 80, 50 }, 100);
		int a = solution(new int[] { 40, 40, 40, 40 }, 100);
		System.out.println(a);
	}

	public static int solution(int[] people, int limit) {
		Arrays.sort(people);

		int answer = 0;
		int index = people.length - 1;
		for (int i = 0; i <= index; i++, answer++)
			while (index > i && people[i] + people[index--] > limit)
				answer++;

		return answer;
	}

}