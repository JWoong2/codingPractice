package 백준.그리디.주유소;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 4

		long[] distance = new long[n - 1]; // 2
		long[] gasPrice = new long[n]; // 3

		for (int i = 0; i < distance.length; i++) {
			distance[i] = sc.nextInt();
		}

		for (int i = 0; i < gasPrice.length; i++) {
			gasPrice[i] = sc.nextInt();
		}

		// BigInteger answer = new BigInteger("0");
		// BigInteger temp;
		long answer = 0;
		int min = 1000000000;

		// 가장 작은거 만날때까지 하면 되는거 아닌가?
		for (int i = 0; i < distance.length; i++) {
			if (i == 0) {
				// temp = new BigInteger(Integer.toString(distance[i] * gasPrice[i]));
				// answer = answer.add(temp);
				answer += distance[i] * gasPrice[i];
				min = (int) gasPrice[i];
				continue;
			}

			if (min > gasPrice[i]) {
				min = (int) gasPrice[i];
			}
			// temp = new BigInteger(Integer.toString(min * distance[i]));
			// answer = answer.add(temp);
			answer += min * distance[i];
		}

		// System.out.println(answer.toString());
	}
}
