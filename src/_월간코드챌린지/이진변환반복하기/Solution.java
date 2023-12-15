package _월간코드챌린지.이진변환반복하기;

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
		// s 가 1과 같아질 때까지
		while (!s.equals("1")) {
			loopCount++;
			String temp = "";

			// 모든 0 제거
			for (char c : s.toCharArray()) {
				if (c == '1') {
					temp += '1';
				}else {
					zeroCount++;
				}
			}
			
			// 길이 -> 이진으로 변환
			int tempLength = temp.length();
			
			s = Integer.toBinaryString(tempLength);
		}
		
		answer[0] = loopCount;
		answer[1] = zeroCount;

		return answer;
	}
}