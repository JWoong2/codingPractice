package 백준.투포인터.부분합;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start=0, end=0, sum=0;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		while(true) {
			if(sum >= s) {
				sum -= arr[start++];
			}else if(end == n) {
				break;
			}else {
				sum += arr[end++];
			}
			
			if(sum == s) {
				queue.add(end-start);
			}
		}
		
		System.out.println(queue.poll());
	}
}
