package april.week2.Ex1;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {500, 100, 50, 10};
		int exchange[] = new int[arr.length];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է����ּ��� : ");
		
		int money = sc.nextInt();
		int index = 0;
		
		while(money >0 ) {
			exchange[index] = money/arr[index];
			money = money%arr[index++];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "���� " + exchange[i] + "��");
		}
		
	}

}
