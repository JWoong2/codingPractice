package _월간코드챌린지.삼각달팽이;

public class Main {
	public static void main(String[] args) {
		int[] ans = solution(4);
		
	}

	public static int[] solution(int n) {
		// 최대 2차배열
		int[][] tri = new int[n][n];

		// n으로 최대 숫자가 몇인지 구하기
		int max = maxNumber(n);
		int[] answer = new int[max];
		int index = 1;

		int x = 0, y = 0;

		tri[x][y] = index++;

		// 배열에 채워넣기
		while (index <= max) {

			// 행 채우기
			while (x + 1 < n && tri[x + 1][y] == 0) {
				tri[++x][y] = index++;
			}

			// 열 채우기
			while (y + 1 < n && tri[x][y + 1] == 0) {
				tri[x][++y] = index++;
			}

			// 역대각선 채우기
			while (tri[x - 1][y - 1] == 0) {
				tri[--x][--y] = index++;
			}
		}

		index = 0;

		// 배열 디버그용
/*		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(tri[i][j] + " ");
			}

			System.out.println("");
		}*/

		// 값 옮겨담기 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (tri[i][j] != 0) answer[index++] = tri[i][j];
			}
		}

		return answer;
	}

	private static int maxNumber(int n) {
		int number = 0;

		while (n != 0) {
			number += n--;
		}

		return number;
	}
}
