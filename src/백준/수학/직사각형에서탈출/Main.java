package 백준.수학.직사각형에서탈출;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int row = w-x < x ? w-x : x;
		int column = h-y < y ? h-y : y;
		
		if(row < column) System.out.println(row);
		else System.out.println(column);
	}
}
