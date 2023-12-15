package 알고리즘랩스.level5.streetree;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] interval = new int[n-1];
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<interval.length; i++) {
			interval[i] = array[i+1] - array[i];
		}

		for(int i=1; i<interval.length; i++) {
			interval[i] = gcd(interval[i], interval[i-1]);
		}
		
		int gcd = interval[interval.length-1];
		int first = array[0];
		int last = array[n-1];
		
		System.out.println((last-first)/gcd-n+1);
	}
	
	private static int gcd(int a, int b) {
		while(true) {
			int r = a%b;
			
			if( r == 0) {
				return b;
			}
			
			a= b;
			b= r;
		}
	}
}
