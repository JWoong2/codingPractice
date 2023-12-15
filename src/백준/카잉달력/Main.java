package ¹éÁØ.Ä«À×´Ş·Â;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //³× ¹ß°ÉÀ½Àº ÃÑ~ ÃÑ
		
		int[] countArray = new int[T];
		for(int i=0; i<T; i++) {
			countArray[i] = -1;
		}
		int count = 0;
		
		
		for(int i=0; i<T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			count = 0;

			
			
		}
		
		for(int i : countArray) {
			System.out.println(i);
		}
		
		
	}
	
	public static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}

	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int r = a % b;
	        a = b;
	        b = r;
	    }
	    return a;
	}
}

//time over 
//while(front != M || rear != N) {
//	if( front == M) {
//		front = 1;
//	}else {
//		front++;	
//	}
//	if( rear == N) {
//		rear = 1;
//	}else rear++; 
//	
//	count++;
//	if(front == x) {
//		if(rear == y) {
//			countArray[i] = count;
//			break;
//		}
//	} 
//}