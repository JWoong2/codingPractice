package ����.�⺻��.�ִ��������ּҰ����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gcd(a, b);
		int lcm = lcm(a, b, gcd);
		
		// �ִ�����
		System.out.println(gcd);
		// �ִ�����
		System.out.print(lcm);
	}

	// ��Ŭ���� ȣ����
	
	//ex) 12345 , 1234
	
	//12345 = 1234*10 +5;
	// 1234 = 5* ( ) + 4;
	// 5 = 4*1 + 1;
	// 4 = 4*1
	// gcd = 1
	
	// �ִ����� ���ϴ� �� 
	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	// �ּҰ���� ���ϴ� ��	
	public static int lcm(int a, int b, int gcd) {
		return (a * b) / gcd;	
	}
	
}
