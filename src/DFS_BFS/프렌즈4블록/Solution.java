package DFS_BFS.프렌즈4블록;

class Solution {
	public static void main(String[] args) {
		int a = solution(4, 5, new String[] { "CCBDE", "AAADE", "AAABF", "CCBBF" });
		int b = solution(4, 4, new String[] { "ABCD", "BACE", "BCDD", "BCDD" });
		System.out.println(a);
		System.out.println(b);
	}

	public static int solution(int m, int n, String[] board) {
		int answer = 0;
		char[][] map = new char[m][n];
		// 한번만 초기화 해줘도 되는건지 아니면 계속해서 초기화 시켜줘야하는건지?
		boolean[][] visited;

		// init
		for (int i = 0; i < m; i++) {
			map[i] = board[i].toCharArray();
		}

		while (true) {
			int cnt = 0;
			visited = new boolean[m][n];

			// checkFour
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					if(map[i][j] != '0') checkFour(map, visited, i, j);
				}
			}

			// check
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (visited[i][j] == true) {
						answer++;
						cnt++;
						map[i][j] ='0';
					}
				}
			}

			System.out.println();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(map[i][j] );
				}
				System.out.println();
			}
			
			// drop blocks
			//역순으로 정렬
			for (int i = m-1; i > 0; i--) {
				for (int j = 0; j < n; j++) {
					dropBlock(map, i, j);
				}
			}
			System.out.println();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(map[i][j] );
				}
				System.out.println();
			}
			

			if (cnt == 0)
				break;
		}

		return answer;

	}

	private static void dropBlock(char[][] map, int i, int j) {
		int index=1;
		if (map[i][j] == '0') {
			while(map[i-index][j] == '0' && i-index > 0) {
				index++;
			}
			map[i][j] = map[i - index][j];
			map[i - index][j] = '0';
		}
	}

	private static void checkFour(char[][] map, boolean[][] visited, int i, int j) {
		char block = map[i][j];

		for (int a = i; a < i + 2; a++) {
			for (int b = j; b < j + 2; b++) {
				if (map[a][b] != block) {
					return;
				}
			}
		}

		for (int a = i; a < i + 2; a++) {
			for (int b = j; b < j + 2; b++) {
				visited[a][b] = true;
			}
		}

	}
}