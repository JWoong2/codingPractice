package 알고리즘랩스.level10.NN단표;

import java.util.Scanner;

public class Main {
	static int n ;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// Please Enter Your Code Here
		n = sc.nextInt();
		long k = sc.nextLong();
		// 1 ~ n* n
		// 구하고자 하는 숫자 p는 몇번째인가?
		
		long start = 1, end = n*n+1;
		
		while(start+1 < end) {
			// start : 항상 정답이 되는 숫자보다 작거나 같은 숫자
			// end : 항상 정답이 되는 숫자보다 큰 숫자
			long mid = (start + end) / 2;
			long myOrder = getOrder(mid);
			
			if(myOrder <= k ) {
				start = mid;
			}else {
				end = mid;
			}
		}
		
		System.out.println(start);
	}
	
	private static long getOrder(long x) {
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			if((long)(i*n) < x) result += n;
			else {
				if(x % i == 0) result += (x/i) -1;
				else result += x/i;	
			}
		}
		
		return result+1;
	}
}