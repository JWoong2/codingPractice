package 숫자의개수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 150  427  266 

		 int num = sc.nextInt();
		num*=sc.nextInt();
		num*=sc.nextInt();

		int[] arr = new int[10];
		
		
		while(num >0 ) {
			int nmg = num%10;
			num = num/10;
			arr[nmg]++;
			
		}
		
		int index = 0;
		for(int i : arr) {
			System.out.println(index++ + "번째 : " + i);
		}
	}

}
