package _�˰���.chapter4.���ȣ�������Ž��.Boggle;

public class Solution {
	static char[][] map = {
			{'U', 'R', 'L', 'P', 'M'},
			{'X', 'P', 'R', 'E', 'T'},
			{'G', 'I', 'A', 'R', 'T'},
			{'X', 'T', 'N', 'Z', 'Y'},
			{'X', 'O', 'Q', 'R', 'S'}
	};
	
	public static void main(String[] args) {
		String word = "PRETTY";
	
		System.out.println(word.substring(1));
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map.length; j++) {
				if(hasWord(i, j, word)) {
					System.out.println("�ֳ׿�");
				}
			}
		}
		
	}

	static int[] dx = { -1, -1, -1, 1, 1, 1, 0, 0 };
	static int[] dy = { -1, 0, 1, -1, 0, 1, -1, 1 };

	static boolean hasWord(int x, int y, String word) {
		// ���� ���� ���� ������ return
		if(x <0 || y< 0 || x >= map.length || y >= map.length) return false;
		
		// ù���ڰ� ���� ������ ����
		if(map[x][y] != word.charAt(0)) return false;
		
		// ���ڰ� �ѱ��ڸ� ������ ����
		if(word.length() == 1) {
			return true;
		}
		
		System.out.println("x : " + x + " y : " + y + " word : " + word);
		
		// Ž��
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(hasWord(nx, ny, word.substring(1))) {
				return true;
			}
		}

		return false;
	}
}
