package 프로그래머스.위클리챌린지.최소직사각형.Lv1;

public class Solution {
	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

		int answer = solution(sizes);

		System.out.println(answer);
	}

	public static int solution(int[][] sizes) {
		// 배열의 가로 사이즈, 세로 사이즈를 조정하여 최소 사이즈의 정사각형을 만들어내는 것이 목표이다.

		// 배열[0] 의 값 비교
		// 배열[1] 의 값 비교
		int rowMax = 0;
		int colMax = 0;

		for (int i = 0; i < sizes.length; i++) {
			int r = Math.max(sizes[i][0], sizes[i][1]);
			int c = Math.min(sizes[i][0], sizes[i][1]);
			
			rowMax = Math.max(rowMax, r);
			colMax = Math.max(colMax, c);
		}

		return rowMax * colMax;
	}

}
