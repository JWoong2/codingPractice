package ����.��ŸƮ�ý�;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
	int x, y;
	int count = 0;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, int count) {
		super();
		this.x = x;
		this.y = y;
		this.count = count;
	}
}

public class Main {
	static int[][] board;
	static boolean[][] visited;
	static int N, M, F; // Row, Column, Fuel
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static Point[] customer, destination;
	static boolean[] arrive;
	static Point taxi;
	static boolean enoughFuel = true;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		F = sc.nextInt();

		board = new int[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt() - 1;
		int y = sc.nextInt() - 1;
		taxi = new Point(x, y);

		customer = new Point[M];
		destination = new Point[M];
		arrive = new boolean[M];

		for (int i = 0; i < M; i++) {
			customer[i] = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
			destination[i] = new Point(sc.nextInt() - 1, sc.nextInt() - 1);
		}

		int temp = M;
		int chargeFuel = 0;
		for (int i = 0; i < M; i++) {
			if (enoughFuel) {
				temp = findNearCustomer();  
			} else {
				System.out.println(-1);
				return ;
			}
			if (enoughFuel) {
				chargeFuel = searchDestiny(temp);
			}
			else {
				System.out.println(-1);
				return ;
			}
			F = F + chargeFuel*2;
		}
		
		long end = System.currentTimeMillis() - start;
		System.out.println(end);
		System.out.println(F);
	}

	// �ýÿ� ���� ����� �°��� ã�� �޼ҵ�
	// �ִܰŸ��� ���������� �� �� �� ��ȣ�� �� ���� �°����Է� ����.
	private static int findNearCustomer() {
		int[] pathCnt = new int[M];

		//�� �Ÿ� �� ���ϰ�
		for (int i = 0; i < M; i++) {
			if (arrive[i])
				continue;
			visited = new boolean[N][N];
			customer[i].count = 0;
			pathCnt[i] = bfs(taxi, customer[i]);
		}

		int min = Integer.MAX_VALUE;
		int index = 0;
		
		//�ּҰ��� �����ش�
		for (int i = 0; i < M; i++) {
			if (arrive[i])
				continue;
			if (min > pathCnt[i]) {
				min = pathCnt[i];
				index = i;
			} else if (min == pathCnt[i]) {
				index = customer[i].x < customer[index].x ? i : index;
			}
		}
		
		if (F - min <= 0) {
			enoughFuel = false;
		} else {
			taxi = customer[index];
			arrive[index] = true;
			F -= min;
		}
		return index;
	}

	// ���������� ���� ����� ��� ã�� �޼ҵ�
	// �⸧�� ä������ ���� �°��� ������ ������ ���� �Ҹ� �� x 2��
	private static int searchDestiny(int a) {
		int pathCnt = 0;

		visited = new boolean[N][N];
		pathCnt = bfs(taxi, destination[a]);
		taxi = destination[a];
		if (F - pathCnt <= 0) {
			enoughFuel = false;
		} else {
			F -= pathCnt;
		}
		
		return pathCnt;
	}

	// �°� ã�ư��� && ������ ã�ư���
	private static int bfs(Point start, Point end) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(start);
		visited[start.x][start.y] = true;

		while (!queue.isEmpty()) {
			Point temp = queue.poll();
			if (temp.x == end.x && temp.y == end.y) {
				return temp.count;
			}

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (!visited[nx][ny] && board[nx][ny] == 0) {
						queue.add(new Point(nx, ny, temp.count + 1));
						visited[nx][ny] = true;
					}
				}
			}
		}

		return Integer.MAX_VALUE;
	}
}
