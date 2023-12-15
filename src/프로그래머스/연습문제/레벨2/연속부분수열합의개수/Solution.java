package ���α׷��ӽ�.��������.����2.���Ӻκм������ǰ���;

import java.util.HashSet;
import java.util.Set;

class Solution {
	// case 1 : 7,9,1,1,4
	// answer : 18

	public static void main(String[] args) {
		int[] elements = { 7, 9, 1, 1, 4 };

		System.out.println(solution(elements));
	}

	public static int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();

		int arraySum = 0;

		// ù��°�� ������
		for (int i = 0; i < elements.length; i++) {

			arraySum += elements[i];

			// �ι�°�� �ݺ�Ƚ�� �� �ε���
			for (int j = 0; j < elements.length; j++) {
				// ����°�� ����
				int sum = 0;

				for (int k = j; k < j + i; k++) {
					sum += elements[k % elements.length];
				}

				if(sum != 0) set.add(sum);
			}
		}

		set.add(arraySum);

		return set.size();
	}
}