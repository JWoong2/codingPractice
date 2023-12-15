package ¿¬½À¹®Á¦.Çà·ÄÀÇµ¡¼À;

class Solution {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		int[][] arr3 = { { 1 }, { 2 } };
		int[][] arr4 = { { 3 }, { 4 } };
		
		int[][] ans = solution(arr1, arr2);

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		test(arr3, arr4);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}
	
	private static void test(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		answer[0][0] = arr1[0][0] + arr2[0][0];
		answer[1][0] = arr1[1][0] + arr2[1][0];
		
		
	}
}