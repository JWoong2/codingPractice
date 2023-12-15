package 백준.기본기.최대공약수와최소공배수;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gcd(a, b);
		int lcm = lcm(a, b, gcd);
		
		// 최대공약수
		System.out.println(gcd);
		// 최대공배수
		System.out.print(lcm);
	}

	// 유클리드 호제법
	
	//ex) 12345 , 1234
	
	//12345 = 1234*10 +5;
	// 1234 = 5* ( ) + 4;
	// 5 = 4*1 + 1;
	// 4 = 4*1
	// gcd = 1
	
	// 최대공약수 구하는 법 
	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	// 최소공배수 구하는 법	
	public static int lcm(int a, int b, int gcd) {
		return (a * b) / gcd;	
	}
	
}
