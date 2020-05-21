package 연습문제.나라의숫자;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = solution(10);
		System.out.println(a);
	}

	public static String solution(int n) {
		String answer = "";
		int nmg;

		while (n > 0) {
			nmg = n % 3;
			n /= 3;

			if (nmg == 0) {
				n -= 1;
				nmg = 4;
			}

			answer = nmg + answer;
		}

		return answer;
	}
}