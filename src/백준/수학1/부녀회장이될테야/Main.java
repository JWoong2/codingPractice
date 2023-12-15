package 백준.수학1.부녀회장이될테야;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[] room = new int[n];
			for(int a=0; a<n; a++) {
				room[a] = a+1;
			}
			
			for(int a=1; a<=k; a++) {
				for(int b=0; b<n; b++) {
					if(b==0) {
						room[b] = 1;
					}else {
						room[b] = room[b-1] + room[b];
					}
				}
			}
		
			if(i == T) {
				System.out.print(room[n-1]);
			}else {
				System.out.println(room[n-1]);
			}
		}
	}
}
