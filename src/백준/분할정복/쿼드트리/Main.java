package 백준.분할정복.쿼드트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int white = 0;
	public static int black = 0;
	public static int[][] board;
	public static String answer = "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		
		for(int i=0; i<n; i++) { 
			String input = br.readLine();	
			board[i] = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
		}
	
		partition(0, 0, n);
		System.out.println(answer);
		
	}
	
	public static void partition(int row, int col, int size) {
		if(colorCheck(row,col,size)) {
			if(board[row][col] == 0) {
				answer += "0";
			}else {
				answer += "1";
			}
			
			return;
		}else {
			answer += "(";
		}
		
		int halfSize = size / 2;
		partition(row, col, halfSize);
		partition(row, col + halfSize, halfSize);
		partition(row + halfSize, col, halfSize);
		partition(row + halfSize, col + halfSize, halfSize);
		answer += ")";
	}
	
	public static boolean colorCheck(int row, int col, int size) {
		int color = board[row][col];
		
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(board[i][j] != color) {
					return false;
				}
			}
		}
		
		return true;
	}
}
