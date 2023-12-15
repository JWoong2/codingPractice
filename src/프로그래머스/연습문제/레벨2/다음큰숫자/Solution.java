package 프로그래머스.연습문제.레벨2.다음큰숫자;

class Solution {
	public static void main(String[] args) {
		int n = 78;

		System.out.println(solution(n));
	}

	public static int solution(int n) {
//        조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//        조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//        조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.

		String diffBinary = Integer.toBinaryString(n);
		int count = 0;

		for (int i = 0; i < diffBinary.length(); i++) {
			if (diffBinary.charAt(i) == '1') {
				count++;
			}
		}

		while (true) {
			n++;
			int diffCount2 = 0;

			String str = Integer.toBinaryString(n);
			System.out.println(str);

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					diffCount2++;
				}
			}

			if (count == diffCount2)
				break;
		}

		return n;
	}
}