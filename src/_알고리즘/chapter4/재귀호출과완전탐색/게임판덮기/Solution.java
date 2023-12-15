package _알고리즘.chapter4.재귀호출과완전탐색.게임판덮기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		for(int i=0; i<H; i++) {
			board.add(new ArrayList<>());
		}
		
		for(int i=0; i<H; i++) {
			String temp = sc.next();
			
			for(char c : temp.toCharArray()) {
				if(c == '#') {
					board.get(i).add(1);	
				}else {
					board.get(i).add(0);
				}
			}
		}
		
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).size(); j++) {
				System.out.print(board.get(i).get(j));
			}
			System.out.println();
		}
		
		// cover 로 실행시켜서 2중 포문으로 위에서부터 탐색한다.
		// 4가지 coverType 중 하나를 설정하여 set 으로 보낸다.  
		// set에서 delta로 값을 더해주고 돌아올땐 delta를 빼준다.
		 System.out.println(cover(board));
		
	}
	static List<List<Integer>> board = new ArrayList<List<Integer>>();
	static int[][][] coverType = { 
			{ { 0, 0 }, { 1, 0 }, { 0, 1 } }, // (b)
			{ { 0, 0 }, { 0, 1 }, { 1, 1 } }, // (c)
			{ { 0, 0 }, { 1, 0 }, { 1, 1 } }, // (d)
			{ { 0, 0 }, { 1, 0 }, { 1, -1 } } // (e)
	};

	// board의 (y,x)를 type번 방법으로 덮거나, 덮었던 블록을 없앤다.
	// delta = 1 이면 덮고, -1이면 덮었던 블록을 없앤다.
	// 만약 블록이 제대로 덮이지 않은 경우 (게임판 밖으로 나가거나, 겹치거나, 검은 칸을 덮을때) false 를 반환한다.
	public static boolean set(int y, int x, int type, int delta) {
		boolean ok = true;

		for (int i = 0; i < 3; i++) {
			int ny = y + coverType[type][i][0];
			int nx = x + coverType[type][i][1];

			if (ny < 0 || ny >= board.size() || nx < 0 || nx >= board.get(0).size()) {
				ok = false;
			}else {
				board.get(ny).set(nx, board.get(ny).get(nx) + delta);	
				if (board.get(ny).get(nx) > 1) {
					ok = false;
				}	
			}
		}

		return ok;
	}

	// board의 모든 빈 칸을 덮을 수 있는 방법의 수를 반환한다.
	// board[i][j] = 1 이미 덮인 칸 혹은 검은 칸
	// board[i][j] = 0 아직 더피지 않은 칸
	public static int cover(List<List<Integer>> board) {
		// 아직 채우지 못한 칸 중 가장 윗줄 왼쪽에 있는 칸을 찾는다.
		int y = -1, x = -1;
		for (int i = 0; i < board.size(); i++) {
			for (int j = 0; j < board.get(i).size(); j++) {
				if (board.get(i).get(j) == 0) {
					y = i;
					x = j;
					break;
				}
			}
			
			if (y != -1)
				break;
		}

		// 기저 사례 : 모든 칸을 채웠으면 1을 반환한다.
		if (y == -1)
			return 1;
		
		int ret = 0;
		
		for (int type = 0; type < 4; type++) {
			// 만약 board[[y][x]를 type 형태로 덮을 수 있으면 재귀 호출한다.
			if (set(y, x, type, 1)) {
				ret += cover(board);
			}

			set(y, x, type, -1);
		}

		return ret;
	}

}
