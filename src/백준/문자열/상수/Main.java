package 백준.문자열.상수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String anum = "", bnum="";
		while(a != 0 ) { 
			anum += a%10;
			a/=10;
		}
		
		while(b != 0 ) { 
			bnum += b%10;
			b/=10;
		}
		
		a =Integer.parseInt(anum);
		b =Integer.parseInt(bnum);
		
		int answer = (a >= b) ? a : b;
		System.out.println(answer);
	}
	
}
