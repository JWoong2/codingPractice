package _Dev_matching.»óÇÏÁÂ¿ì;

public class Solution {
	public static void main(String[] args) {
		int a = solution(new String[]{"U", "U", "R", "D", "L", "L", "L", "U", "R", "D", "D", "D", "L", "U", "R", "R", "R", "D", "L", "U"});
		System.out.println( a);
	}

	public static int solution(String[] moves) {
		int answer = 0;
		//boolean[][] visited = new boolean[1000][1000];
		//int x = 500, y = 500;
		boolean[][] visited = new boolean[9][9];
		int x = 3, y = 3;
		
		for (int i = 0; i < moves.length; i++) {
			switch (moves[i]) {
			case "U":
				visited[x][y++ + 1] = true;
				break;

			case "D":
				visited[x][y-- - 1] = true;
				break;

			case "R":
				visited[x++ + 1][y] = true;
				break;

			case "L":
				visited[x-- - 1][y] = true;
				break;

			default:
				break;
			}
		}

		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				if (visited[i][j]) {
					int count =0;
					for (int a = i; a < i + 2; a++) {
						for (int b = j; b < j + 2; b++) {
							if (visited[a][b]) {
								count++;
							} else
								break;
						}
					}
					if(count==4) {
						answer++;	
					}
					
				} else
					continue;
			}
		}

		
		
		return answer;
	}

}