package 유클리드호제법;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = a;
		int B = b;

		int GCD, LCM;

		while (true) {
			int r = a % b;

			if (r == 0) {
				GCD = b;
				break;
			}

			a = b;
			b = r;
		}

		System.out.println(GCD);

		LCM = (A / GCD) * (B / GCD) * GCD;

		System.out.println(LCM);

		return;
	}
}