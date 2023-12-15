package 알고리즘랩스.레벨3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y;
	int range;
	public Point(int x, int y, int range) {
		super();
		this.x = x;
		this.y = y;
		this.range = range;
	}
}

public class AttackRange {
	static String[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new String[N][N];
		visited = new boolean[N][N];

		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		int range = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (x == i && y == j) {
					map[i][j] = "x";
				} else {
					map[i][j] = "0";
				}
			}
		}

		bfs(x, y, range);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void bfs(int x, int y, int range) {
		// TODO Auto-generated method stub
		Queue<Point> queue = new LinkedList<>();
		queue.add(new Point(x, y, 1));

		while (!queue.isEmpty()) {
			Point temp = queue.poll();

			if(temp.range == range+1) break;
			
			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				
				if(nx>=0 && ny>=0 && nx<map.length && ny<map.length) {
					if(map[nx][ny] == "0" && !visited[nx][ny]) {
						visited[nx][ny] = true;
						map[nx][ny] = Integer.toString(temp.range);
						queue.add(new Point(nx,ny, temp.range+1));
					}
				}
			}
			
		}
	}
}
