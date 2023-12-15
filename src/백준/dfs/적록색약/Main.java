package 백준.dfs.적록색약;

import java.util.Scanner;

public class Main {
	static char[][] paint; 
	static boolean[][] visited; 
	static int N;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		paint = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			paint[i] = sc.next().toCharArray();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) {
					count++;
					dfs(i, j);
				}
			}
		}
		
		System.out.println(count);
		visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(paint[i][j] == 'G') {
					paint[i][j] = 'R';
				}
			}
		}
		
		count = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j]) {
					count++;
					dfs(i, j);
				}
			}
		}
		System.out.println(count);
	}
	
	private static void dfs(int x, int y) {
		char temp = paint[x][y];
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x+ dx[i];
			int ny = y+ dy[i];
			
			if(nx>=0 && ny>=0 && nx <N && ny < N) {
				if(temp == paint[nx][ny] && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
	
}
