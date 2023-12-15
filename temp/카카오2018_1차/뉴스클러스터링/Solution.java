package 카카오2018_1차.뉴스클러스터링;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		String[] str1 = { "FRANCE", "handshake", "aa1+aa2", "E=M*C^2", "123" };
		String[] str2 = { "french", "shake hands", "AAAA12", "e=m*c^2", "234" };

		//11223
		//12245
		// (int) 65536 * (3/7)
		
		
		int[] answer = new int[str1.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = solution(str1[i], str2[i]);
		}

		for (int i : answer)
			System.out.println(i);

	}

	public static int solution(String str1, String str2) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> union = new ArrayList<String>();
		List<String> intersection = new ArrayList<String>();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		for (int i = 0; i < str1.length() - 1; i++) {
			String temp = "";

			if (Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i + 1))) {
				temp += str1.charAt(i);
				temp += str1.charAt(i + 1);
			} else {
				continue;
			}

			list1.add(temp);
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			String temp = "";

			if (Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i + 1))) {
				temp += str2.charAt(i);
				temp += str2.charAt(i + 1);

			} else {
				continue;
			}

			list2.add(temp);
		}

		//교집합
		for (String s : list1) {
			if (list2.remove(s)) {
				intersection.add(s);
				System.out.println("교집합에서 지워지는 거"+ s);
			}
			union.add(s);
		}

		// 합집합
		for (String s : list2) {
			union.add(s);
		}
		
		for(String s : union) {
			System.out.println("합집합 data : "  + s);
		}

		double jakard = 0;

		if (union.size() == 0) {
			jakard = 1;
		} else {
			jakard = (double) intersection.size() / (double) union.size();
		}

		return (int) (jakard * 65536);
	}
}