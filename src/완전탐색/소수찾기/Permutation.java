package 완전탐색.소수찾기;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7};
		
		for(int i=1; i<arr.length+1; i++) perm(arr, 0, arr.length, i); 
		
	}
	
	public static void perm(int[] arr, int depth, int n, int k) {
		if (depth == k) {
			print(arr, k);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(arr, depth + 1, n, k);
			swap(arr, i, depth);
		}
	}

	public static void print(int[] arr, int k ) {
		for(int i = 0; i<k; i++) {
			if(i == k -1 ) System.out.println(arr[i]);
			else System.out.print(arr[i] + ",");
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
