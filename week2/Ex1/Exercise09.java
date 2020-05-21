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
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("학생 수 : ");
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
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double) sum / scores.length);

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
