package _NHN.신용카드;

public class Solution {
	public static void main(String[] args) {
		String answer = solution("11111101");
		System.out.println(answer);
	}

	public static String solution(String cardNumber) {
		int i;
		if (cardNumber.length() % 2 == 0) {
			i = 1;
		} else {
			i = 0;
		}

		int total = 0;

		for (char c : cardNumber.toCharArray()) {
			if (i % 2 == 0) {
				total += Character.getNumericValue(c);

			} else {
				int num = Character.getNumericValue(c) * 2;

				if (num >= 10) {
					int mok = num / 10;
					int nmg = num % 10;

					total += mok + nmg;
				} else
					total += num;
			}

			i++;
		}

		System.out.println(total);

		if (total % 10 == 0)
			return "VALID";
		else
			return "INVALID";
	}
}