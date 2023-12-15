package _�����ڵ�ç����.�ﰢ������;

class Solution {
	public static void main(String[] args) {
		int[] ans = solution(4);
		
		for( int i : ans) {
			System.out.println(i);
		}
	}

	public static int[] solution(int n) {
		int[][] arr = new int[n][n];

		int max = getMax(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = -1;
			}
		}

		int[] answer = new int[max];

		int i = 0, j = 0, k = 1;

		arr[i][j] = k;

		while (k < max) {
			while (i + 1 < n && k < max && arr[i + 1][j] < 0) {
				arr[++i][j] = ++k;
			}

			while (j + 1 < n && k < max && arr[i][j + 1] < 0) {
				arr[i][++j] = ++k;
			}

			while (i - 1 > 0 && i - 1 > 0 && k < max && arr[i - 1][j - 1] < 0) {
				arr[--i][--j] = ++k;
			}
		}

		k = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				answer[k++] = arr[i][j];
			}
		}
		return answer;
	}

	static int getMax(int n) {
		return n == 1 ? 1 : getMax(n - 1) + n;
	}
}