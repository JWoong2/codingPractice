package 백준.bfs.영역구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

public class Main {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int[][] grid;
	static int count = 0;
	static boolean[][] visited;
	static int m,n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		int k = sc.nextInt();

		// 영역의 개수
		// 답을 오름차순으로 ex) 1 7 13
		visited = new boolean[m][n];
		grid = new int[m][n];

		for (int i = 0; i < 3; i++) {
			Point p1 = new Point(sc.nextInt(), sc.nextInt());
			Point p2 = new Point(sc.nextInt(), sc.nextInt());

			setRectangle(p1, p2);
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != 0 && !visited[i][j]) {
					bfs(i, j);
				}
			}
		}
		System.out.println(count);

	}

	private static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(x,y));
		
		while(!queue.isEmpty()) {
			Point temp = queue.poll();
			
			for(int i=0; i<4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if(nx>=0 && ny>=00 && nx<m && ny<n) {
					if(grid[nx][ny] != 0 && !visited[nx][ny]) {
						count++;
						visited[nx][ny] = true;
					}	
				}
				
			}
		}
	}

	private static void setRectangle(Point x, Point y) {
		for (int i = x.x; i < y.x; i++) {
			for (int j = x.y; j < y.y; j++) {
				grid[j][i] = 1;
			}
		}
	}
}
