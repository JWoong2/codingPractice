package 프로그래머스.연습문제.레벨1.공원산책;

public class Solution {
	public static void main(String[] args) {
		String[] park = { "SOO", "OOO", "OOO" };
		String[] routes = { "E 2", "S 2", "W 1" }; 
		// result : [2,1]
		String[] park2 = {"SOO",
						  "OXX",
						  "OOO"}; 
		String[] routes2 = {"E 2","S 2","W 1"}; 
		// result : [0,1]
		String[] park3 = {"OSO",
						  "OOO",
						  "OXO",
						  "OOO"}; 
		String[] routes3 = {"E 2","S 3","W 1"}; 
		// result : [0,0]
		
		int[] answer = solution(park2, routes2);

		for (int i : answer) {
			System.out.println(i);
		}
	}

	static int curX=0, curY = 0;
	static char[][] board;
	static int x;
	static int y;
	
	public static int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		x = park.length;
		y = park[0].length();

		board = new char[x][y];

		// 초기화
		for (int i = 0; i < x; i++) {
			char[] temp = park[i].toCharArray();
			for (int j = 0; j < y; j++) {
				board[i][j] = temp[j];

				if (temp[j] == 'S') {
					curX = i;
					curY = j;
				}
			}
		}
		
		for(int i=0; i<routes.length; i++) {
			check(routes[i]);	
		}
		
		answer[0] = curX;
		answer[1] = curY;

		return answer;
	}
	
	public static boolean check(String route) {
		
		String[] tempArray = route.split(" ");
		int tempX = curX;
		int tempY = curY;
		
		switch (tempArray[0]) {
		case "E":
			if(curY + Integer.parseInt(tempArray[1]) >= y) {
				return false;
			}
			
			for(int j=0; j<Integer.parseInt(tempArray[1]); j++) {
				if(board[curX][tempY +(1 * (j+1))] == 'X') {
					return false;
				}
			}
			
			curY += Integer.parseInt(tempArray[1]);
			
			break;
		case "S":
			if(curX + Integer.parseInt(tempArray[1]) >= y) {
				return false;
			}
			
			for(int j=0; j<Integer.parseInt(tempArray[1]); j++) {
				if(board[tempX +(1 * (j+1))][curY] == 'X') {
					return false;
				}
			}
			
			curX += Integer.parseInt(tempArray[1]);

			break;
		case "W":
			if(curY - Integer.parseInt(tempArray[1]) < 0) {
				return false;
			}
			
			for(int j=0; j<Integer.parseInt(tempArray[1]); j++) {
				if(board[curX][tempY -(1 * (j+1))] == 'X') {
					return false;
				}
			}
			
			curY -= Integer.parseInt(tempArray[1]);

			break;
		case "N":
			if(curX - Integer.parseInt(tempArray[1]) < 0) {
				return false;
			}
			
			for(int j=0; j<Integer.parseInt(tempArray[1]); j++) {
				if(board[tempX-(1 * (j+1))][curY] == 'X') {
					return false;
				}
			}

			curX -= Integer.parseInt(tempArray[1]);
			
			break;

		default:
			break;
		}

		return true;
	}
}
