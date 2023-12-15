package week1.Ex4;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요  : ");
		Scanner sc = new Scanner(System.in);
		int targetNumber = sc.nextInt();
		
		for(int i = 1 ; i<10; i++) {
			System.out.println(targetNumber+ " * " + i + " = " +  targetNumber*i);
			}
		
		//역순
		for(int i = 9 ; i>0; i--) {
			System.out.println(targetNumber+ " * " + i + " = " +  targetNumber*i);
			}
		
		
	}

}
