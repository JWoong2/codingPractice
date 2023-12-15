package 알고리즘랩스.레벨3;

import java.util.Scanner;

public class Maxofarr {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int x = 0;
		int y= 0;
		int max = 0;
		int temp = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				temp = sc.nextInt();
				if(max < temp) {
					max = temp;
					x = i+1;
					y = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(x + " " + y);
	}
}
