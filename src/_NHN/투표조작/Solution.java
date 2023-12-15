package _NHN.투표조작;

public class Solution {
	public static void main(String[] args) {
		int answer = solution(new int[] { 5, 10, 7, 3, 8 });

		System.out.println(answer);
	}

	public static int solution(int[] votes) {
		if (votes.length == 1)
			return 0;

		boolean isBigger = false;

		int count = 0;

		while (!isBigger) {
			isBigger = true;

			int max = 0;
			int index = 0;
			// 강력한 후보
			for (int i = 1; i < votes.length; i++) {
				if (max < votes[i]) {
					max = votes[i];
					index = i;
				}

			}

			if (votes[0] <= max) {
				votes[0]++;
				votes[index]--;
				isBigger = false;
				count++;
			}

		}

		return count;
	}
}