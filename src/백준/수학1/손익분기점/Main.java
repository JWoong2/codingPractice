package ����.����1.���ͺб���;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long answer = -1;
		if(b>=c) {
			System.out.println(answer);
		}else {
			long temp = Math.abs(c-b);
			answer = a/temp; 
			
			System.out.println(++answer);	
		}
		
	}
}