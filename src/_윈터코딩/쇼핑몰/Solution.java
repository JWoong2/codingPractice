package _윈터코딩.쇼핑몰;

class Solution {
	public static void main(String[] args) {
		String ans = solution(6, new int[][] { { 1, 3, 1 }, { 3, 5, 0 }, { 5, 4, 0 }, { 2, 5, 0 } });
		System.out.println(ans);
	}

	public static String solution(int n, int[][] delivery) {
		String answer = "";

		String[] array = new String[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = "?";
		}

		// 한번 미리 1 있는거 해주고
		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 1) {
				// 얘네를 String 에다가 넣어줘야함 배열로 해줄까?
				array[delivery[i][0]-1] = "O";
				array[delivery[i][1]-1] = "O";
			}
		}

		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 0) {
				// 아닌 애들 중에서 X만 넣어주면?
				if (array[delivery[i][0]-1] == "O") {
					array[delivery[i][1]-1] = "X";
				}

				if (array[delivery[i][1]-1] == "O") {
					array[delivery[i][0]-1] = "X";
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			answer += array[i];
		}

		return answer;
	}
}