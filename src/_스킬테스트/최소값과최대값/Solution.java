package _스킬테스트.최소값과최대값;

class Solution {
	public static String solution(String s) {
		String[] temp = s.split(" ");

		int min, max, n;
		min = max = Integer.parseInt(temp[0]);

		for (int i = 0; i < temp.length; i++) {
			n = Integer.parseInt(temp[i]);

			if (min > n)
				min = n;
			if (max < n)
				max = n;
		}

		return min + " " + max;
	}
}