package 완전탐색.소수찾기;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = solution("17");
		int b = solution("011");

		System.out.println(a);
		System.out.println(a + " " + b);
	}

	public static int solution(String numbers) {
		int answer = 0;

		int[] arr = new int[numbers.length()];
		for (int i = 0; i < arr.length; i++) { //0 1
			arr[i] = numbers.charAt(i) - '0';
		}

		Set<Integer> primeList =new HashSet<>();
		
		for (int i = 1; i <= arr.length; i++) {
			perm(primeList, arr, 0, i);
		}
		
		Iterator<Integer> it = primeList.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			if(i<=1) continue;
			//데이터 값 
			System.out.println(i);
			answer = isPrime(i) ? answer+1 : answer;
		}
		
		return answer;
	}

	//
	public static int createInteger(int[] arr, int r) {
		StringBuilder numberBuilder = new StringBuilder();
		for (int i = 0; i < r; i++) {
			numberBuilder.append(arr[i]);
		}

		return Integer.parseInt(numberBuilder.toString());
	}

	//순열 함수
	public static void perm(Set<Integer> primeList, int[] arr, int index, int r) {
		if (index == r) {
			primeList.add(createInteger(arr, r));
			return;
		} else {
			for (int i = index; i< arr.length; i++) {
				swap(arr, i, index); //
				perm(primeList, arr, index + 1, r);
				swap(arr, i, index);
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// 소수 구하는 함수
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}