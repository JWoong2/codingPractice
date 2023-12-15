package _월간코드챌린지.쿼드트리;

class Solution {
	static int[][] array;
	static int[] answer;

	public static void main(String[] args) {
		int[] test = solution(new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 } });

		for (int i : test) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[][] arr) {
		answer = new int[2];
		array = arr;

		int size = arr.length;

		if (size == 1) {
			answer[arr[0][0]]++;
			return answer;
		}

		while (size != 1) {
			quardTree(array, size);
			size /= 2;
		}

		countResult();

		return answer;
	}

	private static void quardTree(int[][] arr, int size) {
		int x = 0, y = 0;

		while (x < arr.length && y < arr[0].length) {
			boolean isQuard = true;
			int temp = arr[x][y];

			for (int i = x; i < x + size; i++) {
				for (int j = y; j < y + size; j++) {
					System.out.println("x좌표 " + i + "y좌표 " + j + " " + arr[i][j] + " " + temp);
					if (temp != arr[i][j]) {
						isQuard = false;
						break;
					}
				}
				if (!isQuard)
					break;
			}

			// temp 값 체크하고 값 올려주기!
			if (isQuard) {
				for (int i = x; i < x + size; i++) {
					for (int j = y; j < y + size; j++) {
						array[i][j] = -1;
					}
				}

				array[x][y] = temp;
			}

			if (x + size < arr.length) {
				x += size;
			} else {
				x = 0;
				if (y + size < arr[0].length) {
					y += size;
				} else {
					y = 0;
				}
			}

			if (x == 0 && y == 0)
				break;
		}
	}

	private static void countResult() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] != -1) {
					answer[array[i][j]]++;
				}
			}
		}

	}
}