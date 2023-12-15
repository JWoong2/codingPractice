package 백준.분할정복.종이의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static int minus = 0;
	public static int zero = 0;
	public static int plus = 0;
	public static int[][] board;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		
		for(int i=0; i<n; i++) { 
			String input = br.readLine();	
			board[i] = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
		}
	
		partition(0, 0, n);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(plus);
		
	}
	
	public static void partition(int row, int col, int size) {
		if(colorCheck(row,col,size)) {
			if(board[row][col] == 0) {
				zero++;
			}else if(board[row][col] == 1) {
				plus++;
			}else {
				minus++;
			}
			
			return;
		}
		
		int thirdSize = size / 3;
		partition(row, col, thirdSize);
		partition(row, col + thirdSize, thirdSize);
		partition(row, col + (2*thirdSize), thirdSize);
		
		partition(row + thirdSize, col, thirdSize);
		partition(row + thirdSize, col + thirdSize, thirdSize);
		partition(row + thirdSize, col + (2*thirdSize), thirdSize);
		
		partition(row + (2*thirdSize), col, thirdSize);
		partition(row + (2*thirdSize), col + thirdSize, thirdSize);
		partition(row + (2*thirdSize), col + (2*thirdSize), thirdSize);
		
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
