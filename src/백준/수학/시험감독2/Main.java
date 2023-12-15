package ����.����.���谨��2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// ������ ����
		// int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());
		// �� ������ ������ ��
		int[] testTakerNum = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			testTakerNum[i] = Integer.parseInt(st.nextToken());
		}

		/*
		 * for (int i = 0; i < n; i++) { testTakerNum[i] = sc.nextInt(); }
		 */

		st = new StringTokenizer(br.readLine());
		
		// �� �Ѱ������� ������ �� �ִ� ������ ��
		// int b = sc.nextInt();
		int b = Integer.parseInt(st.nextToken());	

		// �� �ΰ������� ������ �� �ִ� ������ ��
		// int c = sc.nextInt();
		int c = Integer.parseInt(st.nextToken());

		// �� �ʿ��� �ο� ��
		long answer = 0;

		// Math ������� ���� ����
		for (int i = 0; i < n; i++) {
			testTakerNum[i] -= b;
			answer++;

			if (testTakerNum[i] > 0) {
				answer += testTakerNum[i] / c;
				if (testTakerNum[i] % c != 0)
					answer++;
			}
		}

		System.out.println(answer);
	}
}
