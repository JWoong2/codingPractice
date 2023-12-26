package 백준.실버.블랙잭;

import java.util.Scanner;

public class Main {
	public static boolean[] visited;
	public static int[] array;
	public static int n;
	public static int sum;
	public static int answer = 0;
	public static int[] sumArray = new int[3];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		sum = scan.nextInt();
		array = new int[n];
		visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			array[i] = scan.nextInt();
		}
		
		dfs(0);
		
		System.out.println(answer);
	}
	
	public static void dfs(int depth) {
		if(depth == 3) {
			int temp = 0;
			
			for(int i=0; i<3; i++) {
				System.out.println(sumArray[i]);
				temp+= sumArray[i];
			}

			if(temp <= sum) {
				answer = Math.max(answer, temp);  
			}
			
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				sumArray[depth] = array[i]; 
				dfs(depth+1);
				visited[i] = false;
			}
		}
	}
}
