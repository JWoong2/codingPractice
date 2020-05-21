package week1.Ex5;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
		/*
		 * boolean stop = false; int random = (int) (Math.random()*100 + 1 ) ; Scanner
		 * sc = new Scanner(System.in); System.out.println("1~100 이상의 정수를 입력하세요 : ");
		 * while(!stop) { int num = sc.nextInt(); if(num == random) { stop = true;
		 * System.out.println("정답!!"); } else { System.out.println("다시 해보세요 :) "); } }
		 */
        
		boolean visit[] = new boolean[30];
		
		for(int i = 0 ; i< visit.length; i++){
		System.out.println(visit[i]);
		}
	}
}
