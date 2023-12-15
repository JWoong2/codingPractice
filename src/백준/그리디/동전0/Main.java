package 백준.그리디.동전0;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		
		int[] coins = new int[n];

		for(int i=0; i<coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int i=coins.length-1; i>=0; i--) {
			if(coins[i] > k) continue;

			answer += k / coins[i];
			
			if(coins[i] % k == 0 ) {
				break;
			}else {
				k %= coins[i];
			}
		}
		
		System.out.println(answer);
	}
}
