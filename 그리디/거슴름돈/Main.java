package ±×¸®µð.°Å½¿¸§µ·;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int change = 1000- sc.nextInt();
		int answer = 0 ;
		int[] array = {500, 100, 50 , 10 ,5 ,1};
		int index = 0;
		//  
		while(change!=0) {
			int money = change/ array[index];
			change -= money * array[index++];
			answer += money;
		}
		
		System.out.println(answer);
	}

}
