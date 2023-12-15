package _월간코드챌린지.풍선터트리기;

class Solution {
	public static void main(String[] args) {
		//int ans = solution(new int[] { -16, 27, 65, -2, 58, -92, -71, -68, -61, -33 });
		int ans = solution(new int[] { 9,-1,-5});
		
		System.out.println(ans);
	}

	public static int solution(int[] a) {
		int answer = 0;
		int l = 1000000000, r = 1000000000;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < l) {
				answer++;
				l = a[i];
			}

			if (a[a.length - 1 - i] < r) {
				answer++;
				r = a[a.length - 1 - i];
			}

			if (l == r)
				break;
		}

		return answer + (l == r ? -1 : 0);
	}
}