package ����.�⺻��.������;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �׽�Ʈ ���̽� ��
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int index = 0;
			
			while (num != 0) {
				if (num % 2 == 1) {
					System.out.print(index+" ");
				}

				index++;
				num /= 2;
			}
		}

	}
}
