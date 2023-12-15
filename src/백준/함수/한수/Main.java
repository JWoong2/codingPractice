package 백준.함수.한수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		boolean[] chk = new boolean[num];
		int overHundred = 99;
		
		if(num < 100) {
			System.out.println(num);
		} else {
			for(int i=100; i<=num; i++) {
				overHundred += checkHan(i);
			}
			System.out.println(overHundred);
		}
		
	}

	private static int checkHan(int num) {
		int count = 0;
		if(num == 1000) return 0;
		List<Integer> list = new ArrayList<Integer>();
		
		while(num !=0) {
			list.add(num%10);
			num /=10;
		}
		
		if( list.get(2) - list.get(1) == list.get(1) - list.get(0) ) count++;
			
		return count;
	}
}

