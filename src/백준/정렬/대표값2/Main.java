package ����.����.��ǥ��2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] array = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int temp = scan.nextInt();
			array[i] = temp;
			sum += temp;
		}
		
		for(int i = 1; i < 5; i++) {
			// Ÿ�� �ѹ�
			int target = array[i];
			
			int j = i - 1;
			
			// Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
			while(j >= 0 && target < array[j]) {
				array[j + 1] = array[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j--;
			}
			
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + 1 �� ��ġ�ϰ� �ȴ�.
			 */
			array[j + 1] = target;	
		}
		
		System.out.println(sum/5);
		System.out.println(array[2]);
		
	}

}
