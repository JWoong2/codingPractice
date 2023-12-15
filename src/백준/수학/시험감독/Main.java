package 백준.수학.시험감독;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 시험장 개수
		int n = sc.nextInt();

		// 각 시험장 응시자 수
		int[] testTakerNum = new int[n];

		for (int i = 0; i < n; i++) {
			testTakerNum[i] = sc.nextInt();
		}

		// 각 총감독관이 감독할 수 있는 응시자 수
		int b = sc.nextInt();

		// 각 부감독관이 감독할 수 있는 응시자 수
		int c = sc.nextInt();

		// 총 필요한 인원 수
		int answer = 0;
		
		// Math 이용한 버전 
/*		for (int i = 0; i < n; i++) {
			testTakerNum[i] -= b;
			answer++;

			if (!(testTakerNum[i] <= 0)) {
				answer += Math.ceil((double) testTakerNum[i] / c);
			}
		}*/
		
		// Math 사용하지 않은 버전
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
