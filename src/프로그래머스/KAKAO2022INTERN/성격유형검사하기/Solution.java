package ���α׷��ӽ�.KAKAO2022INTERN.���������˻��ϱ�;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };

		System.out.println(solution(survey, choices));
	}

	static int[] scores = { 3, 2, 1, 0, 1, 2, 3 };

	public static String solution(String[] survey, int[] choices) {
		String answer = "";

		String[] type = { "R", "T", "C", "F", "J", "M", "A", "N" };

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < type.length; i++) {
			map.put(type[i], 0);
		}

		for (int i = 0; i < survey.length; i++) {
			String[] strs = survey[i].split("");

			if (choices[i] == 0)
				continue;

			if (choices[i] < 4) {
				map.put(strs[0], map.getOrDefault(strs[0], 0) + scores[choices[i] - 1]);
			} else {
				map.put(strs[1], map.getOrDefault(strs[1], 0) + scores[choices[i] - 1]);
			}
		}

		if (map.get("R") < map.get("T")) {
			answer += "T";
		} else {
			answer += "R";
		}

		if (map.get("C") < map.get("F")) {
			answer += "F";
		} else {
			answer += "C";
		}

		if (map.get("J") < map.get("M")) {
			answer += "M";
		} else {
			answer += "J";
		}

		if (map.get("A") < map.get("N")) {
			answer += "N";
		} else {
			answer += "A";
		}

		return answer;
	}
}

/*
 * ��ǥ ��ȣ ���� ���� 1�� ��ǥ ���̾���(R), Ʃ����(T) 2�� ��ǥ ����(C), ���ε���(F) 3�� ��ǥ ��������(J), ������(M)
 * 4�� ��ǥ ����ġ��(A), �׿���(N)
 */

/*
 * 1�ſ� ���� �׿��� 3�� 2���� �׿��� 2�� 3�ణ ���� �׿��� 1�� 4�𸣰��� � ���� ������ ������ ���� �ʽ��ϴ� 5�ణ ����
 * ����ġ�� 1�� 6���� ����ġ�� 2�� 7�ſ� ���� ����ġ�� 3��
 */