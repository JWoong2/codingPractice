package 알고리즘랩스.level8.inequal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean[] visited = new boolean[10];
	static ArrayList<String> list = new ArrayList<String>();
	static String[] input;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Please Enter Your Code Here
		n = sc.nextInt();
		
		input = new String[n];
		
		for(int i=0; i<n; i++) {
			input[i] = sc.next();	
		}

		for(int i=0; i<=9; i++) {
			visited[i] = true;
			dfs(i, 0, i+"");
		}
		System.out.println(list.get(list.size() -1 ));
		System.out.println(list.get(0));
		
	}
	
	private static void dfs(int v, int cnt, String str) {
		if(cnt == n) {
			list.add(str);
		}
		else {
			for(int i=0; i<=9; i++) {
				if(!visited[i]) {
					if( input[cnt].equals("<")) {
						if( v>= i) {
							continue;
						}
					}else {
						if( v<= i) {
							continue;
						}
					}
					
					visited[i] = true;
					dfs(i, cnt+1, str+i);
				}
			}
		}
		visited[v] = false;
	}
}