package week1.Ex5;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 90, 20, 30, 70, 80, 75, 84, 91, 49, 69 };
		Arrays.sort(arr);
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
		System.out.println("�հ� : " + sum + " ��� : " + (double) sum / arr.length);
		System.out.println("�ְ����� : " + arr[arr.length - 1] + " �������� : " + arr[0]);
	}
}