package 백준.문자열.숫자의합;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		String number = sc.next();
		char[] num = number.toCharArray();
		
		
		int sum =0;
		for(int i = 0; i<size; i++) {
			sum += num[i] - '0';
		}
		
		System.out.println(sum);
	}
}