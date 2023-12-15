package 백준.수학1.달팽이.Binary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, v;
		a = sc.nextLong();
		b = sc.nextLong();
		v = sc.nextLong();
		long answer = (long) Math.ceil(((v-b)/(a-b)));
		System.out.println(answer);
	}
}
