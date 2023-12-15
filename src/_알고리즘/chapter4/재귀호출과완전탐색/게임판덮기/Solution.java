package _�˰���.chapter4.���ȣ�������Ž��.�����ǵ���;

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
		
		// cover �� ������Ѽ� 2�� �������� ���������� Ž���Ѵ�.
		// 4���� coverType �� �ϳ��� �����Ͽ� set ���� ������.  
		// set���� delta�� ���� �����ְ� ���ƿö� delta�� ���ش�.
		 System.out.println(cover(board));
		
	}
	static List<List<Integer>> board = new ArrayList<List<Integer>>();
	static int[][][] coverType = { 
			{ { 0, 0 }, { 1, 0 }, { 0, 1 } }, // (b)
			{ { 0, 0 }, { 0, 1 }, { 1, 1 } }, // (c)
			{ { 0, 0 }, { 1, 0 }, { 1, 1 } }, // (d)
			{ { 0, 0 }, { 1, 0 }, { 1, -1 } } // (e)
	};

	// board�� (y,x)�� type�� ������� ���ų�, ������ ����� ���ش�.
	// delta = 1 �̸� ����, -1�̸� ������ ����� ���ش�.
	// ���� ����� ����� ������ ���� ��� (������ ������ �����ų�, ��ġ�ų�, ���� ĭ�� ������) false �� ��ȯ�Ѵ�.
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

	// board�� ��� �� ĭ�� ���� �� �ִ� ����� ���� ��ȯ�Ѵ�.
	// board[i][j] = 1 �̹� ���� ĭ Ȥ�� ���� ĭ
	// board[i][j] = 0 ���� ������ ���� ĭ
	public static int cover(List<List<Integer>> board) {
		// ���� ä���� ���� ĭ �� ���� ���� ���ʿ� �ִ� ĭ�� ã�´�.
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

		// ���� ��� : ��� ĭ�� ä������ 1�� ��ȯ�Ѵ�.
		if (y == -1)
			return 1;
		
		int ret = 0;
		
		for (int type = 0; type < 4; type++) {
			// ���� board[[y][x]�� type ���·� ���� �� ������ ��� ȣ���Ѵ�.
			if (set(y, x, type, 1)) {
				ret += cover(board);
			}

			set(y, x, type, -1);
		}

		return ret;
	}

}
