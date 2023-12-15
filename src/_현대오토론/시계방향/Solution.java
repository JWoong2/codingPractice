package _현대오토론.시계방향;

class Solution {
	static int[][] answer;
	static int[][] endPoints;

	public static void main(String[] args) {
		int n = 5;
		int[][] answer = solution(n, true);

		// 디버그용
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] solution(int n, boolean clockwise) {
		answer = new int[n][n];

		if (n % 2 == 0) {
			endPoints = new int[4][2];

			for (int i = 0; i < endPoints.length; i++) {
				for (int j = 0; j < endPoints[i].length; j++) {
					if (i == j) {
						endPoints[i][j] = n / 2;
					} else {
						endPoints[i][j] = n / 2 + 1;
					}
				}
			}

		} else {
			endPoints = new int[1][2];

			endPoints[0][0] = n / 2;
			endPoints[0][1] = n / 2;
		}

		int[][] array = { { 0, 0 }, { 0, n - 1 },  { n - 1, 0 }, { n - 1, n - 1 } };

		for (int i = 0; i < array.length; i++) {
			tor(n, array[i][0], array[i][1], clockwise);
		}

		return answer;
	}

	private static void tor(int n, int x, int y, boolean clockwise) {
		// 마지막 한칸을 띄우고, 두칸을 띄우고 .. 1 2 3 4
		int index = 1;
		int limit = 1;

		answer[x][y] = index++;

		boolean run = true;

		// 참이면시계방향
		while (run) {
			if (clockwise) {
				while (y + 1 < n && answer[x][y + 1] == 0 && y < n - limit) {
					answer[x][++y] = index++;
// 0 1 2 3
					if (y + 1 == n - limit) {
						for (int i = 0; i < n; i++) {
							for (int j = 0; j < n; j++) {
								System.out.print(answer[i][j] + " ");
							}
							System.out.println();
						}

						limit++;
						break;
					}
				}
				run = isEnd(x, y);

				while (x + 1 < n && answer[x + 1][y] == 0 && x < n - limit) { //
					answer[++x][y] = index++;
					if (x + 1 == n - limit) {
						for (int i = 0; i < n; i++) {
							for (int j = 0; j < n; j++) {
								System.out.print(answer[i][j] + " ");
							}
							System.out.println();
						}
						limit++;
						break;
					}
				}
				run = isEnd(x, y);
				
				while (answer[x][y - 1] == 0 && y > n - limit) {
					answer[x][--y] = index++;
					if (y - 1 == n - limit) {
						limit++;
						break;
					}
				}
				run = isEnd(x, y);
				while (answer[x - 1][y] == 0 && x > n - limit) {
					answer[--x][y] = index++;
					if (x - 1 == n - limit) {
						limit++;
						break;
					}
				}
				run = isEnd(x, y);
			}
			// 거짓이면 반시계방향
			else {
				while (answer[x][y + 1] == 0 && y < n - limit) {
					answer[x][y++] = index++;
				}
				while (answer[x + 1][y] == 0 && y < n - limit) {
					answer[x++][y] = index++;
				}
				while (answer[x][y - 1] == 0 && y < n - limit) {
					answer[x][y--] = index++;
				}
				while (answer[x - 1][y] == 0 && y < n - limit) {
					answer[x--][y] = index++;
				}
			}
		}
	}

	private static boolean isEnd(int x, int y) {
		boolean answer = true;

		for (int i = 0; i < endPoints.length; i++) {
			if (x == endPoints[i][0] && y == endPoints[i][1]) {
				return !answer;
			}
		}

		return answer;
	}

}