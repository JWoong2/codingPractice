package 프로그래머스.KAKAO2022INTERN.성격유형검사하기;

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
 * 지표 번호 성격 유형 1번 지표 라이언형(R), 튜브형(T) 2번 지표 콘형(C), 프로도형(F) 3번 지표 제이지형(J), 무지형(M)
 * 4번 지표 어피치형(A), 네오형(N)
 */

/*
 * 1매우 비동의 네오형 3점 2비동의 네오형 2점 3약간 비동의 네오형 1점 4모르겠음 어떤 성격 유형도 점수를 얻지 않습니다 5약간 동의
 * 어피치형 1점 6동의 어피치형 2점 7매우 동의 어피치형 3점
 */