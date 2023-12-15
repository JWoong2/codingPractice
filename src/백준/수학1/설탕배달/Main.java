package 백준.수학1.설탕배달;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;

		while (n % 5 != 0 && n > 0) {
			n -= 3;
			count++;
		}
		count += n / 5;
		

		int answer = (n < 0) ? -1 : count;  
		System.out.println(answer);

	}
}
