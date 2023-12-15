package _�����ڵ�.���θ�;

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

		// �ѹ� �̸� 1 �ִ°� ���ְ�
		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 1) {
				// ��׸� String ���ٰ� �־������ �迭�� ���ٱ�?
				array[delivery[i][0]-1] = "O";
				array[delivery[i][1]-1] = "O";
			}
		}

		for (int i = 0; i < delivery.length; i++) {
			if (delivery[i][2] == 0) {
				// �ƴ� �ֵ� �߿��� X�� �־��ָ�?
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