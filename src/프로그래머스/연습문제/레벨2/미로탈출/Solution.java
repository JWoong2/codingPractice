package 프로그래머스.연습문제.레벨2.미로탈출;

import java.util.PriorityQueue;


class Node implements Comparable<Node> {
	int x,y;
	int index;
	public Node(int x, int y, int index) {
		super();
		this.x = x;
		this.y = y;
		this.index = index;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.index - o.index;
	}
}


class Solution {
	public static void main(String[] args) {
		String[] testCase3 = {"SELXX", "XXXXX", "XXXXX", "XXXXX", "XXXXX"};
		System.out.println(solution(testCase3));
	}
	
	static char[][] board;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int xSize;
    static int ySize;
    
	public static int solution(String[] maps) {
		Node start = null;
		Node lever = null;
        xSize = maps.length;
        ySize = maps[0].length();
        
		board = new char[xSize][ySize];
		
		for(int i=0; i<xSize; i++) {
			char[] temp = maps[i].toCharArray();
			for(int j=0; j<ySize; j++) {
				board[i][j] = temp[j];
				
				if(temp[j] == 'S') {
					start = new Node(i, j, 0);
				}
				
				if(temp[j] == 'L') {
					lever = new Node(i, j, 0);
				}
			}
		}
		
		Node result = bfs(start, 'L');
		Node result2 = bfs(lever, 'E');
		
		if(result.index != 0 && result2.index != 0 ) {
			return result.index + result2.index;
		}else {
			return -1;
		}
	}

	public static Node bfs(Node nd, char des) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(nd);
		boolean[][] visited = new boolean[xSize][ySize];
		
		while(!pq.isEmpty()) {
			Node temp = pq.poll();
			int x = temp.x;
			int y = temp.y;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >=0 && ny >= 0 && nx <xSize && ny <ySize) {
					if(board[nx][ny] == des && !visited[nx][ny]) {
						visited[nx][ny] = true;
						return new Node(nx, ny, temp.index+1);
					}else if(board[nx][ny] != 'X' && !visited[nx][ny]) {
						visited[nx][ny] = true;
						pq.add(new Node(nx, ny, temp.index+1));
					}
				}
			}
		}
		
		return new Node(0, 0, 0);
	}
}