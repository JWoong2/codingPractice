package week2.Ex1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("1. �л� �� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("�л� �� : ");
				scores = new int[sc.nextInt()];

				break;

			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >");
					scores[i] = sc.nextInt();
				}

				break;

			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}
				break;

			case 4:
				int max = 0;
				int sum = 0;
				for (int i : scores) {
					if (i > max)
						max = i;
					sum += i;
				}
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + (double) sum / scores.length);

				break;
			case 5:
				run = false;
				break;

			default:
				break;
			}
		}

	}

}
