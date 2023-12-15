package _월간코드챌린지.삼진십진;

class Solution {
	public static void main(String[] args) {
		int answer = solution(125);

		System.out.println(answer);
	}

	public static int solution(int n) {
		int answer = 0;

		answer = toDex(toThird(n));

		return answer;
	}

	private static String toThird(int input) {
		String result = "";

		while (input != 0) {
			if (input % 3 != 0) {
				result = result + input % 3;
			} else {
				result = result + "0";
			}

			input /= 3;
		}
		System.out.println(result);

		return result;
	}

	private static int toDex(String input) {
		double value = 0;
		int size = input.length()-1;
		System.out.println(size);

		for (char c : input.toCharArray()) {
			value += Integer.parseInt(String.valueOf(c)) * Math.pow(3, size--);
			System.out.println(value);
		}

		return (int) value;
	}
}