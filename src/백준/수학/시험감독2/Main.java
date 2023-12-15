package 백준.수학.시험감독2;

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

		// 시험장 개수
		// int n = sc.nextInt();
		int n = Integer.parseInt(br.readLine());
		// 각 시험장 응시자 수
		int[] testTakerNum = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			testTakerNum[i] = Integer.parseInt(st.nextToken());
		}

		/*
		 * for (int i = 0; i < n; i++) { testTakerNum[i] = sc.nextInt(); }
		 */

		st = new StringTokenizer(br.readLine());
		
		// 각 총감독관이 감독할 수 있는 응시자 수
		// int b = sc.nextInt();
		int b = Integer.parseInt(st.nextToken());	

		// 각 부감독관이 감독할 수 있는 응시자 수
		// int c = sc.nextInt();
		int c = Integer.parseInt(st.nextToken());

		// 총 필요한 인원 수
		long answer = 0;

		// Math 사용하지 않은 버전
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
