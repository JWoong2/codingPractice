package 백준.그리디.캠핑;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int l,p,v;
		int maxDay = 0;
		int index = 1;
		
		while(true) {
			l = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();
			
			if(l == 0 & p == 0 && v == 0 ) break;
			
			maxDay = v/p * l;
			v = v%p;
			if(v > l ) {
				maxDay += l;
			}else maxDay += v; 
			
			System.out.println("Case " + index++ + ": " + maxDay);
		}
	}
}
