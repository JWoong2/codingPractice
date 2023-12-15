package 알고리즘랩스.level10.합병정렬;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Please Enter Your Code Here
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] findNumArray = new int[m];
		
		for(int i=0; i<m; i++) {
			findNumArray[i] = sc.nextInt();
		}

		for(int i=0; i<m; i++) {
			int index = binarySearch(arr, 0, n - 1, findNumArray[i]);
			
			if (index == -1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		
		return;
	}

	private static int binarySearch(int arr[], int myStart, int myEnd, int value) {
		int start, end;
		int mid;
		
		// start : value 보다 항상 작은 값을 가리킴
		// end : value 보다 항상 큰 값을 가리킴
		if(arr[myStart] > value) return -1;
		else if(arr[myStart] == value) return myStart;
		
		if(arr[myEnd] < value) return -1;
		else if(arr[myEnd] == value) return myEnd;

		start = myStart;
		end = myEnd;
		
		while(start+1 < end) {
			mid = (start + end ) /2;
			if(arr[mid] == value) return mid;
			else if(arr[mid] >value) end = mid; 
			else start = mid; 
		}
		
		return -1;
	}
}