package ���α׷��ӽ�.��������.����2.�ּڰ������;

import java.util.Arrays;
import java.util.Collections;

// ȿ���� ����
// ��������, �������� ���� �ٽ� �����غ���

class Solution {
	public static void main(String[] args) {

	}

	public int solution(int[] A, int[] B) {
		int answer = 0;

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("Hello Java");

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length-i];
		}

		return answer;
	}
}