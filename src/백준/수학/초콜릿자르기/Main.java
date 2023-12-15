package 백준.수학.초콜릿자르기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int answer = 0;
		answer += N-1;
		answer += (M-1)*N;
		
		System.out.println(answer);
	}
}
