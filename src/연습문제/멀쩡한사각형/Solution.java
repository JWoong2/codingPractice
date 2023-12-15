package 연습문제.멀쩡한사각형;

import java.math.BigInteger;

class Solution {
	public static long solution(int w, int h) {
		long answer = 1;
		BigInteger width, height;

		width = BigInteger.valueOf(w);
		height = BigInteger.valueOf(h);
		BigInteger gcd = width.gcd(height);

		answer = width.longValue() * height.longValue() - (width.longValue() + height.longValue() - gcd.longValue());

		return answer;
	}
}