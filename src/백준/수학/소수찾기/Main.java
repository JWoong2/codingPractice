package 백준.수학.소수찾기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			answer += isPrime(sc.nextInt());
		}
		
		System.out.println(answer);
	}
	
	private static int isPrime(int num) {
		if(num < 2) return 0;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
