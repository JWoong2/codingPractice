package _�����ڵ�ç����.������ȯ�ݺ��ϱ�;

class Solution {
	public static void main(String[] args) {
		int[] ans = solution("110010101001");
		
		for(int i : ans) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(String s) {
		int[] answer = new int[2];

		int loopCount = 0;
		int zeroCount = 0;
		// s �� 1�� ������ ������
		while (!s.equals("1")) {
			loopCount++;
			String temp = "";

			// ��� 0 ����
			for (char c : s.toCharArray()) {
				if (c == '1') {
					temp += '1';
				}else {
					zeroCount++;
				}
			}
			
			// ���� -> �������� ��ȯ
			int tempLength = temp.length();
			
			s = Integer.toBinaryString(tempLength);
		}
		
		answer[0] = loopCount;
		answer[1] = zeroCount;

		return answer;
	}
}