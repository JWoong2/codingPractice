package ����.����.���谨��;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ ����
		int n = sc.nextInt();

		// �� ������ ������ ��
		int[] testTakerNum = new int[n];

		for (int i = 0; i < n; i++) {
			testTakerNum[i] = sc.nextInt();
		}

		// �� �Ѱ������� ������ �� �ִ� ������ ��
		int b = sc.nextInt();

		// �� �ΰ������� ������ �� �ִ� ������ ��
		int c = sc.nextInt();

		// �� �ʿ��� �ο� ��
		int answer = 0;
		
		// Math �̿��� ���� 
/*		for (int i = 0; i < n; i++) {
			testTakerNum[i] -= b;
			answer++;

			if (!(testTakerNum[i] <= 0)) {
				answer += Math.ceil((double) testTakerNum[i] / c);
			}
		}*/
		
		// Math ������� ���� ����
		for (int i = 0; i < n; i++) {
			testTakerNum[i] -= b;
			answer++;

			if(testTakerNum[i] > 0 ) {
				answer += testTakerNum[i] / c;
				if(testTakerNum[i] % c != 0 ) answer++;
			}
		}
		
		System.out.println(answer);
	}
}
