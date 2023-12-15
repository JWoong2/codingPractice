package �˰��򷦽�.����4;

import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] bingo = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		// ���ڰ� ���ö����� �ѹ��� �˻�?

		for (int k = 0; k < 25; k++) {
			int ans = sc.nextInt();
			int count = 0;

			//���� ������ ���� �� 0���� �����
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if(bingo[i][j] == ans) {
						bingo[i][j] = 0;
					}
				}
			}
			
			int[] row = new int[5];
			int[] col = new int[5];
			int[] cross = new int[2];
			
			//���� ī��Ʈ
			
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if(bingo[i][j] == 0) {
						row[i]++;
						col[i]++;
						if(i==j) cross[0]++;
						if(i+j ==4) cross[1]++; 
					}
				}
			}	
			
			if(cross[0] == 5) count++;
			if(cross[1] == 5) count++;
			
			for(int i=0; i<5; i++) {
				if(row[i] == 5) {
					count++;
				}
				if(col[i] == 5) {
					count++;
				}
			}
			
			System.out.println(count);
			if(count>=3) {
				System.out.println(k+1);
				break;
			}
		}
	}
}
